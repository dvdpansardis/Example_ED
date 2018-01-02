package br.com.alura.fila;

import java.util.LinkedList;
import java.util.Queue;
/**
 * 
 * 	FIFO
 * 
 * @author David
 *
 */
public class TesteDaFila {

	public static void main(String[] args) {
		Fila fila = new Fila();
		
		fila.adiciona("david");
		fila.adiciona("leh");

		System.out.println(fila);
		
		String aluno = fila.remove();

		System.out.println(aluno);
		
		System.out.println(fila);
		
		System.out.println(fila.vazia());
		
		Queue<String> filaDoJava = new LinkedList<>();
		
		filaDoJava.add("David");
		filaDoJava.add("Leh");
		
		System.out.println(filaDoJava);
		
		aluno = filaDoJava.poll();
		
		System.out.println(aluno);
		
		System.out.println(filaDoJava);
		
		System.out.println(filaDoJava.isEmpty());
	}

}
