// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import com.team6479.lib.controllers.CBXboxController;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.CannonAngle;

public class TeleopCannonAngle extends CommandBase {
  /** Creates a new CannonAngle. */

  private CBXboxController xbox;
  private CannonAngle cannonAngle;

  public TeleopCannonAngle(CannonAngle cannonAngle, CBXboxController xbox) {
    this.xbox = xbox;
    this.cannonAngle = cannonAngle;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(this.cannonAngle);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double left = xbox.getTriggerAxis(Hand.kLeft);
    double right = xbox.getTriggerAxis(Hand.kRight);
    cannonAngle.set(right, left);
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
