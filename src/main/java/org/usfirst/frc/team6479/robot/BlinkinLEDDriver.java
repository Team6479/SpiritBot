package org.usfirst.frc.team6479.robot;

import edu.wpi.first.wpilibj.PWM;

//this is a helper class that wraps around a PWM object to control a REV Robotics BlinkinLED Driver
public class BlinkinLEDDriver extends PWM {

	public BlinkinLEDDriver(int port) {
		super(port);
	}
	
	//gets the current value of the LED
	public int get() {
		return getRaw();
		
	}
	public void set(int value) {
		if(value < 0) {
			value = 0;
		}
		if(value > 255) {
			value = 255;
		}
		setRaw(value);
	}
	public void set(Mode mode) {
		set(mode.value);
	}
	//NOTE: not efficent
	public Mode getMode() {
		int current = get();
		Mode[] values = Mode.values();
		for (Mode m: values)
		{
			if(current == m.value) {
				return m;
			}
		}
		return Mode.UNKNOWN;
	}

	enum Mode {
		
		RainbowRainbowPalette(1005),
		RainbowPartyPalette(1015),
		RainbowOceanPalette(1025),
		RainbowLavePalette(1035),
		RainbowForestPalette(1045),
		RainbowwithGlitter(1055),
		Confetti(1065),
		ShotRed(1075),
		ShotBlue(1085),
		ShotWhite(1095),
		SinelonRainbowPalette(1105),
		SinelonPartyPalette(1115),
		SinelonOceanPalette(1125),
		SinelonLavaPalette(1135),
		SinelonForestPalette(1145),
		BeatsperMinuteRainbowPalette(1155),
		BeatsperMinutePartyPalette(1165),
		BeatsperMinuteOceanPalette(1175),
		BeatsperMinuteLavaPalette(1185),
		BeatsperMinuteForestPalette(1195),
		FireMedium(1205),
		FireLarge(1215),
		TwinklesRainbowPalette(1225),
		TwinklesPartyPalette(1235),
		TwinklesOceanPalette(1245),
		TwinklesLavaPalette(1255),
		TwinklesForestPalette(1265),
		ColorWavesRainbowPalette(1275),
		ColorWavesPartyPalette(1285),
		ColorWavesOceanPalette(1295),
		ColorWavesLavaPalette(1305),
		ColorWavesForestPalette(1315),
		LarsonScannerRed(1325),
		LarsonScannerGray(1335),
		LightChaseRed(1345),
		LightChaseBlue(1355),
		LightChaseGray(1365),
		HeartbeatRed(1375),
		HeartbeatBlue(1385),
		HeartbeatWhite(1395),
		HeartbeatGray(1405),
		BreathRed(1415),
		BreathBlue(1425),
		BreathGray(1435),
		StrobeRed(1445),
		StrobeBlue(1455),
		StrobeGold(1465),
		StrobeWhite(1475),
		EndtoEndBlendtoBlack1(1485),
		LarsonScanner1(1495),
		LightChase1(1505),
		HeartbeatSlow1(1515),
		HeartbeatMedium1(1525),
		HeartbeatFast1(1535),
		BreathSlow1(1545),
		BreathFast1(1555),
		Shot1(1565),
		Strobe1(1575),
		EndtoEndBlendtoBlack2(1585),
		LarsonScanner2(1595),
		LightChase2(1605),
		HeartbeatSlow2(1615),
		HeartbeatMedium2(1625),
		HeartbeatFast2(1635),
		BreathSlow2(1645),
		BreathFast2(1655),
		Shot2(1665),
		Strobe2(1675),
		SparkleColor1onColor2(1685),
		SparkleColor2onColor1(1695),
		ColorGradientColor1and2(1705),
		BeatsperMinuteColor1and2(1715),
		EndtoEndBlendColor1to2(1725),
		EndtoEndBlend(1735),
		Color1andColor2noblendingSetupPattern(1745),
		TwinklesColor1and2(1755),
		ColorWavesColor1and2(1765),
		SinelonColor1and2(1775),
		HotPink(1785),
		Darkred(1795),
		Red(1805),
		RedOrange(1815),
		Orange(1825),
		Gold(1835),
		Yellow(1845),
		LawnGreen(1855),
		Lime(1865),
		DarkGreen(1875),
		Green(1885),
		BlueGreen(1895),
		Aqua(1905),
		SkyBlue(1915),
		DarkBlue(1925),
		Blue(1935),
		BlueViolet(1945),
		Violet(1955),
		White(1965),
		Gray(1975),
		DarkGray(1985),
		Black(1995),
		UNKNOWN(-1);
		
		Mode(int value) {
			this.value = value;
		}
		int value;
	}
}
