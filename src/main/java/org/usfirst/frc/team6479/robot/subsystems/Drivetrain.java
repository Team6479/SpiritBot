package org.usfirst.frc.team6479.robot.subsystems;

import org.usfirst.frc.team6479.robot.RobotMap;
import org.usfirst.frc.team6479.robot.commands.RacingDrive;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

//the drive train of the robot
public class Drivetrain extends Subsystem implements SafeSubsystem {

	private SpeedController leftBack;
	private SpeedController rightBack;
	private SpeedController leftFront;
	private SpeedController rightFront;

	private SpeedController leftSide;
	private SpeedController rightSide;

	private DifferentialDrive drive;


	public Drivetrain() {

		leftBack = new Spark(RobotMap.leftMotorBack);
		rightBack = new Spark(RobotMap.rightMotorBack);
		leftFront = new Spark(RobotMap.leftMotorFront);
		rightFront = new Spark(RobotMap.rightMotorFront);

		leftSide = new SpeedControllerGroup(leftBack, leftFront);
		rightSide = new SpeedControllerGroup(rightBack, rightFront);

		drive = new DifferentialDrive(leftSide, rightSide);
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new RacingDrive());
	}
	public void racingDrive(double throttle, double turn) {
		drive.arcadeDrive(throttle, turn, false);
	}
    public SpeedController getLeftSideMotors() {
		return leftSide;
	}
	public SpeedController getRightSideMotors() {
		return rightSide;
	}

    @Override
	public void stop() {
		leftSide.set(0);
		rightSide.set(0);
	}
}
