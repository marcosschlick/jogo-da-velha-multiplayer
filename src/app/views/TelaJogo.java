package app.views;

import app.entities.Casa;
import app.entities.Usuario;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;

public class TelaJogo extends JPanel  {

    public TelaJogo(CardLayout cardLayout, JPanel cards, Usuario usuario1, Usuario usuario2) {

        setLayout(null);

        setBackground(new Color(180, 220, 255));


        Casa c1 = new Casa(145, 300);
        Casa c2 = new Casa(320, 300);
        Casa c3 = new Casa(495, 300);

        Casa c4 = new Casa(145, 475);
        Casa c5 = new Casa(320, 475);
        Casa c6 = new Casa(495, 475);

        Casa c7 = new Casa(145, 650);
        Casa c8 = new Casa(320, 650);
        Casa c9 = new Casa(495, 650);

        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(c5);
        add(c6);
        add(c7);
        add(c8);
        add(c9);














        JButton botao = new JButton();
        botao.setText("ir para Tela Inicial");
        botao.setSize(150, 70);
        botao.addActionListener(e -> cardLayout.show(cards, "TelaInicial"));
        botao.setLocation(325, 50);
        add(botao);
    }
}
