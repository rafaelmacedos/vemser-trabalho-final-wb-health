package util;

import model.Funcionario;
import model.Hospital;
import model.Medico;

public class MenuFinanceiro {
    public static void listar(Hospital hospital) {
        Double folhaMensal = 0.0;
        Double folhaAnual = 0.0;
        for (Funcionario funcionario : hospital.getFuncionarios()) {
            folhaMensal += funcionario.calcularSalarioMensal();
            folhaAnual += funcionario.calcularSalarioAnual();
        }
        for (Medico medico : hospital.getMedicos()) {
            folhaMensal += medico.calcularSalarioMensal();
            folhaAnual += medico.calcularSalarioAnual();
        }

        System.out.println("\n---------- Folha Salarial ----------");
        System.out.println("Mensal: R$" + String.format("%.2f", folhaMensal));
        System.out.println("Anual: R$" + String.format("%.2f", folhaAnual));

        System.out.println("0 - Voltar");
    }

}
