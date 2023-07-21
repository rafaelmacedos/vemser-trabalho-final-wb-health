package repository;

import model.Atendimento;
import model.Cadastro;
import model.Hospital;

public class AtendimentoRepository implements Cadastro<Atendimento> {
    @Override
    public void cadastrar(Hospital hospital, Atendimento atendimento) {
        hospital.getAtendimentos().add(atendimento);
    }

    @Override
    public void listarTodos(Hospital hospital) {
       hospital.getAtendimentos().forEach(System.out::println);
    }

    @Override
    public void listarPeloId(Hospital hospital, Integer id) {
        for (Atendimento atendimento : hospital.getAtendimentos()) {
            if (atendimento.getId().equals(id)) {
                System.out.println(atendimento);
            }
        }
    }

    @Override
    public void alterarPeloId(Hospital hospital, Integer id, Atendimento atendimentoAtualizado) {
        for (Atendimento atendimento : hospital.getAtendimentos()) {
            if (atendimento.getId().equals(id)) {
                this.setarAtributos(atendimento, atendimentoAtualizado);
            }
        }
    }

    @Override
    public void deletarPeloId(Hospital hospital, Integer id) {
        hospital.getAtendimentos().removeIf(atendimento -> atendimento.getId().equals(id));
    }

    @Override
    public void setarAtributos(Atendimento atendimento, Atendimento atendimentoAtualizado) {
        atendimento.setData(atendimentoAtualizado.getData());
        atendimento.setTipoDeAtendimento(atendimentoAtualizado.getTipoDeAtendimento());
        atendimento.setLaudo(atendimentoAtualizado.getLaudo());
        atendimento.setMedico(atendimentoAtualizado.getMedico());
        atendimento.setPaciente(atendimentoAtualizado.getPaciente());
        atendimento.calcularValorDoAtendimento(atendimentoAtualizado.getTipoDeAtendimento());
    }

}
