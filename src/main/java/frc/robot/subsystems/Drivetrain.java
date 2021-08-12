// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DrivetrainConstants;

/** Add your docs here. */
public class Drivetrain extends SubsystemBase {
  private SpeedController leftFront;
  private SpeedController rightFront;
  private SpeedController leftBack;
  private SpeedController rightBack;
  private SpeedControllerGroup left;
  private SpeedControllerGroup right;

  private DifferentialDrive drive;

  public Drivetrain() {
    leftFront = new Spark(DrivetrainConstants.LEFT_FRONT);
    rightFront = new Spark(DrivetrainConstants.RIGHT_FRONT);
    leftBack = new Spark(DrivetrainConstants.LEFT_BACK);
    rightBack = new Spark(DrivetrainConstants.RIGHT_BACK);

    left = new SpeedControllerGroup(leftFront, leftBack);
    right = new SpeedControllerGroup(rightFront, rightBack);

    drive = new DifferentialDrive(left, right);
  }

  public DifferentialDrive getDrive() {
    return drive;
  }
}
