package org.usfirst.frc.team4461.robot.commands;

import org.usfirst.frc.team4461.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;


public class Hopper extends Command {	
	public Hopper() {
        requires(Robot.HopperMotors);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
    	Robot.HopperMotors.Take();
    	Robot.HopperMotors.Shoot();
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
    	Robot.HopperMotors.Stop();
    }

    @Override
    protected void interrupted() {
    	end();
    }
}
