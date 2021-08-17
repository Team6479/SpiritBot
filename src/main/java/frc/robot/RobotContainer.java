// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.team6479.lib.controllers.CBXboxController;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.commands.TeleopCannonAngle;
import frc.robot.commands.TeleopDrive;
import frc.robot.subsystems.Cannon;
import frc.robot.subsystems.CannonAngle;
import frc.robot.subsystems.Drivetrain;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  private CBXboxController xbox = new CBXboxController(0);

  private Drivetrain drivetrain = new Drivetrain();
  private Cannon cannon = new Cannon();
  private CannonAngle cannonAngle = new CannonAngle();

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  public Cannon getCannon() {
    return cannon;
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    xbox.getButton(Button.kBumperRight)
        .whenPressed(new InstantCommand(cannon::toggle, cannon));

    drivetrain.setDefaultCommand(new TeleopDrive(drivetrain, 
      () -> xbox.getY(Hand.kLeft), 
      () -> xbox.getX(Hand.kRight)
    ));
    cannonAngle.setDefaultCommand(new TeleopCannonAngle(cannonAngle, 
      () -> xbox.getTriggerAxis(Hand.kLeft),
      () -> xbox.getTriggerAxis(Hand.kRight)
    ));
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;
  }
}