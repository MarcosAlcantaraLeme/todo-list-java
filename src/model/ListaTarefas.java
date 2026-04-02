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

}
