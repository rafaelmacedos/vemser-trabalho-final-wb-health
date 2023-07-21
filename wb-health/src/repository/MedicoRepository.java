package repository;

import model.Cadastro;
import model.Hospital;
import model.Medico;

public class MedicoRepository implements Cadastro<Medico> {


    @Override
    public void cadastrar(Hospital hospital, Medico medico) {
        hospital.getMedicos().add(medico);
    }

    @Override
    public void listarTodos(Hospital hospital) {
        hospital.getMedicos().forEach(System.out::println);
    }

    @Override
    public void listarPeloId(Hospital hospital, Integer id) {
        for (Medico medico : hospital.getMedicos()) {
            if (medico.getId().equals(id)) {
                System.out.println(medico);
            }
        }

    }

    @Override
    public void alterarPeloId(Hospital hospital, Integer id, Medico medicoAtualizado) {
        for (Medico medico : hospital.getMedicos()) {
            if (medico.getId().equals(id)) {
                this.setarAtributos(medico, medicoAtualizado);
            }
        }
    }

    @Override
    public void deletarPeloId(Hospital hospital, Integer id) {
        hospital.getMedicos().removeIf(medico -> medico.getId().equals(id));
    }

    @Override
    public void setarAtributos(Medico medico, Medico medicoAtualizado) {
        medico.setCrm(medicoAtualizado.getCrm());
        medico.setSalarioMensal(medicoAtualizado.getSalarioMensal());
        medico.setCep(medicoAtualizado.getCep());
        medico.setNome(medicoAtualizado.getNome());

    }


}
