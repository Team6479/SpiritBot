
package org.usfirst.frc.team6479.robot;

import org.usfirst.frc.team6479.robot.subsystems.Cannon;
import org.usfirst.frc.team6479.robot.subsystems.Drivetrain;
import org.usfirst.frc.team6479.robot.subsystems.Lights;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends IterativeRobot {

	public static OI oi;
	public static Drivetrain drivetrain;
	public static Cannon cannon;
	public static Lights lights;

	@Override
	public void robotInit() {
		drivetrain = new Drivetrain();
		cannon = new Cannon();
		lights = new Lights();

		//OI Must be last
		oi = new OI();
	}
	@Override
	public void teleopInit() {

	}
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		System.out.println(lights.getMode().value);
	}
	@Override
	public void disabledPeriodic() {
		lights.setMode(BlinkinLEDDriver.Mode.Orange);
	}
}
