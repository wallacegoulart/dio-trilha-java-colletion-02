package entities;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	
	private List<Livro> livroList;
	
	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
	}
	
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	
	public List<Livro> pesquisaPorAutor(String autor){
		List<Livro> livrosPorAutor = new ArrayList<>();
		
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		return livrosPorAutor;
	}
	
	
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> livroPorIntervaloAnos = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for(Livro l :livroList) {
				if(l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao()<= anoFinal) {
					livroPorIntervaloAnos.add(l);
				}
				
			}
		}
		return livroPorIntervaloAnos;
	}
	
	
	public Livro pesquisaPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;
	}
	

}
