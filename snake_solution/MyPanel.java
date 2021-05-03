import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    private Game game;
    private Timer timer = new Timer(100, this);
    private MyKeyAdapter keyAdapter = new MyKeyAdapter();

    public MyPanel(Game game) {
        this.game = game;
        setPreferredSize(new Dimension(Game.WIDTH, Game.HEIGHT));
        setFocusable(true);
        addKeyListener(keyAdapter);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int keyKode = keyAdapter.getKeyCode();

        game.move(keyKode);

        if (game.gameOver()) {
            timer.stop();
        } else {
            repaint();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Game.COLOR);
        game.drawSnake(g);
        game.takeFruit();
        game.drawFruit(g);
    }
}
