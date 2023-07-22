package repository;

import model.Cadastro;
import model.Hospital;
import model.Paciente;

import java.util.List;

public class PacienteRepository implements Cadastro<Paciente> {

    @Override
    public void cadastrar(Hospital hospital, Paciente paciente) {
        hospital.getPacientes().add(paciente);
    }

    @Override
    public void listarTodos(Hospital hospital) {
        hospital.getPacientes().forEach(System.out::println);
    }

    @Override
    public void listarPeloId(Hospital hospital, Integer id) {
        for (Paciente paciente : hospital.getPacientes()) {
            if (paciente.getId().equals(id)) {
                System.out.println(paciente);
            }
        }
    }

    @Override
    public void alterarPeloId(Hospital hospital, Integer id, Paciente pacienteAtualizado) {
        for (Paciente paciente : hospital.getPacientes()) {
            if (paciente.getId().equals(id)) {
                this.setarAtributos(paciente, pacienteAtualizado);
            }
        }
    }

    @Override
    public void deletarPeloId(Hospital hospital, Integer id) {
        hospital.getPacientes().removeIf(paciente -> paciente.getId().equals(id));
    }

    @Override
    public void setarAtributos(Paciente paciente, Paciente pacienteAtualizado) {
        paciente.setCpf(pacienteAtualizado.getCpf());
        paciente.setCep(pacienteAtualizado.getCep());
        paciente.setNome(pacienteAtualizado.getNome());
    }

    @Override
    public Paciente buscarId(List<Paciente> endidade, Integer id) {
        return null;
    }
}
