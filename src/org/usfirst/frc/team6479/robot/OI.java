package org.usfirst.frc.team6479.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());

	// refrence to the xbox controller
	private XboxController xbox = new XboxController(0);

	public OI() {
		// indiviual refrences to the xbox controllers buttons, does not include
		// triggers, joysticks, or dpad
		JoystickButton aButton = new JoystickButton(xbox, 1);
		JoystickButton bButton = new JoystickButton(xbox, 2);
		JoystickButton xButton = new JoystickButton(xbox, 3);
		JoystickButton yButton = new JoystickButton(xbox, 4);
		JoystickButton leftBumperButton = new JoystickButton(xbox, 5);
		JoystickButton rigthBumperButton = new JoystickButton(xbox, 6);
		JoystickButton backButton = new JoystickButton(xbox, 7);
		JoystickButton startButton = new JoystickButton(xbox, 8);
		JoystickButton leftStickButton = new JoystickButton(xbox, 9);
		JoystickButton rightStickButton = new JoystickButton(xbox, 10);
	}

	public XboxController getXbox() {
		return xbox;
	}

}
