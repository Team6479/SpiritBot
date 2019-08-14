/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into to a variable name.
 * This provides flexibility changing wiring, makes checking the wiring easier and significantly
 * reduces the number of magic numbers floating around.
 */
public class RobotMap {
  // Drivetrain Motors
  public static final int DRIVETRAIN_LEFT = 0;
  public static final int DRIVETRAIN_RIGHT = 1;

  // Solenoid
  public static final int SOLENOID_CANNON = 2;

  // Cannon Angle
  public static final int ANGLE_CANNON = 2;
}
