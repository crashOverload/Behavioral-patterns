package com.abhiyank;

import com.abhiyank.command.Command;
import com.abhiyank.command.impl.AdjustVolumeCommand;
import com.abhiyank.command.impl.ChangeChannelCommand;
import com.abhiyank.command.impl.TurnOffCommand;
import com.abhiyank.command.impl.TurnOnCommand;
import com.abhiyank.model.RemoteControl;
import com.abhiyank.model.TV;

public class Main {

  public static void main(String[] args) {
    System.out.println("Initiating command pattern");

    // Create TV object
    TV tv = new TV();

    // Create command objects
    Command turnOnTVCommand = new TurnOnCommand(tv);
    Command turnOffTVCommand = new TurnOffCommand(tv);
    Command adjustVolumeStereoCommand = new AdjustVolumeCommand(tv);
    Command changeChannelTVCommand = new ChangeChannelCommand(tv);

    // Create remote control
    RemoteControl remote = new RemoteControl();

    // Set and execute commands
    remote.setCommand(turnOnTVCommand);
    remote.pressButton(); // Outputs: TV is now on

    remote.setCommand(adjustVolumeStereoCommand);
    remote.pressButton(); // Outputs: Volume adjusted

    remote.setCommand(changeChannelTVCommand);
    remote.pressButton(); // Outputs: Channel changed

    remote.setCommand(turnOffTVCommand);
    remote.pressButton(); // Outputs: TV is now off
  }
}