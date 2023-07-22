package util;

import model.Hospital;
import model.Medico;
import resources.MedicoResource;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private static MedicoResource medicoResource = new MedicoResource();
    public static void listarMenuGeral(){
        System.out.println("---------- ESCOLHA UMA OPÇÃO ----------");
        System.out.println("1 - Seção de Médicos");
        System.out.println("2 - Seção de Paciente");
        System.out.println("3 - Seção de Atendimento");
        System.out.println("0 - Sair");
    }

    public static void listarSecao(int opcao){
        String secao = switch (opcao) {
            case 1 -> "médicos";
            case 2 -> "pacientes";
            case 3 -> "atendimentos";
            default -> throw new IllegalStateException("Valor inexperado: " + opcao);
        };
        System.out.println("\n---------- SEÇÃO DE " + secao.toUpperCase() + " ----------");
        System.out.println("1 - Listar - " + secao);
        System.out.println("2 - Inserir - " + secao);
        System.out.println("3 - Buscar por Id - " + secao);
        System.out.println("4 - Editar por Id - " + secao);
        System.out.println("5 - Deletar por Id - " +secao );
        System.out.println("0 - Voltar");
    }

    public static void listarMedicos(Hospital hospital){
        try {
            System.out.println("\n---------- Lista de médicos ----------");
            medicoResource.listarTodos(hospital);
        }catch (RuntimeException e){
            System.out.println("Erro ao listar todos" + e.getMessage());
        }
    }

    public static void inserirMedicos(Scanner sc, Hospital hospital){
        try {
            Medico medico;
            System.out.println("\n---------- Entre com os dados ----------");
            System.out.print("Entre com o nome: ");
            String nome = sc.nextLine();
            System.out.print("Entre com o CEP: ");
            String cep = sc.nextLine();
            System.out.print("Entre com o CRM: ");
            String crm = sc.nextLine();
            System.out.print("Entre com o salário mensal: ");
            double salario = sc.nextDouble();
            sc.nextLine();
            medico = new Medico(nome, cep, crm, salario);

            medicoResource.inserir(hospital, medico);
        }catch (RuntimeException e){
            System.out.println("Ocorreu ao inserir: " + e.getMessage());
        }
    }
    public static void listarMedicoPeloID(Hospital hospital, Scanner sc) {
        try {
            System.out.println("\n---------- Entre com os dados ----------");
            System.out.print("ID do médico que deseja buscar: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            medicoResource.listarPeloId(hospital, id);
        }catch (InputMismatchException e){
            System.err.println("Input Inválido! ");
        }
    }

    public static void alterarMedicoPeloId(Hospital hospital, Scanner sc){
        try {
            System.out.println("\n---------- Entre com os dados ----------");
            System.out.print("ID do médico que deseja alterar: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Novo nome do médico: ");
            String nome = sc.nextLine();
            System.out.print("CRM do médico: ");
            String crm = sc.nextLine();
            System.out.print("Novo CEP do médico: ");
            String cep = sc.nextLine();
            System.out.print("Novo salário do médico: ");
            Double salario = sc.nextDouble();

            medicoResource.alterarPeloId(hospital, id, new Medico(nome, cep, crm, salario));
        }catch (InputMismatchException e){
            System.err.println("Input Inválido! ");
        }
    }

    public static void deletarMedicoPeloId(Hospital hospital, Scanner sc) {
        try {
            System.out.println("\n---------- Entre com os dados ----------");
            System.out.print("ID do médico que deseja deletar: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            medicoResource.deletarPeloId(hospital, id);
        }catch (InputMismatchException e){
            System.err.println("Input Inválido! ");
        }
    }


}
