package com.ereditarieta;

public class Superclasse {
    public Superclasse(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String nome;
    public String cognome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
}
