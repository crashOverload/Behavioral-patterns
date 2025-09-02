package com.abhiyank.command.impl;

import com.abhiyank.command.Command;
import com.abhiyank.model.TV;

public class AdjustVolumeCommand implements Command {

  private TV tv;

  public AdjustVolumeCommand(TV tv) {
    this.tv = tv;
  }

  @Override
  public void execute() {
    tv.adjustVolume();
  }
}
