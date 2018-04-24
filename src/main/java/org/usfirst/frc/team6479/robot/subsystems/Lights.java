package org.usfirst.frc.team6479.robot.subsystems;

import org.usfirst.frc.team6479.robot.BlinkinLEDDriver;
import org.usfirst.frc.team6479.robot.RobotMap;
import org.usfirst.frc.team6479.robot.Spike;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Lights extends Subsystem {

	private Spike spotlight;
	private BlinkinLEDDriver lightstrip;
	
	public Lights() {
		spotlight = new Spike(RobotMap.spotlightPort);
		lightstrip = new BlinkinLEDDriver(RobotMap.lightstripPort);
	}
	@Override
	protected void initDefaultCommand() {
		
	}
	
	public void toggleSpotlight() {
		spotlight.toggle();
	}
	public void onSpotlight() {
		spotlight.on();
	}
	public void offSpotlight() {
		spotlight.off();
	}
	public void cycleForwardLightstrip() {
		lightstrip.cycleForward();
	}
	public void cycleBackwardLightstrip() {
		lightstrip.cycleBackward();
	}

}
