
package org.usfirst.frc.team6479.robot;

import org.usfirst.frc.team6479.robot.subsystems.Cannon;
import org.usfirst.frc.team6479.robot.subsystems.Drivetrain;
import org.usfirst.frc.team6479.robot.subsystems.Lights;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends IterativeRobot {

	public static OI oi;
	public static Drivetrain drivetrain;
	public static Cannon cannon;
	public static Lights lights;

	@Override
	public void robotInit() {
		oi = new OI();
		drivetrain = new Drivetrain();
		cannon = new Cannon();
		lights = new Lights();
	}
	@Override
	public void teleopInit() {

	}
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}
	@Override
	public void disabledPeriodic() {
		
	}
}
