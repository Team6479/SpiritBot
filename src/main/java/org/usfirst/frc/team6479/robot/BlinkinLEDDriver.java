package org.usfirst.frc.team6479.robot;

import edu.wpi.first.wpilibj.Spark;

//this is a helper class that wraps around a Spark object to control a REV Robotics BlinkinLED Driver
public class BlinkinLEDDriver extends Spark {

	public BlinkinLEDDriver(int port) {
		super(port);
	}
	
	//gets the current value of the LED
	public double get() {
		return super.get();
		
	}
	public void set(double value) {
		super.set(value);
	}
	public void set(Mode mode) {
		this.set(mode.value);
	}
	//NOTE: not efficent
	public Mode getMode() {
		double current = this.get();
		Mode[] values = Mode.values();
		for (Mode m: values)
		{
			if(Math.abs(current - m.value) <= 0.001) {
				return m;
			}
		}
		return Mode.UNKNOWN;
	}
	public void cycleForward() {
		double current = get();
		double next = current + Mode.width;
		if(next >= Mode.max) {
			next = Mode.min;
		}
		next *= 100.0;
		next = Math.round(next);
		next /= 100.0;
		this.set(next);
	}
	public void cycleBackward() {
		double current = get();
		double next = current - Mode.width;
		if(next <= Mode.min) {
			next = Mode.max;
		}
		next *= 100.0;
		next = Math.round(next);
		next /= 100.0;
		this.set(next);
	}
	

	public enum Mode {
		
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
		
		Mode(double value) {
			this.value = value;
		}
		double value;
		static final double width = 0.02;
		static final double max = 0.99;
		static final double min = -0.99;
	}
}
