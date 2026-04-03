package model;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List <Tarefa> tarefas = new ArrayList<>();
    private int proximoId = 1;

    public void adicionar(String titulo, String descricao){
        Tarefa t = new Tarefa(proximoId, titulo, descricao);
        tarefas.add(t);
        proximoId++;
    }

    public void concluirTarefa (int id){
        for (Tarefa t : tarefas){
        if (t.getId() == id){
            t.concluir();
            break;
            }
        }
    }

    public void reabrirTarefa(int id){
        for (Tarefa t : tarefas){
        if (t.getId() == id){
            t.reabrir();
            break;
            }
        }
    }

    public void remover(int id){
    for (Tarefa t : tarefas){
        if (t.getId() == id){
            tarefas.remove(t);
            break;
            }
        }
    }

    public List<Tarefa> listar() {
    return tarefas;
}
    
}
