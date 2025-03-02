package app.entities;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class Casa extends JButton {
    private boolean ocupada = false;
    private char marcador;

    public Casa(int x, int y) {
        setFont(new Font("", Font.BOLD, 80));
        setOpaque(true);
        setBackground(new Color(220, 240, 255));
        setSize(170, 170);
        setEnabled(true);
        setLocation(x, y);
    }

    public void marcar(Usuario usuario) {
        setText(String.valueOf(usuario.getMarcador()));
        this.marcador = usuario.getMarcador();
        this.ocupada = true;
        setEnabled(false);
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public char getMarcador() {
        return marcador;
    }

    public void setMarcador(char marcador) {
        this.marcador = marcador;
    }
}
