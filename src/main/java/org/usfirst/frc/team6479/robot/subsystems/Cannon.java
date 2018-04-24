package org.usfirst.frc.team6479.robot.subsystems;

import org.usfirst.frc.team6479.robot.RobotMap;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

//the cannon
public class Cannon extends Subsystem implements SafeSubsystem {
	
	private Relay solenoid;
	
	
	public Cannon() {
		solenoid = new Relay(RobotMap.cannonSolenoidPort);
	}

	@Override
	public void stop() {
		
	}

	@Override
	protected void initDefaultCommand() {
		
	}
}
