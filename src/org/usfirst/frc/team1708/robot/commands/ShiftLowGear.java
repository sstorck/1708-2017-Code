package org.usfirst.frc.team1708.robot.commands;

import org.usfirst.frc.team1708.robot.Robot;
import org.usfirst.frc.team1708.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShiftLowGear extends Command {

	public ShiftLowGear() {
		requires(Robot.drivetrain);
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		System.out.println("get shifted low");

	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.drivetrain.gearShiftLow();
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return Robot.drivetrain.inLowGear();
	}

	// Called once after isFinished returns true
	protected void end() {
		System.out.println("Shifter" + RobotMap.gearShifter.get());
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
