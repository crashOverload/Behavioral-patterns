package com.abhiyank;

import com.abhiyank.model.Location;
import com.abhiyank.strategy.RoutingStrategy;
import com.abhiyank.strategy.impl.BikeRouting;
import com.abhiyank.strategy.impl.CarRouting;

public class Main {

  public static void main(String[] args) {
    System.out.println("Choosing car as mode of transport");
    RoutingStrategy routingStrategy = new CarRouting();

    routingStrategy.createRoute(new Location(1.1, 2.2), new Location(3.3, 4.4));

    System.out.println("Choosing bike as mode of transport");
    routingStrategy = new BikeRouting();

    routingStrategy.createRoute(new Location(1.1, 2.2), new Location(3.3, 4.4));

  }
}