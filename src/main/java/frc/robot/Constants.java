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
public class Constants {
  public class DrivetrainConstants {
    public static final int LEFT_FRONT = 0;
    public static final int RIGHT_FRONT = 2;
    public static final int LEFT_BACK = 1;
    public static final int RIGHT_BACK = 3;
  }

  public class CannonConstants {
    public static final int CANNON_RELAY = 0;
    public static final int ANGLE_CANNON = 5;
  }
}
