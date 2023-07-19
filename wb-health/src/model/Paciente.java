package model;

public class Paciente extends Pessoa implements Agendamento{
    private String cpf;
    private Boolean temPlano;

    public Paciente(String nome, String cep, String cpf, Boolean temPlano) {
        super(nome, cep);
        this.cpf = cpf;
        this.temPlano = temPlano;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isTemPlano() {
        return temPlano;
    }

    public void setTemPlano(boolean temPlano) {
        this.temPlano = temPlano;
    }

    @Override
    public Boolean agendarAtendimento() {
        return false;
    }

    @Override
    public Boolean consultarAtendimentos() {
        return false;
    }

    @Override
    public Boolean consultarAtendimentos(Paciente paciente) {
        return false;
    }
}
