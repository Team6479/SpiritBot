package org.usfirst.frc.team6479.robot;

import edu.wpi.first.wpilibj.Relay;

//wraps around a relay (spike) to provide useful interface
public class Spike extends Relay {

	public Spike(int port) {
		super(port);
		//set the orientations of the spike
		//M+ 12V, M- GND
		set(Value.kForward);
		//default is off
		set(Value.kReverse);
	}
	public void toggle() {
		if(get() == Value.kReverse) {
			set(Value.kForward);
		}
		else {
			set(Value.kReverse);
		}
	}
	public void on() {
		set(Value.kForward);
	}
	public void off() {
		set(Value.kReverse);
	}

}
