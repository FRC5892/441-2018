package org.usfirst.frc.team441.robot.subsystems;

import org.usfirst.frc.team441.robot.commands.TeleopMovement;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
    public void initDefaultCommand() {
        setDefaultCommand(new TeleopMovement());
    }
    
}

