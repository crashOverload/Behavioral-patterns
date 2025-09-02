package com.abhiyank.strategy;

import com.abhiyank.model.Location;
import com.abhiyank.model.Route;

public interface RoutingStrategy {
  Route createRoute(Location startLocation, Location endLocation);
}
