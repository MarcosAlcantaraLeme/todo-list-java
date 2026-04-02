package model;

public class Tarefa {

    private final int id;
    private String titulo;
    private String descricao;
    private boolean concluido;

    public Tarefa(int id, String titulo, String descricao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluido = false;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void concluir() {
        this.concluido = true;
    }

    public void reabrir() {
        this.concluido = false;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluido() {
        return concluido;
    }

    @Override
    public String toString() {
        return "ID: " + id
                + " | Título: " + titulo
                + " | Concluído: " + (concluido ? "Sim" : "Não");
    }
}
