package com.polimorfismoperdati;

public class SecS extends Component {

    public void metodoSpecificoSoloDiSecS(){
        System.out.println("metodoSpecificoSoloDiSecS");
    }

    @Override
    public void metodo1() {
        super.metodo1();
        System.out.println("SecS metodo1 Initialize");

    }

    @Override
    public void metedo2() {
        super.metedo2();
        System.out.println("SecS metodo2 Initialize");
    }

    @Override
    public void metodo3() {
        super.metodo3();
        System.out.println("SecS metodo3 Initialize");
    }

    @Override
    public void metodo4() {
        super.metodo4();
        System.out.println("SecS metodo4 Initialize");
    }
}
