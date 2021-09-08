import kareltherobot.*;

public class Newspaper implements Directions{

    public static void main(String[] args) {
        World.readWorld("worlds/fig2-8.kwld");
        World.setVisible(true);
        World.setDelay(10);

        UrRobot bot = new UrRobot(3, 4,
                West, 0);
        for (int x = 0; x <= 2; x++) {
            bot.turnLeft();
        }
        bot.move();
        bot.move();
        bot.turnLeft();
        bot.move();
        bot.move();
        bot.turnLeft();
        bot.move();
        bot.move();
        bot.turnLeft();
        bot.move();
        bot.pickBeeper();
        bot.turnLeft();
        bot.move();
        bot.turnLeft();
        bot.move();
        for (int x = 0; x <= 2; x++) {
            bot.turnLeft();
        }
        bot.move();
        for (int x = 0; x <= 2; x++) {
            bot.turnLeft();
        }
        bot.move();
        bot.move();
        for (int x = 0; x <= 2; x++) {
            bot.turnLeft();
        }
        bot.move();
        bot.move();
        bot.putBeeper();



    }
}
