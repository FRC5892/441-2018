/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team441.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	public static int LeftBoxOne = 4;
	public static int LeftBoxTwo = 5;
	public static int LeftBoxThree = 3;
	public static int RightBoxOne = 0;
	public static int RightBoxTwo = 1;
	public static int RightBoxThree = 2;

	public static int rightInt = 6;
	public static int leftInt = 7;
	public static int limitInt = 0;

	public static int leftandRightWingWinch = 8;
	public static int LeftAndRightWingLift = 9;
	public static int leftLimitWinch = 1;
	public static int righftLimitWinch = 2;
	public static int leftLimitWing = 3;
	public static int rightLimitWing = 4;

	//public static int leftEncoder1 = 2;
	//public static int leftEncoder2 = 3;
	//public static int rightEncoder1 = 0;
	//public static int rightEncoder2 = 1;
}
