// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.CannonConstants;

/** Add your docs here. */
public class CannonAngle extends SubsystemBase {
  private Spark angle;
  private double speed;
  public final double DEFAULT_SPEED = 0.3;

  public CannonAngle() {
    angle = new Spark(CannonConstants.ANGLE_CANNON);
    speed = DEFAULT_SPEED;
  }

  public double getSpeed() {
    return speed;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
  }


  public void set(double right, double left) {
    angle.set(speed * (right - left));
  }

}
