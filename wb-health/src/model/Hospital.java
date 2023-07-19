package model;

import java.util.ArrayList;

public class Hospital implements Cadastro, Agendamento {
    private String cnpj;
    private String nome;
    private Integer numeroLeitos;
    private Integer leitosOcupados;
    private ArrayList<Medico> medicos;
    private ArrayList<Paciente> pacientes;
    private ArrayList<Atendimento> atendimentos;

    public Hospital(String cnpj, String nome, Integer numeroLeitos, Integer leitosOcupados, ArrayList<Medico> medicos, ArrayList<Paciente> pacientes, ArrayList<Atendimento> atendimentos) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.numeroLeitos = numeroLeitos;
        this.leitosOcupados = leitosOcupados;
        this.medicos = medicos;
        this.pacientes = pacientes;
        this.atendimentos = atendimentos;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroLeitos() {
        return numeroLeitos;
    }

    public void setNumeroLeitos(Integer numeroLeitos) {
        this.numeroLeitos = numeroLeitos;
    }

    public Integer getLeitosOcupados() {
        return leitosOcupados;
    }

    public void setLeitosOcupados(Integer leitosOcupados) {
        this.leitosOcupados = leitosOcupados;
    }

    public ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(ArrayList<Medico> medicos) {
        this.medicos = medicos;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public ArrayList<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    public void setAtendimentos(ArrayList<Atendimento> atendimentos) {
        this.atendimentos = atendimentos;
    }


    @Override
    public void cadastrarPaciente(Paciente paciente) {

    }

    @Override
    public void cadastrarMedico(Medico medico) {

    }

    @Override
    public void alterarCadastro(Paciente paciente) {

    }

    @Override
    public void alterarCadastro(Medico medico) {

    }

    @Override
    public Paciente consultarCadastro(Paciente paciente) {
        return null;
    }

    @Override
    public Medico consultarCadastro(Medico medico) {
        return null;
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
