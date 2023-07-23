package util;

import model.Hospital;

public class Menu {

    public static void listarMenuGeral(){
        System.out.println("---------- ESCOLHA UMA OPÇÃO ----------");
        System.out.println("1 - Seção de Médicos");
        System.out.println("2 - Seção de Paciente");
        System.out.println("3 - Seção de Funcionário");
        System.out.println("4 - Seção de Atendimento");
        System.out.println("5 - Seção do Financeiro");
        System.out.println("0 - Sair");
    }

    public static void listarSecao(Hospital hospital, int opcao){
        String secao = switch (opcao) {
            case 1 -> "médicos";
            case 2 -> "pacientes";
            case 3 -> "funcionários";
            case 4 -> "atendimentos";
            case 5 -> "atendimentos";
            default -> throw new IllegalStateException("Valor inexperado: " + opcao);
        };

        if (opcao != 5) {
        System.out.println("\n---------- SEÇÃO DE " + secao.toUpperCase() + " ----------");
        System.out.println("1 - Listar - " + secao);
        System.out.println("2 - Inserir - " + secao);
        System.out.println("3 - Buscar por Id - " + secao);
        System.out.println("4 - Editar por Id - " + secao);
        System.out.println("5 - Deletar por Id - " +secao );
        System.out.println("0 - Voltar");
        }

        else if (opcao == 5) {
            MenuFinanceiro.listar(hospital);
        }
    }

}
