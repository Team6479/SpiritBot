/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Solenoid;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Cannon extends Subsystem {
  private Solenoid cannonSol;

  public Cannon() {
    cannonSol = new Solenoid(RobotMap.SOLENOID_CANNON);
  }

  public void open() {
    cannonSol.set(true);
  }

  public void closed() {
    cannonSol.set(false);
  }

  public void toggle() {
    boolean state = cannonSol.get();
    if (state) {
      this.close();
    } else {
      this.open();
    }
  }

  @Override
  public void initDefaultCommand() {
  }
}
