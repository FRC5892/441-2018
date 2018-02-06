package org.usfirst.frc.team441.robot.subsystems;

import org.usfirst.frc.team441.robot.RobotMap;
import org.usfirst.frc.team441.robot.commands.TeleopMovement;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {

    public static final Encoder left = new Encoder(RobotMap.leftEncoder1, RobotMap.leftEncoder2);
    public static final Encoder right = new Encoder(RobotMap.rightEncoder1, RobotMap.rightEncoder2);
	
    public void initDefaultCommand() {
        setDefaultCommand(new TeleopMovement());
    }
    
    public double getLeft() {return left.getDistance();}
    public double getRight() {return right.getDistance();}
    public void resetEncoders() {
    	left.reset();
    	right.reset();
    }
    
}

