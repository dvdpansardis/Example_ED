package br.com.alura.conjunto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjunto {

	private List<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();

	public Conjunto() {
		for (int i = 0; i < 26; i++) {
			tabela.add(new LinkedList<String>());
		}
	}

	public void remove(String palavra){
		if(contem(palavra)){
			int indice = calculaIndiceDaTabela(palavra);
			tabela.get(indice).remove(palavra);
		}
	}
	
	public void adiciona(String palavra) {
		if (!contem(palavra)) {
			int indice = calculaIndiceDaTabela(palavra);

			List<String> lista = tabela.get(indice);
			lista.add(palavra);
		}
	}

	private boolean contem(String palavra) {
		int indice = calculaIndiceDaTabela(palavra);
		return tabela.get(indice).contains(palavra);
	}

	private int calculaIndiceDaTabela(String palavra) {
		return palavra.toLowerCase().charAt(0) % 26;
	}

	@Override
	public String toString() {
		return tabela.toString();
	}
}
