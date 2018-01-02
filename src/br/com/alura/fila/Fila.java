package br.com.alura.fila;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * 	FIFO
 * 
 * @author David
 *
 */
public class Fila {

	private List<String> alunos = new LinkedList<>();
	
	public void adiciona(String aluno){
		alunos.add(aluno);
	}
	
	public String remove(){
		return alunos.remove(0);
	}
	
	public boolean vazia(){
		return alunos.isEmpty();
	}
	
	@Override
	public String toString() {
		return alunos.toString();
	}
}
