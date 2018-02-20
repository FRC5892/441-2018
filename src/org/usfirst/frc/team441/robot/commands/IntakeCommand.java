package org.usfirst.frc.team441.robot.commands;

import org.usfirst.frc.team441.robot.Robot;
import org.usfirst.frc.team441.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.command.Command;

public class IntakeCommand extends Command {
	double forward;

	public IntakeCommand(double forward) {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.intake);
		this.forward = forward;
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		Intake.left.set(0);
		Intake.right.set(0);
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		while (Intake.intakeLimit.get()) {
			cancelIntake();
			if (forward == 1) {
				Intake.left.set(1);
				Intake.right.set(-1);
			} else if (forward == 0) {
				Intake.left.set(-1);
				Intake.right.set(1);
			}
//			 else if (forward == 2) {
//				Intake.left.set(-.5);
//				Intake.right.set(.5);
//			} else if (forward == 3) {
//				Intake.left.set(.5);
//				Intake.right.set(-.5);
//			}
		}
		boxCantLeave();
	}
	//Check to cancel intake
	private void cancelIntake(){
		if(Robot.m_oi.pilot.getRawButtonPressed(5)){
			end();
		}
	}
	//Box can't leave until outake is pressed
	private void boxCantLeave(){
		while(!Robot.m_oi.pilot.getRawButtonPressed(6)){
			if(!Intake.intakeLimit.get()){
				Intake.left.set(-1);
				Intake.right.set(1);
			}
		}
		end(); //Maybe remove this, needs testing
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
