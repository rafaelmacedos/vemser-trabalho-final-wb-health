package model;

public interface Cadastro <T> {
    public void cadastrar(Hospital hospital, T entidade);
    public void listarTodos(Hospital hospital);
    public void listarPeloId(Hospital hospital, Integer id);
    public void alterarPeloId(Hospital hospital, Integer id);
    public void deletarPeloId(Hospital hospital, Integer id);
}
