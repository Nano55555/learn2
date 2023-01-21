// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveSubsystem;

public class JoystickDrive extends CommandBase {
  private static XboxController driveController =RobotContainer.driverController;
  private DriveSubsystem driveSubsystem = new DriveSubsystem();

  /** Creates a new JoystickDrive. */
  public JoystickDrive(DriveSubsystem drivetrain) {
    driveSubsystem=drivetrain;
    addRequirements(driveSubsystem);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double throttle = driveController.getLeftY();
    double rotate = driveController.getRightX();

    if ((throttle> 0 && throttle<0.25) || (throttle>-0.25 && throttle <0)){
      throttle = 0;
    }
    else {throttle = throttle*0.5;}
    if ((rotate> 0 && rotate<0.25) || (rotate>-0.25 && rotate <0)){
      rotate = 0;
    }
    else {rotate = rotate*0.5;}
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
