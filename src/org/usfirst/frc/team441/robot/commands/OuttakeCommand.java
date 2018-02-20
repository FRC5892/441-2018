package org.usfirst.frc.team441.robot.commands;

import org.usfirst.frc.team441.robot.Robot;
import org.usfirst.frc.team441.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.command.Command;

/**
 *		Spits the cube out of the robot
 */
public class OuttakeCommand extends Command {

	public OuttakeCommand() {
		requires(Robot.intake);
	}
	
	protected void initialize() {
		Intake.left.set(0);
		Intake.right.set(0);
	}

	protected void execute() {
		Intake.left.set(1);
		Intake.right.set(-1);
	}
	
	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		initialize();
	}
}
