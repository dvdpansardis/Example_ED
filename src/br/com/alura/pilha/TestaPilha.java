package br.com.alura.pilha;

/**
 * 
 * 	LIFO
 * 
 * @author David
 *
 */

public class TestaPilha {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		pilha.insere("david");
		
		System.out.println(pilha);

		pilha.insere("leh");
		
		System.out.println(pilha);
		
		String nome1 = pilha.remove();
		System.out.println(nome1);

		String nome2 = pilha.remove();
		System.out.println(nome2);

		System.out.println(pilha);

		System.out.println(pilha.vazia());

		pilha.insere("teste");
		System.out.println(pilha);
		
		System.out.println(pilha.vazia());
	}

}
