package com.polimorfismoperdati;

public class PrimaS extends Component {



    public void metodoSpecificoSoloDiPrimaS(){
        System.out.println("-------SONO metodoSpecificoSoloDiPrimaS");
    }

    @Override
    public void metodo1() {
        super.metodo1();
        System.out.println("PrimaS metodo1 Initialize");

    }

    @Override
    public void metedo2() {
        super.metedo2();
        System.out.println("PrimaS metodo2 Initialize");
    }

    public void metedo2_Originale() {
        System.out.println("PrimaS metodo2 Initialize");
    }


    @Override
    public void metodo3() {
        super.metodo3();
        System.out.println("PrimaS metodo3 Initialize");
    }

    @Override
    public void metodo4() {
        super.metodo4();
        System.out.println("PrimaS metodo4 Initialize");
    }
}
