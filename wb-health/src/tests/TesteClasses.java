package tests;

import model.Funcionario;

public class TesteClasses {
    public static void main(String[] args) {
        // Teste Classe Funcionario
        Funcionario f1 = new Funcionario("Lucas Torres", "58401-698", "104.332.454-43", 1350.0);
        System.out.println(f1.toString());


    }
}
