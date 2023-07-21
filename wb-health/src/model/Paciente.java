package model;

public class Paciente extends Pessoa {
    private String cpf;

    public Paciente(String nome, String cep, String cpf, Boolean temPlano) {
        super(nome, cep);
        this.cpf = cpf;
    }

    // Getters & Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
