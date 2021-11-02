// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.util.DreadbotController;

public class Robot extends TimedRobot {
  // This is a reference to a motor controller, which is used to control the robot motor's functions.
  // It can do a lot more than we will work with today, but we are going to keep it simple!
  private CANSparkMax motor;

  // This is the joystick which can give us the information provided by the physical joystick 
  // of the driver station!
  private DreadbotController joystick;

  @Override
  public void robotInit() {
    // Here we tell the robot where the motor is on the robot electrically, and what type of motor it is!
    motor = new CANSparkMax(1, CANSparkMax.MotorType.kBrushless);

    // Here we tell the robot where to find player instructions!
    joystick = new DreadbotController(0);
  }

  // Helpful Tips/Questions for Writing Code from Collin & Ethan!!!

  // * Think about the problem at hand - what do we need to do in a logical order?
  // * What are some techniques we can use to do it?
  // * If you need help, ask your teammates! 
  // 
  // 1. What system are we relying on to carry out tasks? (motors, solenoids?)
  // 2. What are we asking the system to do? (Spin motors, actuate solenoids)
  // 3. How do we represent our instruction in a way the robot will understand? (Programming syntax)

  @Override
  public void teleopPeriodic() {
    // CODE HERE!!!

    

    // CODE END!!!
  }











  // Contents of the solution for problem 1. TOP SECRET
  @SuppressWarnings("unused")
  private void firstStepSolution() {
    // Set the motor speed
    motor.set(0.5);
  }

  // Contents of the solution for problem 2. DOUBLE TOP SECRET
  @SuppressWarnings("unused")
  private void secondStepSolution() {
    // Set a new variable called speed, in the range of -1.0 to 1.0. (inclusive)
    double speed = 0.6180;

    // Set the motor speed
    motor.set(speed);
  }

  // Contents of the solution for problem 3. MAXIMUM TOP SECRET
  @SuppressWarnings("unused")
  private void thirdStepSolution() {
    // Set a new variable called speed, which is equal to the current value of the joystick.
    double speed = joystick.getYAxis();

    // Set the motor speed
    motor.set(speed);
  }

  // Contents of the solution for problem 4. ULTRA-MAXIMUM TOP SECRET
  @SuppressWarnings("unused")
  private void fourthStepSolution() {
    // Set a new variable called speed, which is equal to the current value of the joystick.
    double speed = joystick.getYAxis();

    // Conditional manipulation - only spin if the speed is greater than zero!
    if(speed < 0.0) {
      speed = 0.0;
    }

    // Set the motor speed
    motor.set(speed);
  }

  // Contents of the solution for problem 5. PENTAGON-LEVEL TOP SECRET
  @SuppressWarnings("unused")
  private void fifthStepSolution() {
    // Set a new variable called speed, which is equal to the current value of the joystick.
    double speed = joystick.getYAxis();

    // Conditional manipulation - only spin if the speed is in a given range!
    if(speed < -0.5 && speed > 0.5) {
      speed = 0.0;
    }

    // Set the motor speed
    motor.set(speed);
  }
}
