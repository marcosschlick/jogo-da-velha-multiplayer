package app.views;

import app.entities.Casa;
import app.entities.Usuario;
import java.awt.*;
import javax.swing.*;

public class TelaJogo extends JPanel  {

    private Usuario turno;
    private final Usuario usuario1;
    private final Usuario usuario2;

    public TelaJogo(CardLayout cardLayout, JPanel cards, Usuario u1, Usuario u2) {

        this.usuario1 = u1;
        this.usuario2 = u2;
        this.turno = this.usuario1;

        setLayout(null);

        setBackground(new Color(180, 220, 255));

        Casa[][] casas = new Casa[3][3];

        JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setText("Jogador " + this.turno.getMarcador() + " é tua vez de jogar");
        label.setFont(new Font("", Font.BOLD, 40));
        label.setSize(800, 300);
        label.setLocation(0, 0);
        label.setVisible(true);
        add(label);

        // Linha 1
        casas[0][0] = new Casa(145, 300);
        casas[0][0].addActionListener(e -> {
            casas[0][0].marcar(this.turno);
            proximoJogador(label);
        });
        add(casas[0][0]);

        casas[0][1] = new Casa(320, 300);
        casas[0][1].addActionListener(e -> {
            casas[0][1].marcar(this.turno);
            proximoJogador(label);
        });
        add(casas[0][1]);

        casas[0][2] = new Casa(495, 300);
        casas[0][2].addActionListener(e -> {
            casas[0][2].marcar(this.turno);
            proximoJogador(label);
        });
        add(casas[0][2]);

        // Linha 2
        casas[1][0] = new Casa(145, 475);
        casas[1][0].addActionListener(e -> {
            casas[1][0].marcar(this.turno);
            proximoJogador(label);
        });
        add(casas[1][0]);

        casas[1][1] = new Casa(320, 475);
        casas[1][1].addActionListener(e -> {
            casas[1][1].marcar(this.turno);
            proximoJogador(label);
        });
        add(casas[1][1]);

        casas[1][2] = new Casa(495, 475);
        casas[1][2].addActionListener(e -> {
            casas[1][2].marcar(this.turno);
            proximoJogador(label);
        });
        add(casas[1][2]);

        // Linha 3
        casas[2][0] = new Casa(145, 650);
        casas[2][0].addActionListener(e -> {
            casas[2][0].marcar(this.turno);
            proximoJogador(label);
        });
        add(casas[2][0]);

        casas[2][1] = new Casa(320, 650);
        casas[2][1].addActionListener(e -> {
            casas[2][1].marcar(this.turno);
            proximoJogador(label);
        });
        add(casas[2][1]);

        casas[2][2] = new Casa(495, 650);
        casas[2][2].addActionListener(e -> {
            casas[2][2].marcar(this.turno);
            proximoJogador(label);
        });
        add(casas[2][2]);
    }

    private void proximoJogador(JLabel label) {
        turno = (turno == usuario1) ? usuario2 : usuario1;
        label.setText("Jogador " + this.turno.getMarcador() + " é tua vez de jogar");
    }
}