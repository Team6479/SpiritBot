package org.usfirst.frc.team6479.robot.commands;

import org.usfirst.frc.team6479.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class CycleLightBackward extends InstantCommand {

	public CycleLightBackward() {
		requires(Robot.lights);
	}
	@Override
	public void execute() {
		Robot.lights.cycleBackwardLightstrip();
	}

}
