package application;

import entities.ListaTarefa;

public class Program {

	public static void main(String[] args) {
		
		ListaTarefa listaTarefa = new ListaTarefa();
		
		System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());		
		
		listaTarefa.adicionarTarefa("Tarefa 01");
		listaTarefa.adicionarTarefa("Tarefa 01");
		listaTarefa.adicionarTarefa("Tarefa 02");
		listaTarefa.adicionarTarefa("Tarefa 03");
		
		System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());	
		
		listaTarefa.removeTarefa("Tarefa 01");
		
		System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());	
		
		
		listaTarefa.obterDescricoestarefas();

	}

}
