package LaVraieRecette;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;


public class Images extends JFrame {

    JPanel jp = new JPanel();
    JLabel jl = new JLabel();

    public Images(){
        setTitle("Tiramisu");
        setVisible(true);
        setSize(800,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jl.setIcon(new ImageIcon("images\\tiramisu2.png"));
        jp.add(jl);

        add(jp);// add janel to frame

        validate(); // validate image when start running it
    }

    public static void main(String[] args) {
        Images im = new Images();
    }
}
