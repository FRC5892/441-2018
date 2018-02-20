package org.usfirst.frc.team441.robot.commands;

import org.usfirst.frc.team441.robot.Robot;
import org.usfirst.frc.team441.robot.subsystems.Drive;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveMultSetter extends Command {
	int mult;
    public DriveMultSetter(int mult) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	this.mult = mult;
    	requires(Robot.driveSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Drive.directionMult = mult;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
