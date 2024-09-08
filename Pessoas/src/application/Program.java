package application;

import entities.OrdenacaoPessoa;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
		
		ordenacaoPessoa.adicionarPessoa("Wallace Goulart" , 35  , 1.77);
		ordenacaoPessoa.adicionarPessoa("Sergio Henrique" , 29  , 1.73);
		ordenacaoPessoa.adicionarPessoa("Henrique Beltrao" , 30  , 1.82);
		ordenacaoPessoa.adicionarPessoa("Kevin Jose" , 27  , 1.79);
		
		System.out.println(ordenacaoPessoa.ordenarPorAltura());
		System.out.println(ordenacaoPessoa.ordenarPorIdade());
		
		

	}

}
