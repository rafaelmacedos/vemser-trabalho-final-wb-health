package model;

import java.lang.reflect.Parameter;

public interface Agendamento {
    public Boolean agendarAtendimento();
    public Boolean consultarAtendimentos();
    public Boolean consultarAtendimentos(Paciente paciente);

}
