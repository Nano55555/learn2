// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Robotmap;

public class DriveSubsystem extends SubsystemBase {
  private static final WPI_TalonFX leftfrontmotor = Robotmap.leftfrontmotor;
  private static final WPI_TalonFX leftbackmotor = Robotmap.leftbackmotor;
  private static final WPI_TalonFX rightfrontmotor = Robotmap.rightfrontmotor;
  private static final WPI_TalonFX rightbackmotor = Robotmap.rightbackmotor;
  /** Creates a new DriveSubsystem. */
  public DriveSubsystem() {
    leftfrontmotor.set(ControlMode.Follower, leftbackmotor.getDeviceID());
    leftfrontmotor.set(ControlMode.Follower, leftbackmotor.getDeviceID());

    leftbackmotor.setInverted(true);
    leftfrontmotor.setInverted(true);
    rightbackmotor.setInverted(false);
    rightbackmotor.setInverted(false);


  }
  public void drive(double throttle, double rotate){
    leftbackmotor.set(throttle + rotate);
    rightbackmotor.set(throttle - rotate);
    leftfrontmotor.set(throttle + rotate);
    rightfrontmotor.set(throttle -rotate);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
