package app.views;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaInicial extends JPanel {
    public TelaInicial(CardLayout cardLayout, JPanel cards) {

        setLayout(null);

        setBackground(new Color(180, 220, 255));

        ImageIcon logoIcon = new ImageIcon("src/resources/images/logo.png");
        JLabel logoLabel = new JLabel(logoIcon);
        logoLabel.setBounds(150, -60, logoIcon.getIconWidth(), logoIcon.getIconHeight()); // Posição (0, 0)
        add(logoLabel);


        JLabel label1 = new JLabel();
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setText("Player 1 digite seu username:");
        label1.setFont(new Font("", Font.BOLD, 30));
        label1.setSize(800, 100);
        label1.setLocation(0, 350);
        label1.setVisible(true);
        add(label1);

        JTextField enter1 = new JTextField();
        enter1.setSize(300, 60);
        enter1.setFont(new Font("", Font.BOLD, 20));
        enter1.setLocation(250, 450);
        add(enter1);

        JLabel label2 = new JLabel();
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setText("Player 2 digite seu username:");
        label2.setFont(new Font("", Font.BOLD, 30));
        label2.setSize(800, 100);
        label2.setLocation(0, 550);
        label2.setVisible(true);
        add(label2);

        JTextField enter2 = new JTextField();
        enter2.setSize(300, 60);
        enter2.setFont(new Font("", Font.BOLD, 20));
        enter2.setLocation(250, 650);
        add(enter2);

        JButton botao = new JButton();
        botao.setText("ir para Tela Jogo");
        botao.setSize(150, 70);
        botao.addActionListener(e -> cardLayout.show(cards, "TelaJogo"));
        botao.setLocation(325, 750);
        add(botao);
    }
}
