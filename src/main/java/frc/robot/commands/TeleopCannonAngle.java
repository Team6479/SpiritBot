// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.CannonAngle;

public class TeleopCannonAngle extends CommandBase {
  private CannonAngle cannonAngle;
  private DoubleSupplier left;
  private DoubleSupplier right;

  public TeleopCannonAngle(CannonAngle cannonAngle, DoubleSupplier left, DoubleSupplier right) {
    this.cannonAngle = cannonAngle;

    this.left = left;
    this.right = right;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(cannonAngle);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    cannonAngle.set(right.getAsDouble(), left.getAsDouble());
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
