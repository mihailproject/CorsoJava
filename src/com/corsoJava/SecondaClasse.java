package com.corsoJava;

public class SecondaClasse extends PrimaClasse {


    @Override
    public void setModello(String modello) {
        super.setModello(modello);
        System.out.println("Sono il Setter");
    }

    @Override
    public String getModello() {

        return super.getModello();

    }
}
