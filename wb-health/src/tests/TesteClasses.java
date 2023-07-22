package tests;

import model.*;
import util.Menu;
import util.TipoDeAtendimento;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteClasses {
    public static void main(String[] args) {

        System.out.println(" -- Teste Classe Funcionario: -- ");
        Funcionario f1 = new Funcionario("Lucas Torres", "58401-698", "104.332.454-43", 1350.0);
//        System.out.println(f1.toString());

        System.out.println("\n -- Teste Classe Medico: -- ");
        Medico m1 = new Medico("Drauzio Varella", "084126-320", "15648-0", 30000.00);
//        System.out.println(m1.toString());

        System.out.println("\n -- Teste Classe Paciente: -- ");
        Paciente p1 = new Paciente("Haroldo Bauer", "084126-320", "111.111.111-11");
//        System.out.println(p1.toString());

        System.out.println("\n -- Teste Classe Atendimento: -- ");
        Atendimento a1 = new Atendimento(p1, m1, "21/07/2023", "virose", TipoDeAtendimento.EXAME);
//        System.out.println(a1.toString());

        ArrayList<Medico> medicos = new ArrayList<>();
        medicos.add(m1);
        ArrayList<Paciente> pacientes = new ArrayList<>();
        pacientes.add(p1);
        ArrayList<Atendimento> atendimentos = new ArrayList<>();
        atendimentos.add(a1);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(f1);

        System.out.println();

        try {
            Hospital hospital = new Hospital("cnpj", "WB Health", 15, 2, medicos, pacientes, atendimentos, funcionarios);
            Scanner sc = new Scanner(System.in);
            Integer opcao = -1;

            while (true) {
                Menu.listarMenuGeral();
                opcao = Integer.parseInt(sc.next());
                sc.nextLine();
                if (opcao == 0) {
                    return;
                }
                while (true) {
                    int selecao = -1;
                    Menu.listarSecao(opcao);
                    selecao = Integer.parseInt(sc.next());
                    sc.nextLine();
                    if (selecao == 0) {
                        break;
                    }
                    if (opcao == 1) {
                        switch (selecao) {
                            case 1 -> Menu.listarMedicos(hospital);
                            case 2 -> Menu.inserirMedicos(sc, hospital);
                            case 3 -> Menu.listarMedicoPeloID(hospital, sc);
                            case 4 -> Menu.alterarMedicoPeloId(hospital, sc);
                            case 5 -> Menu.deletarMedicoPeloId(hospital, sc);
                            default -> {
                                System.out.println("Selecione uma das opções!!");;
                            }
                        }
                    }
                }
            }
        } catch (NumberFormatException e){
            System.err.println("Entrada Inválida! " + e.getMessage());
        } catch (RuntimeException e) {
            System.err.println("Ocorreu um erro! " + e.getMessage());
        }finally {
            System.out.println("Obrigado por usar o WB Health, o seu serviço de saúde!");
        }
    }
}
