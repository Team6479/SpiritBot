/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/** Add your docs here. */
public class Cannon extends Subsystem {
  private Relay cannonRelay;
  private AnalogInput pressureSensor;

  public Cannon() {
    cannonRelay = new Relay(RobotMap.CANNON_RELAY);
    pressureSensor = new AnalogInput(RobotMap.PRESSURE_SENSOR);
  }

  public double getRawPressure() {
    return pressureSensor.getVoltage();
  }

  /**
   * This algorithm seems like it has magic numbers because it does.
   *
   * @see <a href="http://www.revrobotics.com/content/docs/REV-11-1107-DS.pdf">Spec Sheet</a>
   */
  public double getPressure() {
    final double ANALOG_VOLTAGE = 5.0; // analog ports supply +5V
    return ((getRawPressure() / ANALOG_VOLTAGE) - 0.1) / 0.004;
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
    if (this.getOpen()) {
      this.close();
    } else {
      this.open();
    }
  }

  @Override
  public void initDefaultCommand() {}
}
