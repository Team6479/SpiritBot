/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/** Add your docs here. */
public class Cannon extends Subsystem {
  private Relay cannonRelay;

  public Cannon() {
    cannonRelay = new Relay(RobotMap.CANNON_RELAY);
  }

  public void open() {
    cannonRelay.set(Relay.Value.kForward);
  }

  public void close() {
    cannonRelay.set(Relay.Value.kOff);
  }

  public void toggle() {
    if (cannonRelay.get() == Relay.Value.kForward) {
      this.close();
    } else {
      this.open();
    }
  }

  @Override
  public void initDefaultCommand() {}
}
