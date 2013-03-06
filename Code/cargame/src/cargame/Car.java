package cargame;

import java.util.ArrayList;
import java.lang.Math;

public class Car
{
  private int speed;
  private int mpg;
  private int tankSize;
  private int fuel;
  private int distance;
  private ArrayList<Stop> completedStops;
  private Stop lastStop;
  private Stop nextStop;
  private boolean raceFinished;
  
  public Car()
  {
    speed = 10;
    mpg = 10;
    tankSize = 10;
    fuel = 10;
    distance = 1000;
    raceFinished = false;
  }
  public void setSpeed(int s)
  {
    speed = s;
  }
  public void setMPG(int m)
  {
    mpg = m;
  }
  public void setTankSize(int t)
  {
    tankSize = t;
  }
  public void setFuel(int f)
  {
    fuel = f;
  }
  public void setRaceFinished(boolean b)
  {
    raceFinished = b;
  }
  public int getSpeed()
  {
    return speed;
  }
  public int getMPG()
  {
    return mpg;
  }
  public int getTankSize()
  {
    return tankSize;
  }
  public int getFuel()
  {
    return fuel;
  }
  public void setStop()
  {
    completedStops.remove(lastStop);
    lastStop = nextStop;
    if(completedStops.isEmpty())
      this.setRaceFinished(true);
    else
      nextStop = completedStops.get(0);
  }
  
  public void refuel()
  {
    this.setFuel(tankSize);
  }
  
  public void drive()
  {
    for(int i = 1; i <= speed; i++)
    {
      if(fuel == 0)
        break;
      else
      {
        distance -= speed;
        fuel -= speed / mpg;
      }
    }
  }
}