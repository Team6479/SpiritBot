/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.TeleopDrive;

/** Add your docs here. */
public class Drivetrain extends Subsystem {
  private SpeedController leftFront;
  private SpeedController rightFront;
  private SpeedController leftBack;
  private SpeedController rightBack;
  private SpeedControllerGroup left;
  private SpeedControllerGroup right;

  private DifferentialDrive drive;

  public Drivetrain() {
    leftFront = new Spark(RobotMap.DRIVETRAIN_LEFT_FRONT);
    rightFront = new Spark(RobotMap.DRIVETRAIN_RIGHT_FRONT);
    leftBack = new Spark(RobotMap.DRIVETRAIN_LEFT_BACK);
    rightBack = new Spark(RobotMap.DRIVETRAIN_RIGHT_BACK);

    left = new SpeedControllerGroup(leftFront, leftBack);
    right = new SpeedControllerGroup(rightFront, rightBack);

    drive = new DifferentialDrive(left, right);
  }

  public DifferentialDrive getDrive() {
    return drive;
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new TeleopDrive());
  }
}
