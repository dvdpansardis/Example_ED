package br.com.alura.listaligada;

public class ListaLigada {

	private Celula primeira = null;

	private Celula ultima = null;

	private int totalDeElementos = 0;

	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(elemento, primeira);
		primeira = nova;

		if (totalDeElementos == 0) {
			ultima = primeira;
		}

		totalDeElementos++;
	}

	public void adiciona(Object elemento) {
		if (totalDeElementos == 0) {
			adicionaNoComeco(elemento);
		} else {
			Celula nova = new Celula(elemento, null);
			ultima.setProximo(nova);
			ultima = nova;
			totalDeElementos++;
		}
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < totalDeElementos;
	}

	private Celula pegaCelula(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posicao invalida");
		}

		Celula atual = primeira;

		for (int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}

		return atual;
	}

	public void adiciona(int posicao, Object elemento) {
		if (posicao == 0) {
			adicionaNoComeco(elemento);
		} else if (posicao == totalDeElementos) {
			adiciona(elemento);
		} else {
			Celula anterior = pegaCelula(posicao - 1);
			Celula nova = new Celula(elemento, anterior.getProximo());
			anterior.setProximo(nova);
			totalDeElementos++;
		}
	}

	public Object pega(int posicao) {
		return pegaCelula(posicao).getElemento();
	}

	public void removeDoComeco(){
		if(totalDeElementos == 0){
			throw new IllegalArgumentException("lista vazia");
		}
		
		primeira = primeira.getProximo();
		totalDeElementos--;
		
		if(totalDeElementos == 0){
			ultima = null;
		}
	}
	
	public void remove(int posicao) {

	}

	public int tamanho() {
		return totalDeElementos;
	}

	public boolean contem(Object elemento) {
		return false;
	}

	@Override
	public String toString() {

		if (totalDeElementos == 0) {
			return "[]";
		}

		Celula atual = primeira;

		StringBuilder builder = new StringBuilder("[");

		while(atual.getProximo() != null) {
		//for (int i = 0; i < totalDeElementos; i++) {
			builder.append(atual.getElemento());
			builder.append(",");

			atual = atual.getProximo();
		}
		builder.append("]");

		return builder.toString();
	}
}
