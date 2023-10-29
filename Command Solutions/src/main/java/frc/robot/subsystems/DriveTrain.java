// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.sensors.Pigeon2;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */
  TalonFX leftFront;
  TalonFX rightFront;
  TalonFX rightBack;
  TalonFX leftBack;
  
  Pigeon2 pigeon;
  public DriveTrain() {

    leftFront = new TalonFX(0);
    leftBack = new TalonFX(1);
    rightFront = new TalonFX(2);
    rightBack = new TalonFX(3);
      
    leftBack.follow(leftFront);
    rightBack.follow(rightFront);
    
    pigeon = new Pigeon2(6);
    
  }


  public void drive(double x, double y){
     leftFront.set(ControlMode.PercentOutput, x);
     rightFront.set(ControlMode.PercentOutput, y);


  }

  public void resetGyro(){
    pigeon.setYaw(0);
    
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run

    


  }
}
