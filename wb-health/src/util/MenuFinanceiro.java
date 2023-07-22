package util;

import model.Atendimento;
import model.Funcionario;
import model.Hospital;
import model.Medico;

public class MenuFinanceiro {
    public static void listar(Hospital hospital) {
        Double folhaMensal = 0.0;
        Double folhaAnual = 0.0;
        Double ganhoAtendimentos = 0.0;

        for (Funcionario funcionario : hospital.getFuncionarios()) {
            folhaMensal += funcionario.calcularSalarioMensal();
            folhaAnual += funcionario.calcularSalarioAnual();
        }
        for (Medico medico : hospital.getMedicos()) {
            folhaMensal += medico.calcularSalarioMensal();
            folhaAnual += medico.calcularSalarioAnual();
        }

        for (Atendimento atendimento : hospital.getAtendimentos()) {
            ganhoAtendimentos += atendimento.getValor();
        }

        System.out.println("\n---------- Seção Financeira ----------");
        System.out.println("Folha Mensal: R$" + String.format("%.2f", folhaMensal));
        System.out.println("Folha Anual: R$" + String.format("%.2f", folhaAnual));
        System.out.println("Ganhos Totais: R$" + String.format("%.2f", ganhoAtendimentos));

        System.out.println("0 - Voltar");
    }

}
