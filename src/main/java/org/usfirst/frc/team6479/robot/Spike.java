package org.usfirst.frc.team6479.robot;

import edu.wpi.first.wpilibj.Relay;

//wraps around a relay (spike) to provide useful interface
public class Spike extends Relay {

	public Spike(int port) {
		super(port);
	}
	public void toggle() {
		if(get() == Value.kOff) {
			set(Value.kForward);
		}
		else {
			set(Value.kOff);
		}
	}
	public void on() {
		set(Value.kForward);
	}
	public void off() {
		set(Value.kOff);
	}

}
