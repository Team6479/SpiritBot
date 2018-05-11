package org.usfirst.frc.team6479.robot.subsystems;

import org.usfirst.frc.team6479.robot.RobotMap;
import org.usfirst.frc.team6479.robot.Spike;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

//the cannon
public class Cannon extends Subsystem {
	
	private Spike solenoid;
	
	public Cannon() {
		solenoid = new Spike(RobotMap.cannonSolenoidPort);
	}

	@Override
	protected void initDefaultCommand() {
		
	}

	public void toggle() {
		solenoid.toggle();
	}
	public Spike getSolenoid() {
		return solenoid;
	}
}
