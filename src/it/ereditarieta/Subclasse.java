package com.ereditarieta;

public class Subclasse extends Superclasse {
    public Subclasse(int anni, String nome, String cognome) {
        super(nome, cognome);
        this.anni = anni;
        this.nome=nome;
        this.cognome=cognome;     //public in superClass else error has private access
    }

    private int anni;


    public int getAnni() {
        return anni;
    }
    public void setAnni(int anni) {
        this.anni = anni;
    }

    @Override
    public void setNome(String nome) {
        super.setNome ( nome );
    }

    public static void main(String[] args) {

        Subclasse b =new Subclasse ( 24, "Mihail", "Meleca");
        System.out.println (b.getAnni ());
        System.out.println ( b.getCognome () );
        System.out.println ( b.getNome () );
    }








}
