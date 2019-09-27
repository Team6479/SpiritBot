/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/** Interacts with the (horribly designed) Blinkin' LED Driver from REV */
public class LedLighting extends Subsystem {
  private Spark blinkin;
  private Mode idleMode;
  private Mode loadedMode;

  public LedLighting() {
    blinkin = new Spark(RobotMap.REV_BLINKIN);
    idleMode = Mode.Orange;
    loadedMode = Mode.EndtoEndBlend;
  }

  public void setIdleMode(Mode mode) {
    idleMode = mode;
  }

  public void setLoadedMode(Mode mode) {
    loadedMode = mode;
  }

  public double get() {
    return blinkin.get();
  }

  public void set(double value) {
    blinkin.set(value);
  }

  public void set(Mode mode) {
    this.set(mode.value);
  }

  public void toggle() {
    this.set((this.get() == idleMode.value) ? loadedMode : idleMode);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  /**
   * This is a lightly modified version of the enum from commit
   * e541d4e81c8204ff47805c00a963d08427906132. That is legacy code that I largely don't understand,
   * and it seems to be written jankily. Many of the features were removed and this was designed to
   * contain everything necessary within a subsystem, rather than a seperate class. This shouldn't
   * negatively impact the funtionality we use.
   */
  public static enum Mode {
    RainbowRainbowPalette(-0.99),
    RainbowPartyPalette(-0.97),
    RainbowOceanPalette(-0.95),
    RainbowLavePalette(-0.93),
    RainbowForestPalette(-0.91),
    RainbowwithGlitter(-0.89),
    Confetti(-0.87),
    ShotRed(-0.85),
    ShotBlue(-0.83),
    ShotWhite(-0.81),
    SinelonRainbowPalette(-0.79),
    SinelonPartyPalette(-0.77),
    SinelonOceanPalette(-0.75),
    SinelonLavaPalette(-0.73),
    SinelonForestPalette(-0.71),
    BeatsperMinuteRainbowPalette(-0.69),
    BeatsperMinutePartyPalette(-0.67),
    BeatsperMinuteOceanPalette(-0.65),
    BeatsperMinuteLavaPalette(-0.63),
    BeatsperMinuteForestPalette(-0.61),
    FireMedium(-0.59),
    FireLarge(-0.57),
    TwinklesRainbowPalette(-0.55),
    TwinklesPartyPalette(-0.53),
    TwinklesOceanPalette(-0.51),
    TwinklesLavaPalette(-0.49),
    TwinklesForestPalette(-0.47),
    ColorWavesRainbowPalette(-0.45),
    ColorWavesPartyPalette(-0.43),
    ColorWavesOceanPalette(-0.41),
    ColorWavesLavaPalette(-0.39),
    ColorWavesForestPalette(-0.37),
    LarsonScannerRed(-0.35),
    LarsonScannerGray(-0.33),
    LightChaseRed(-0.31),
    LightChaseBlue(-0.29),
    LightChaseGray(-0.27),
    HeartbeatRed(-0.25),
    HeartbeatBlue(-0.23),
    HeartbeatWhite(-0.21),
    HeartbeatGray(-0.19),
    BreathRed(-0.17),
    BreathBlue(-0.15),
    BreathGray(-0.13),
    StrobeRed(-0.11),
    StrobeBlue(-0.09),
    StrobeGold(-0.07),
    StrobeWhite(-0.05),
    EndtoEndBlendtoBlack1(-0.03),
    LarsonScanner1(-0.01),
    LightChase1(0.01),
    HeartbeatSlow1(0.03),
    HeartbeatMedium1(0.05),
    HeartbeatFast1(0.07),
    BreathSlow1(0.09),
    BreathFast1(0.11),
    Shot1(0.13),
    Strobe1(0.15),
    EndtoEndBlendtoBlack2(0.17),
    LarsonScanner2(0.19),
    LightChase2(0.21),
    HeartbeatSlow2(0.23),
    HeartbeatMedium2(0.25),
    HeartbeatFast2(0.27),
    BreathSlow2(0.29),
    BreathFast2(0.31),
    Shot2(0.33),
    Strobe2(0.35),
    SparkleColor1onColor2(0.37),
    SparkleColor2onColor1(0.39),
    ColorGradientColor1and2(0.41),
    BeatsperMinuteColor1and2(0.43),
    EndtoEndBlendColor1to2(0.45),
    EndtoEndBlend(0.47),
    Color1andColor2noblendingSetupPattern(0.49),
    TwinklesColor1and2(0.51),
    ColorWavesColor1and2(0.53),
    SinelonColor1and2(0.55),
    HotPink(0.57),
    Darkred(0.59),
    Red(0.61),
    RedOrange(0.63),
    Orange(0.65),
    Gold(0.67),
    Yellow(0.69),
    LawnGreen(0.71),
    Lime(0.73),
    DarkGreen(0.75),
    Green(0.77),
    BlueGreen(0.79),
    Aqua(0.81),
    SkyBlue(0.83),
    DarkBlue(0.85),
    Blue(0.87),
    BlueViolet(0.89),
    Violet(0.91),
    White(0.93),
    Gray(0.95),
    DarkGray(0.97),
    Black(0.99),
    UNKNOWN(0);

    public double value;

    Mode(double value) {
      this.value = value;
    }
  }
}
