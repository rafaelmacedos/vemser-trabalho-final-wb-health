package model;

import java.lang.reflect.Parameter;
import java.util.ArrayList;

public class Medico extends Pessoa implements Agendamento{
    private String crm;
    private Double salarioMensal;

    public Medico(String nome, String cep, String crm, Double salarioMensal) {
        super(nome, cep);
        this.crm = crm;
        this.salarioMensal = salarioMensal;
    }

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
