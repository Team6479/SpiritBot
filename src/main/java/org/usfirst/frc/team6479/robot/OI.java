package org.usfirst.frc.team6479.robot;

import edu.wpi.first.wpilibj.XboxController;
import robot.xbox.ButtonTracker;
import robot.xbox.XboxMap;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	private XboxController xbox;
	private ButtonTracker aButton;

	public OI() {
		xbox = new XboxController(0);
		aButton = new ButtonTracker(xbox, XboxMap.AButton);
	}

	public XboxController getXbox() {
		return xbox;
	}
	public ButtonTracker getAButton() {
		return aButton;
	}

}
