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
  private Relay cannonSol;

  public Cannon() {
    cannonSol = new Relay(RobotMap.SOLENOID_CANNON);
  }

  public void open() {
    cannonSol.set(Relay.Value.kOn);
  }

  public void close() {
    cannonSol.set(Relay.Value.kOff);
  }

  public void toggle() {
    Relay.Value state = cannonSol.get();
    if (state == Relay.Value.kOn) {
      this.close();
    } else {
      this.open();
    }
  }

  @Override
  public void initDefaultCommand() {}
}
