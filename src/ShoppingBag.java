import kareltherobot.*;

public class ShoppingBag implements Directions {

    public static void main (String[] args)
    {
        World.readWorld("worlds/fig2-10.kwld");
        World.setVisible(true);
        World.setDelay(10);
        //World.showSpeedControl(true);

        int row = 5;
        int col = 7;
        UrRobot bot = new UrRobot(row, col,
                East, 0);
        for (int x = 0; x <= 1; x++) {
            bot.turnLeft();
        }
        bot.move();
        bot.move();
        for (int x = 0; x <= 2; x++) {
            bot.turnLeft();
        }
        bot.pickBeeper();
        bot.move();
        bot.turnLeft();
        bot.move();
        bot.pickBeeper();
        for (int x = 0; x <= 2; x++) {
            bot.turnLeft();
        }
        bot.move();
        bot.turnLeft();
        bot.move();
        bot.pickBeeper();
        for (int x = 0; x <= 2; x++) {
            bot.turnLeft();
        }
        bot.move();
        bot.pickBeeper();
        for (int x = 0; x <= 1; x++) {
            bot.turnLeft();
        }
        for (int x = 0; x <= 2; x++) {
            bot.move();
        }
        bot.turnLeft();
        for (int x = 0; x <= 3; x++) {
            bot.move();
        }
    }
}
