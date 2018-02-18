package org.usfirst.frc.team441.robot.subsystems;

import org.usfirst.frc.team441.robot.RobotMap;
import org.usfirst.frc.team441.robot.commands.IntakeCommand;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public static VictorSP left = new VictorSP(RobotMap.leftInt);
	public static VictorSP right = new VictorSP(RobotMap.rightInt);
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    }
}

