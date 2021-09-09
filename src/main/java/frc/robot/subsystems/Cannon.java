// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.CannonConstants;

/** Add your docs here. */
public class Cannon extends SubsystemBase {
  private Solenoid cannon;

  public Cannon() {
    cannon = new Solenoid(CannonConstants.CANNON_RELAY);
  }

  public void open() {
    cannon.set(true);
  }

  public void close() {
    cannon.set(false);
  }

  public boolean getOpen() {
    return cannon.get() == true;
  }

  public void toggle() {
    if (cannon.get() == true) {
      this.close();
    } else {
      this.open();
    }
  }
}
