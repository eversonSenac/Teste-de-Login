public class Tarefa {

    private String descricao;
    private String status;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.status = "Pendente";
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return status;
    }

    public void alterarStatus(String status) {
        this.status = status;
    }
}