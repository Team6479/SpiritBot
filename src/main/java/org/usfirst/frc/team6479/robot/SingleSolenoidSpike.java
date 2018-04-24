package org.usfirst.frc.team6479.robot;

import edu.wpi.first.wpilibj.Relay;

//wraps around a relay (spike) to run a single solenoid
public class SingleSolenoidSpike extends Relay {

	public SingleSolenoidSpike(int port) {
		super(port);
	}

}
