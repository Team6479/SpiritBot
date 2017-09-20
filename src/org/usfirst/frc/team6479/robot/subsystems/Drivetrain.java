package org.usfirst.frc.team6479.robot.subsystems;

import org.usfirst.frc.team6479.robot.RobotMap;
import org.usfirst.frc.team6479.robot.commands.RacingDrive;
import org.usfirst.frc.team6479.robot.customwpi.CustomDrive;
import org.usfirst.frc.team6479.robot.customwpi.MultiSpeedController;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {
	
	private Spark leftMotorFront = new Spark(RobotMap.leftMotorFront);
	private Spark leftMotorBack = new Spark(RobotMap.leftMotorBack);
	private Spark rightMotorFront = new Spark(RobotMap.rightMotorFront);
	private Spark rightMotorBack = new Spark(RobotMap.rightMotorBack);
	
	private MultiSpeedController leftSide = new MultiSpeedController(true, leftMotorFront, leftMotorBack);
	private MultiSpeedController rightSide = new MultiSpeedController(false, rightMotorFront, rightMotorBack);
	
	private CustomDrive drive = new CustomDrive(leftSide, rightSide);

	public void initDefaultCommand() {
		setDefaultCommand(new RacingDrive());
	}
	public void drive(double turn, double throttle) {
		drive.arcadeDrive(turn, throttle);
	}
}
