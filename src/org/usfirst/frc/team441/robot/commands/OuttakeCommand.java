package org.usfirst.frc.team441.robot.commands;

import org.usfirst.frc.team441.robot.Robot;
import org.usfirst.frc.team441.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class OuttakeCommand extends Command {

	public OuttakeCommand() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.intake);
	}

	// Called just before this Command runs the first time
	protected void initialize() {

		Intake.left.set(0);
		Intake.right.set(0);
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Intake.left.set(1);
		Intake.right.set(-1);
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
		initialize();
	}
}
