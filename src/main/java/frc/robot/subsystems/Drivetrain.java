/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.TeleopDrive;

/** Add your docs here. */
public class Drivetrain extends Subsystem {
  private SpeedController left;
  private SpeedController right;

  private DifferentialDrive drive;

  public Drivetrain() {
    left = new Spark(RobotMap.DRIVETRAIN_LEFT);
    right = new Spark(RobotMap.DRIVETRAIN_RIGHT);

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
