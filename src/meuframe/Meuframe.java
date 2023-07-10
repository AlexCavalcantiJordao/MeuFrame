package meuframe;

import javax.swing.JFrame;
import javax.swing.JButton;

public class Meuframe extends JFrame {

    public Meuframe() {

        super("Meu Frame");

        JButton botao = new JButton("Clique");
        // JFrame frame = new JFrame();
        getContentPane().add(botao);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Meuframe();
    }
}