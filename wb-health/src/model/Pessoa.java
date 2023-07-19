package model;

import java.util.ArrayList;

public abstract class Pessoa {
    private String nome;
    private String cep;
    private ArrayList<Atendimento> atendimentos;

    public Pessoa(String nome, String cep) {
        this.nome = nome;
        this.cep = cep;
        this.atendimentos = new ArrayList<Atendimento>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public ArrayList<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    public void setAtendimentos(ArrayList<Atendimento> atendimentos) {
        this.atendimentos = atendimentos;
    }

    public void adicionarAtendimento(Atendimento atendimento) {
        this.atendimentos.add(atendimento);
    }
}
