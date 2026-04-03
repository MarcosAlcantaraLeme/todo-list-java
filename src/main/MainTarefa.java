package main;

import java.util.Scanner;
import model.ListaTarefas;
import model.Tarefa;

public class MainTarefa {
    public static void main(String[] args) {
        ListaTarefas l = new ListaTarefas();
        Scanner sc = new Scanner (System.in);
        int opcao = 0;

        while (opcao != 6){
            System.out.println("1.Adicionar Tarefa a lista");
            System.out.println("2.Remover Tarefa da lista");
            System.out.println("3.Mostrar Tarefas da lista");
            System.out.println("4.Marcar Tarefa da lista como concluido");
            System.out.println("5.Reabrir Tarefa da lista");
            System.out.println("6.Encerrar programa");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                sc.nextLine();
                System.out.println("Título da tarefa");
                String titulo = sc.nextLine();

                System.out.println("Descrição da tarefa");
                String descricao = sc.nextLine();

                l.adicionar(titulo, descricao);
                System.out.println("Tarefa adicionada com sucesso");

                break;

                case 2:
                if (l.listar().isEmpty()) {
                    System.out.println("Não há tarefas a serem removidas");
                    break;
                }
                for (Tarefa t : l.listar()){
                    System.out.println(t);
                }
                System.out.println("Id da tarefa que deseja remover");
                int id = sc.nextInt();

                l.remover(id);
                System.out.println("Tarefa removida com sucesso");

                break;


                case 3:
                if (l.listar().isEmpty()) {
                    System.out.println("Não há tarefas a serem mostradas");
                    break;
                }
                for (Tarefa t : l.listar()){
                    System.out.println(t);
                }
                
                break;

                case 4:
                if (l.listar().isEmpty()) {
                    System.out.println("Não há tarefas a serem concluidas");
                    break;
                }
                for (Tarefa t : l.listar()){
                    System.out.println(t);
                }
                System.out.println("Qual tarefa deseja mudar pra concluido?");
                id = sc.nextInt();

                l.concluirTarefa(id);
                System.out.println("Tarefa marcada como concluido com sucesso");
                break;

                case 5:
                if (l.listar().isEmpty()) {
                    System.out.println("Não há tarefas a serem reabertas");
                    break;
                }
                for (Tarefa t : l.listar()){
                    System.out.println(t);
                }
                System.out.println("Qual tarefa deseja reabrir");
                id = sc.nextInt();

                l.reabrirTarefa(id);
                System.out.println("A tarefa foi aberta novamente");

                break;

                case 6:
                System.out.println("Encerrando o programa");
                break;
            }
        }
        sc.close();
    }
}
