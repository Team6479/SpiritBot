package org.usfirst.frc.team6479.robot.subsystems;

import org.usfirst.frc.team6479.robot.RobotMap;
import org.usfirst.frc.team6479.robot.commands.RacingDrive;
import org.usfirst.frc.team6479.robot.customwpi.CustomDrive;
import org.usfirst.frc.team6479.robot.customwpi.MultiSpeedController;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {
	
	private Spark leftMotor1 = new Spark(RobotMap.leftMotor1);
	private Spark leftMotor2 = new Spark(RobotMap.leftMotor2);
	private Spark rightMotor1 = new Spark(RobotMap.rightMotor1);
	private Spark rightMotor2 = new Spark(RobotMap.rightMotor2);
	
	private MultiSpeedController leftSide = new MultiSpeedController(leftMotor1, leftMotor2);
	private MultiSpeedController rightSide = new MultiSpeedController(rightMotor1, rightMotor2);
	
	private CustomDrive drive = new CustomDrive(leftSide, rightSide);

	public void initDefaultCommand() {
		setDefaultCommand(new RacingDrive());
	}
	public void drive(double turn, double throttle) {
		drive.arcadeDrive(turn, throttle);
	}
}
