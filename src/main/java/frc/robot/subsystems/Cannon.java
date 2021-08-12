// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.CannonConstants;

/** Add your docs here. */
public class Cannon extends SubsystemBase {
  private Relay cannonRelay;

  public Cannon() {
    cannonRelay = new Relay(CannonConstants.CANNON_RELAY);
  }

  public void open() {
    cannonRelay.set(Relay.Value.kForward);
  }

  public void close() {
    cannonRelay.set(Relay.Value.kOff);
  }

  public boolean getOpen() {
    return cannonRelay.get() == Relay.Value.kForward;
  }

  public void toggle() {
    if (cannonRelay.get() == Relay.Value.kForward) {
      this.close();
    } else {
      this.open();
    }
  }
}
