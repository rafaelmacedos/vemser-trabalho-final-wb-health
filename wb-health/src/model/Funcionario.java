package model;

public class Funcionario extends Pessoa{
    private String cpf;
    private Double salarioMensal;
    public Funcionario(String nome, String cep, String cpf, Double salarioMensal) {
        super(nome, cep);
        this.cpf = cpf;
        this.salarioMensal = salarioMensal;
    }

    // Getters & Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(Double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
