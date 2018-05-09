package org.usfirst.frc.team6479.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;
import org.usfirst.frc.team6479.robot.Robot;

public class FireCannon extends InstantCommand {

	public FireCannon() {
		requires(Robot.cannon);
	}
	@Override
	public void execute() {
		Robot.cannon.toggle();
	}
}
