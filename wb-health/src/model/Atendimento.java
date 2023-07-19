package model;

public class Atendimento {
    private Integer id;
    private Paciente paciente;
    private Medico medico;
    private String data;
    private String laudo;
    private Boolean ehPlano;

    public Atendimento(Integer id, Paciente paciente, Medico medico, String data, String laudo, Boolean ehPlano) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.laudo = laudo;
        this.ehPlano = ehPlano;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLaudo() {
        return laudo;
    }

    public void setLaudo(String laudo) {
        this.laudo = laudo;
    }

    public Boolean getEhPlano() {
        return ehPlano;
    }

    public void setEhPlano(Boolean ehPlano) {
        this.ehPlano = ehPlano;
    }


}
