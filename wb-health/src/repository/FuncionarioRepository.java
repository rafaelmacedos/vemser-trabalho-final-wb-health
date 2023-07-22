package repository;

import model.Cadastro;
import model.Funcionario;
import model.Hospital;

import java.util.List;

public class FuncionarioRepository implements Cadastro<Funcionario> {
    @Override
    public void cadastrar(Hospital hospital, Funcionario funcionario) {
        hospital.getFuncionarios().add(funcionario);
    }

    @Override
    public void listarTodos(Hospital hospital) {
        hospital.getFuncionarios().forEach(System.out::println);
    }

    @Override
    public void listarPeloId(Hospital hospital, Integer id) {
        for (Funcionario funcionario : hospital.getFuncionarios()) {
            if (funcionario.getId().equals(id)) {
                System.out.println(funcionario);
            }
        }
    }

    @Override
    public void alterarPeloId(Hospital hospital, Integer id, Funcionario funcionarioAtualizado) {
        for (Funcionario funcionario : hospital.getFuncionarios()) {
            if (funcionario.getId().equals(id)) {
                this.setarAtributos(funcionario, funcionarioAtualizado);
            }
        }
    }

    @Override
    public void deletarPeloId(Hospital hospital, Integer id) {
        hospital.getFuncionarios().removeIf(funcionario -> funcionario.getId().equals(id));
    }

    @Override
    public void setarAtributos(Funcionario funcionario, Funcionario funcionarioAtualizado) {
        funcionario.setCpf(funcionarioAtualizado.getCpf());
        funcionario.setSalarioMensal(funcionarioAtualizado.getSalarioMensal());
        funcionario.setCep(funcionarioAtualizado.getCep());
        funcionario.setNome(funcionario.getNome());
    }

    @Override
    public Funcionario buscarId(List<Funcionario> endidade, Integer id) {
        return null;
    }

}
