package org.usfirst.frc.team441.robot.subsystems;

import org.usfirst.frc.team441.robot.RobotMap;

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
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

