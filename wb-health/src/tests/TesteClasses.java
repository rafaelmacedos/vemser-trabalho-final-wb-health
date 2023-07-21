package tests;

import model.Funcionario;
import model.Medico;
import model.Paciente;

public class TesteClasses {
    public static void main(String[] args) {

        System.out.println(" -- Teste Classe Funcionario: -- ");
        Funcionario f1 = new Funcionario("Lucas Torres", "58401-698", "104.332.454-43", 1350.0);
        System.out.println(f1.toString());


        System.out.println("\n -- Teste Classe Medico: -- ");
        Medico m1 = new Medico("Drauzio Varella", "084126-320", "15648-0", 30000.00);
        System.out.println(m1.toString());

        System.out.println("\n -- Teste Classe Paciente: -- ");
        Paciente p1 = new Paciente("Haroldo Bauer", "084126-320", "111.111.111-11");
        System.out.println(p1.toString());


    }
}
