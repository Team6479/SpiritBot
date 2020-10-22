/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class FireToggle extends CommandGroup {
  /**
   * This was created for the purpose of doing lighting things.
   */
  public FireToggle() {
    addSequential(new InstantCommand(Robot.cannon, Robot.cannon::toggle));
    addSequential(new InstantCommand(Robot.ledLighting, Robot.ledLighting::toggle()));
  }
}
