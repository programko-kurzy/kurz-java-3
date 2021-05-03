import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

public class Game {

    public static int WIDTH = 300;
    public static int HEIGHT = 300;
    public static Color COLOR = Color.BLUE;
    private static final int SQUARE_SIZE = 10;
    private String direction = "left";

    private final Random random = new Random();
    private final ArrayList<Point> snake = new ArrayList<>();
    private Point fruit;
    private boolean fruitTaken = false;

    public Game() {
        fruit = createFruit();
        for (int i = 0; i < 5; i++) {
            snake.add(new Point(200 + SQUARE_SIZE * i, 50));
        }
    }

    private Point createFruit() {
        int x = random.nextInt(WIDTH) / SQUARE_SIZE * SQUARE_SIZE;
        int y = random.nextInt(HEIGHT) / SQUARE_SIZE * SQUARE_SIZE;
        return new Point(x, y);
    }

    public void move(int keyCode) {
        Point head = snake.get(0);
        Point newHead = null;

        switch (keyCode) {
            case KeyEvent.VK_RIGHT:
                if (!direction.equals("left")) {
                    direction = "right";
                    newHead = new Point(head.getX() + SQUARE_SIZE, head.getY());
                } else {
                    newHead = new Point(head.getX() - SQUARE_SIZE, head.getY());
                }
                break;

            case KeyEvent.VK_LEFT:
                if (!direction.equals("right")) {
                    direction = "left";
                    newHead = new Point(head.getX() - SQUARE_SIZE, head.getY());
                } else {
                    newHead = new Point(head.getX() + SQUARE_SIZE, head.getY());
                }
                break;
            case KeyEvent.VK_UP:
                if (!direction.equals("down")) {
                    direction = "up";
                    newHead = new Point(head.getX(), head.getY() - SQUARE_SIZE);
                } else {
                    newHead = new Point(head.getX(), head.getY() + SQUARE_SIZE);
                }
                break;
            case KeyEvent.VK_DOWN:
                if (!direction.equals("up")) {
                    direction = "down";
                    newHead = new Point(head.getX(), head.getY() + SQUARE_SIZE);
                } else {
                    newHead = new Point(head.getX(), head.getY() - SQUARE_SIZE);
                }
                break;
        }

        snake.add(0, newHead);
        if (!fruitTaken) {
            snake.remove(snake.size() - 1);
        }

    }

    public void takeFruit() {
        Point head = snake.get(0);
        fruitTaken = head.getX() == fruit.getX() && head.getY() == fruit.getY();
        if (fruitTaken) {
            fruit = createFruit();
        }
    }

    public boolean gameOver() {
        Point head = snake.get(0);
        boolean result = head.getX() == -SQUARE_SIZE || head.getX() == WIDTH || head.getY() == -SQUARE_SIZE || head.getY() == HEIGHT;
        return result;
    }

    public void drawSnake(Graphics g) {
        for (Point point : snake) {
            g.fillRect(point.getX(), point.getY(), SQUARE_SIZE, SQUARE_SIZE);
        }
    }

    public void drawFruit(Graphics g) {
        g.fillOval(fruit.getX(), fruit.getY(), SQUARE_SIZE, SQUARE_SIZE);
    }
}
