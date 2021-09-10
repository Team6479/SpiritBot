package frc.robot.util;

import java.util.ArrayList;
import java.util.Arrays;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class MultiButton extends Button {
  private final ArrayList<Button> buttons;

  /**
   * Create a POV button for triggering commands.
   *
   * @param joystick The GenericHID object that has the button (e.g. Joystick, KinectStick, etc)
   * @param buttonNumbers The button numbers (see {@link GenericHID#getRawButton(int) }
   */
  public MultiButton(GenericHID joystick, int... buttonNumbers) {
    // this.joystick = joystick;
    // this.buttonNumbers = buttonNumbers;
    this.buttons = new ArrayList<Button>();
    for (int buttonNumber : buttonNumbers) {
      buttons.add(new JoystickButton(joystick, buttonNumber));
    }
  }

  public MultiButton(Button... buttons) {
    this.buttons = new ArrayList<Button>(Arrays.asList(buttons));
  }

  @Override
  public boolean get() {
    boolean check = true;
    for (Button button : buttons) {
      check = check & button.get();
    }
    return check;
  }
}