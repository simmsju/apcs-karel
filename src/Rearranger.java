import kareltherobot.Directions;
import kareltherobot.UrRobot;
import kareltherobot.World;

public class Rearranger implements Directions {

    public static void main (String[] args)
    {
        World.readWorld("worlds/fig2-11.kwld");
        World.setVisible(true);
        World.setDelay(5);
        //World.showSpeedControl(true);

        int row = 4;
        int col = 3;
        UrRobot bot = new UrRobot(row, col,
                North, 0);
        for (int x = 0; x <= 2; x++){
            bot.turnLeft();
        }
        bot.move();
        bot.move();
        bot.turnLeft();
        bot.move();
        bot.pickBeeper();
        bot.move();
        bot.pickBeeper();
        bot.turnLeft();
        bot.turnLeft();
        bot.move();
        bot.move();
        bot.move();
        bot.pickBeeper();
        bot.move();
        bot.pickBeeper();
        bot.turnLeft();
        bot.turnLeft();
        bot.move();
        bot.move();
        bot.turnLeft();
        bot.move();
        bot.move();
        bot.turnLeft();
        bot.turnLeft();
        bot.putBeeper();
        bot.move();
        bot.putBeeper();
        bot.move();
        bot.move();
        bot.putBeeper();
        bot.move();
        bot.putBeeper();
        bot.move();
    }
}
