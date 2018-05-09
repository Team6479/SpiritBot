package org.usfirst.frc.team6479.robot;

import org.usfirst.frc.team6479.robot.commands.CycleLightBackward;
import org.usfirst.frc.team6479.robot.commands.CycleLightForward;
import org.usfirst.frc.team6479.robot.commands.FireCannon;
import org.usfirst.frc.team6479.robot.commands.ToggleSpotlight;

import edu.wpi.first.wpilibj.XboxController;
import robot.xbox.ButtonTracker;
import robot.xbox.XboxMap;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	private XboxController xbox;
	private ButtonTracker aButton, bButton, xButton, yButton;

	public OI() {
		xbox = new XboxController(0);
		//to fire robot
		aButton = new ButtonTracker(xbox, XboxMap.AButton);
		aButton.toggleWhenPressed(new FireCannon());
		
		//toggle forwrd through light strip
		bButton = new ButtonTracker(xbox, XboxMap.BButton);
		bButton.toggleWhenPressed(new CycleLightForward());
		//toggle backward through light strip
		xButton = new ButtonTracker(xbox, XboxMap.XButton);
		xButton.toggleWhenPressed(new CycleLightBackward());
		//toggle spotlight
		yButton = new ButtonTracker(xbox, XboxMap.YButton);
		yButton.toggleWhenPressed(new ToggleSpotlight());
	}

	public XboxController getXbox() {
		return xbox;
	}
	public ButtonTracker getAButton() {
		return aButton;
	}

	public ButtonTracker getBButton() {
		return bButton;
	}

	public ButtonTracker getXButton() {
		return xButton;
	}

	public ButtonTracker getYButton() {
		return yButton;
	}

}
