package org.usfirst.frc.team441.robot.subsystems;

import org.usfirst.frc.team441.robot.RobotMap;
import org.usfirst.frc.team441.robot.commands.Winglifts;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Wing extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public static Spark leftandrightWinch = new Spark(RobotMap.leftandRightWingWinch);
	public static Spark leftandrightWing = new Spark(RobotMap.LeftAndRightWingLift);
	
	public static DigitalInput leftWingLimit = new DigitalInput(RobotMap.leftLimitWing);
	public static DigitalInput rightftWingLimit = new DigitalInput(RobotMap.rightLimitWing);
	public static DigitalInput leftWingWinchLimit = new DigitalInput(RobotMap.leftLimitWinch);
	public static DigitalInput rightWingWinchLimit = new DigitalInput(RobotMap.righftLimitWinch);

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new Winglifts());
	}
}
