package org.usfirst.frc.team441.robot.commands;

import org.usfirst.frc.team441.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TeleopMovement extends Command {
	
	public TeleopMovement() {
		requires(Robot.driveSubsystem);
	}
	
	@Override
	protected void execute() {
		Robot.drive.arcadeDrive(Robot.m_oi.pilot.getRawAxis(1), Robot.m_oi.pilot.getRawAxis(4));
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

}
