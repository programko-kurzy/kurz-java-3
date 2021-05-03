import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Game {

    public static int WIDTH = 500;
    public static int HEIGHT = 500;
    public static Color COLOR = Color.BLUE;

    private final Random random = new Random();
    private final ArrayList<Point> snake = new ArrayList<>();
    private final boolean fruitTaken = false;
    private Point fruit;

    public Game() {
        //TODO
    }

    private Point createFruit() {
        //TODO
        return null;
    }

    public void move(int keyCode) {
        //TODO        
    }

    public void takeFruit() {
        //TODO
    }

    public boolean gameOver() {
        //TODO
        return true;
    }

    public void drawSnake(Graphics g) {
        //TODO
    }

    public void drawFruit(Graphics g) {
        //TODO
    }

}
