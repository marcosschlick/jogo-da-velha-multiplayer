package app.views;

import app.entities.Usuario;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaInicial extends JPanel {
    public TelaInicial(CardLayout cardLayout, JPanel cards, Usuario usuario1,  Usuario usuario2) {

        setLayout(null);

        setBackground(new Color(180, 220, 255));

        ImageIcon logoIcon = new ImageIcon("src/resources/images/logo.png");
        JLabel logoLabel = new JLabel(logoIcon);
        logoLabel.setBounds(150, -60, logoIcon.getIconWidth(), logoIcon.getIconHeight()); // Posição (0, 0)
        add(logoLabel);

        JLabel label1 = new JLabel();
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setText("Player 1 digite seu nome de usuário:");
        label1.setFont(new Font("", Font.BOLD, 30));
        label1.setSize(800, 100);
        label1.setLocation(0, 350);
        label1.setVisible(true);
        add(label1);

        JTextField enter1 = new JTextField();
        enter1.setSize(400, 60);
        enter1.setFont(new Font("", Font.BOLD, 20));
        enter1.setLocation(200, 450);
        add(enter1);

        JLabel label2 = new JLabel();
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setText("Player 2 digite seu nome de usuário:");
        label2.setFont(new Font("", Font.BOLD, 30));
        label2.setSize(800, 100);
        label2.setLocation(0, 550);
        label2.setVisible(true);
        add(label2);

        JTextField enter2 = new JTextField();
        enter2.setSize(400, 60);
        enter2.setFont(new Font("", Font.BOLD, 20));
        enter2.setLocation(200, 650);
        add(enter2);

        JButton botao = new JButton();
        botao.setText("Jogar");
        botao.setBackground(new Color(30, 80, 120));
        botao.setForeground(new Color(255, 255, 255));
        botao.setFont(new Font("", Font.BOLD, 55));
        botao.setSize(250, 100);
        botao.addActionListener(e -> cardLayout.show(cards, "TelaJogo"));
        botao.addActionListener(e -> usuario1.setNome(enter1.getText()));
        botao.addActionListener(e -> usuario2.setNome(enter2.getText()));
        botao.setLocation(275, 750);

        add(botao);
    }
}
