package com.corsoJava;

public class PrimaClasse {
    private String nome;
    private String modello;
    private int versione;
///-----Constructor DEFAULT
        public PrimaClasse() {
    }
//----------E ESPLICITO----------------------
    public PrimaClasse(String nome, String modello, int versione) {
        this.nome = nome;
        this.modello = modello;
        this.versione = versione;
    }
    //--------------------------------
  ////    ACCESSOR MUTATOR


    public String getNome() {
        return nome;
    }

    public String getModello() {
        return modello;

    }

    public int getVersione() {
        return versione;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setVersione(int versione) {
        this.versione = versione;
    }
}
