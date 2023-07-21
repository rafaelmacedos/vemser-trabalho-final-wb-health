package model;

public class Medico extends Pessoa{
    private String crm;
    private Double salarioMensal;

    public Medico(String nome, String cep, String crm, Double salarioMensal) {
        super(nome, cep);
        this.crm = crm;
        this.salarioMensal = salarioMensal;
    }

    // Getters & Setters
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public void setSalarioMensal(Double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
