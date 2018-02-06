package org.usfirst.frc.team441.robot.commands;

import org.usfirst.frc.team441.robot.Robot;
import org.usfirst.frc.team441.robot.subsystems.Drive;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class TeleopMovement extends Command {
	
	public TeleopMovement() {
		requires(Robot.driveSubsystem);
	}
	
	@Override
	protected void execute() {
		Robot.drive.arcadeDrive(-Robot.m_oi.pilot.getRawAxis(1), Robot.m_oi.pilot.getRawAxis(4));
		SmartDashboard.putNumber("Left Encoder", Robot.driveSubsystem.getLeft());
		SmartDashboard.putNumber("Right Encoder", Robot.driveSubsystem.getRight());
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

}
