package app.entities;

import java.util.Random;

public class Usuario {
    private String nome;
    private char marcador;
    private int vitorias;

    public Usuario() {
    }

    public Usuario( char marcador) {
        this.marcador = marcador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getMarcador() {
        return marcador;
    }

    public void setMarcador(char marcador) {
        this.marcador = marcador;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

}
