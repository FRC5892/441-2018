package org.usfirst.frc.team441.robot.commands.auton;

import org.usfirst.frc.team441.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class AutonStraightDrive extends Command {
	private final double power;
	private final double encoderTarget;
	
	public AutonStraightDrive(double _power, double _encoderTarget) {
		requires(Robot.driveSubsystem);
		power = _power;
		encoderTarget = _encoderTarget;
	}
	
	@Override
	protected void initialize() {
		Robot.driveSubsystem.resetEncoders();
	}
	
	@Override
	protected void execute() {
		double left = Robot.driveSubsystem.getLeft(), right = Robot.driveSubsystem.getRight();
		double leftPower = right / left, rightPower = left / right;
		if (left == 0) leftPower = 1; if (right == 0) rightPower = 1;
		System.out.printf("leftPower is %.2f and rightPower is %.2f%n", leftPower, rightPower);
		Robot.drive.tankDrive((leftPower > 1 ? 1 : leftPower) * power, (rightPower > 1 ? 1 : rightPower) * power, false);
	}
	
	@Override
	protected boolean isFinished() {
		return Robot.driveSubsystem.getLeft() > encoderTarget || Robot.driveSubsystem.getRight() > encoderTarget;
	}
	
	@Override
	protected void end() {
		Robot.drive.stopMotor();
	}

}
