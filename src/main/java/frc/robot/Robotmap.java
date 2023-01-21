// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

/** Add your docs here. */
public class Robotmap {    
    public static final WPI_TalonFX leftfrontmotor = new WPI_TalonFX(3);
    public static final WPI_TalonFX rightfrontmotor= new WPI_TalonFX(4);
    public static final WPI_TalonFX leftbackmotor= new WPI_TalonFX(1);
    public static final WPI_TalonFX rightbackmotor = new WPI_TalonFX(2);
}
