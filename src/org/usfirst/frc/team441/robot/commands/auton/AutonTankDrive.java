package org.usfirst.frc.team441.robot.commands.auton;

import org.usfirst.frc.team441.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class AutonTankDrive extends Command {
	private final double leftPower;
	private final double rightPower;
	private final double encoderTarget;
	
	public AutonTankDrive(double _leftPower, double _rightPower, double _encoderTarget) {
		requires(Robot.driveSubsystem);
		leftPower = _leftPower;
		rightPower = _rightPower;
		encoderTarget = _encoderTarget;
	}
	
	@Override
	protected void initialize() {
		//Robot.driveSubsystem.resetEncoders();
	}
	
	@Override
	protected void execute() {
		Robot.drive.tankDrive(leftPower, rightPower);
	}

	@Override
	protected boolean isFinished() {
		System.out.printf("encoderTarget is %.2f and left encoder is %.2f and right encoder is %.2f", encoderTarget, Robot.driveSubsystem.getLeft(), Robot.driveSubsystem.getRight());
		return crossedThreshold(encoderTarget >= 0, encoderTarget, Robot.driveSubsystem.getLeft(), Robot.driveSubsystem.getRight());
	}
	
	@Override
	protected void end() {
		//Robot.drive.stopMotor();
	}
	
	public static boolean crossedThreshold(boolean greaterThan, double threshold, double... values) {
		for (double v : values) {
			if (greaterThan && v > threshold) return true;
			else if (!greaterThan && v < threshold) return true;
		}
		return false;
	}

}
