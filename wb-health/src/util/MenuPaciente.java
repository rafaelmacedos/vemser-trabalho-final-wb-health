package util;

import model.Hospital;
import model.Paciente;
import resources.PacienteResource;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuPaciente {
    private static PacienteResource pacienteResource = new PacienteResource();

    public static void listar(Hospital hospital){
        try {
            System.out.println("\n---------- Lista de pacientes ----------");
            pacienteResource.listarTodos(hospital);
        }catch (RuntimeException e){
            System.out.println("Erro ao listar todos" + e.getMessage());
        }
    }

    public static void inserir(Scanner sc, Hospital hospital){
        try {
            Paciente paciente;
            System.out.println("\n---------- Entre com os dados ----------");
            System.out.print("Entre com o nome: ");
            String nome = sc.nextLine();
            System.out.print("Entre com o CEP: ");
            String cep = sc.nextLine();
            System.out.print("Entre com o CPF: ");
            String cpf = sc.nextLine();

            paciente = new Paciente(nome, cep, cpf);

            pacienteResource.inserir(hospital, paciente);
        }catch (RuntimeException e){
            System.out.println("Ocorreu ao inserir: " + e.getMessage());
        }
    }
    public static void listarPeloID(Hospital hospital, Scanner sc) {
        try {
            System.out.println("\n---------- Entre com os dados ----------");
            System.out.print("ID do paciente que deseja buscar: ");
            Integer id = Integer.parseInt(sc.nextLine());
            pacienteResource.listarPeloId(hospital, id);
        }catch (InputMismatchException e){
            System.err.println("Input Inválido! ");
        }
    }

    public static void alterarPeloId(Hospital hospital, Scanner sc){
        try {
            System.out.println("\n---------- Entre com os dados ----------");
            System.out.print("ID do paciente que deseja alterar: ");
            Integer id = Integer.parseInt(sc.nextLine());
            System.out.print("Novo nome do paciente: ");
            String nome = sc.nextLine();
            System.out.print("CPF do paciente: ");
            String cpf = sc.nextLine();
            System.out.print("Novo CEP do paciente: ");
            String cep = sc.nextLine();

            pacienteResource.alterarPeloId(hospital, id, new Paciente(nome, cep, cpf));
        }catch (InputMismatchException e){
            System.err.println("Input Inválido! ");
        }
    }

    public static void deletarPeloId(Hospital hospital, Scanner sc) {
        try {
            System.out.println("\n---------- Entre com os dados ----------");
            System.out.print("ID do paciente que deseja deletar: ");
            Integer id = Integer.parseInt(sc.nextLine());
            pacienteResource.deletarPeloId(hospital, id);
        }catch (InputMismatchException e){
            System.err.println("Input Inválido! ");
        }
    }

}
