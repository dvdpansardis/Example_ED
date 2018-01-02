package br.com.alura.conjunto;

import java.util.HashSet;
import java.util.Set;

public class TesteDoConjunto {

	public static void main(String[] args) {

		Conjunto conjunto = new Conjunto();
		conjunto.adiciona("David");
		System.out.println(conjunto);
		
		conjunto.adiciona("Destoante");
		System.out.println(conjunto);
		
		conjunto.adiciona("Leh");
		System.out.println(conjunto);
		
		conjunto.adiciona("Leh");
		System.out.println(conjunto);
		
		conjunto.remove("Destoante");
		System.out.println(conjunto);
		
		Set<String> conjuntoDoJava = new HashSet<>();
		
		conjuntoDoJava.add("David");
		System.out.println(conjuntoDoJava);
		
		conjuntoDoJava.add("Distoante");
		System.out.println(conjuntoDoJava);
		
		conjuntoDoJava.add("leh");
		System.out.println(conjuntoDoJava);
		
		conjuntoDoJava.remove("Distoante");
		System.out.println(conjuntoDoJava);
		
		
	}

}
