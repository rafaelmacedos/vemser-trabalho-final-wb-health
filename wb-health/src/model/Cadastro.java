package model;

public interface Cadastro {
    public void cadastrarPaciente(Paciente paciente);
    public void cadastrarMedico(Medico medico);
    public void alterarCadastro(Paciente paciente);
    public void alterarCadastro(Medico medico);
    public Paciente consultarCadastro(Paciente paciente);
    public Medico consultarCadastro(Medico medico);
}
