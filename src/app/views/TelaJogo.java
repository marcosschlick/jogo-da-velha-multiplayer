package app.views;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;

public class TelaJogo extends JPanel  {

    public TelaJogo(CardLayout cardLayout, JPanel cards) {

        setLayout(null);

        setBackground(new Color(180, 220, 255));

        JButton botao = new JButton();
        botao.setText("ir para Tela Inicial");
        botao.setSize(150, 70);
        botao.addActionListener(e -> cardLayout.show(cards, "TelaInicial"));
        botao.setLocation(325, 750);
        add(botao);
    }
}
