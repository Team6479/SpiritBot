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
  public static final int DRIVETRAIN_LEFT_FRONT = 0;
  public static final int DRIVETRAIN_RIGHT_FRONT = 2;
  public static final int DRIVETRAIN_LEFT_BACK = 1;
  public static final int DRIVETRAIN_RIGHT_BACK = 3;

  // Solenoid
  public static final int CANNON_RELAY = 0;

  // Cannon Angle
  public static final int ANGLE_CANNON = 2;

  // LED Lighting
  public static final int REV_BLINKIN = 4;
}
