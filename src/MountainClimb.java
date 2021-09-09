import kareltherobot.*;
import java.awt.Color;

public class MountainClimb implements Directions {
  public static void main (String[] args)
  {
    World.readWorld("worlds/fig2-9.kwld");
    World.setVisible(true);
    World.setDelay(10);
    //World.showSpeedControl(true);
    
    int row = 1; 
    int col = 2;
    UrRobot bot = new UrRobot(row, col,
                                North, 1);
    for (int x = 0; x <= 2; x++){
      bot.turnLeft();
    }
    bot.move();
    bot.turnLeft();
    bot.move();
    bot.move();
    for (int x = 0; x <= 2; x++){
      bot.turnLeft();
    }
    bot.move();
    bot.turnLeft();
    for (int x = 0; x <= 1; x++) {
      bot.move();
    }
    for (int x = 0; x <= 2; x++){
      bot.turnLeft();
    }
    bot.move();
    bot.putBeeper();
    bot.move();
    for (int x = 0; x <= 2; x++) {
      bot.turnLeft();
    }
    for (int x = 0; x <= 1; x++) {
    bot.move();
    }
    bot.turnLeft();
    bot.move();
    for (int x = 0; x <= 2; x++) {
      bot.turnLeft();
    }
    bot.move();
    bot.move();
  }
  
}
