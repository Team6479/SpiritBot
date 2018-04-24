package org.usfirst.frc.team6479.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	//PWM
	public static final int leftMotorFrontPort = 0;
	public static final int leftMotorBackPort = 1;
	public static final int rightMotorFrontPort = 2;
	public static final int rightMotorBackPort = 3;
	public static final int lightstripPort = 4;
	//END PWM
	
	//RELAY
	public static final int cannonSolenoidPort = 0;
	public static final int spotlightPort = 1;
	//END RELAY
	
	
}
