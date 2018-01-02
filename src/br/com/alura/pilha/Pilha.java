package br.com.alura.pilha;

/**
 * 
 * 	LIFO
 * 
 * @author David
 *
 */
import java.util.LinkedList;
import java.util.List;


public class Pilha {
	
	private List<String> nomes = new LinkedList<>();
	
	public void insere(String nome){
		this.nomes.add(nome);
	}
	
	public String remove(){
		return nomes.remove(this.nomes.size() - 1);
	}
	
	public boolean vazia(){
		return this.nomes.isEmpty();
	}
	
	@Override
	public String toString() {
		return nomes.toString();
	}
}
