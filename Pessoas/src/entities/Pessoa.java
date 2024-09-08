package entities;

public class Pessoa implements Comparable<Pessoa> {
	
	private String nome;
	private int idade;
	private double altura;
	
	public Pessoa(String nome, int idade , double altura) {
		this.nome = nome ; 
		this.idade = idade;
		this.altura = altura;
	}
	
	@Override
	public int compareTo(Pessoa p) {
		return Integer.compare(idade, p.getIdade());
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	@Override
	public String toString() {
		return "Nome:  " + nome + ", altura: " +altura+ ", idade: "+ idade;	
	}

}
