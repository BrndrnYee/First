import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    private final Dimension size;
    public GameWindow(Dimension size) {
        this.size = size;
        setSize(this.size);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("");
        setVisible(true);

        setResizable(false);
        setLocationRelativeTo(null);

        this.add(new GamePanel());
    }
}
