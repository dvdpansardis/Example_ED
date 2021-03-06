package br.com.alura.listaduplamenteligada;

public class ListaDuplamenteLigada {

	private Celula primeira = null;

	private Celula ultima = null;

	private int totalDeElementos = 0;

	public void adicionaNoComeco(Object elemento) {
		if (totalDeElementos == 0) {
			Celula nova = new Celula(elemento);
			this.primeira = nova;
			this.ultima = nova;
		} else {
			Celula nova = new Celula(this.primeira, elemento);
			this.primeira.setAnterior(nova);
			this.primeira = nova;
		}

		totalDeElementos++;
	}

	public void adiciona(Object elemento) {
		if (totalDeElementos == 0) {
			adicionaNoComeco(elemento);
		} else {
			Celula nova = new Celula(elemento);
			this.ultima.setProximo(nova);
			nova.setAnterior(this.ultima);
			this.ultima = nova;
			this.totalDeElementos++;
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
			Celula proxima = anterior.getProximo();
			Celula nova = new Celula(anterior.getProximo(), elemento);
			nova.setAnterior(anterior);
			anterior.setProximo(nova);
			proxima.setAnterior(nova);
			totalDeElementos++;
		}
	}

	public Object pega(int posicao) {
		return pegaCelula(posicao).getElemento();
	}

	public void removeDoComeco() {
		if (totalDeElementos == 0) {
			throw new IllegalArgumentException("lista vazia");
		}

		primeira = primeira.getProximo();
		totalDeElementos--;

		if (totalDeElementos == 0) {
			ultima = null;
		}
	}

	public int tamanho() {
		return totalDeElementos;
	}

	// Vantagem de se usar lista duplamente ligadas.
	public void removeDoFim() {
		if (this.totalDeElementos == 1) {
			this.removeDoComeco();
		} else {
			Celula penultima = this.ultima.getAnterior();
			penultima.setProximo(null);
			this.ultima = penultima;
			this.totalDeElementos--;
		}
	}

	/**
	 * A remoção em uma lista ligada pode ser ou linear ou constante.
	Se você tiver a referência em mãos da célula que será deletada, 
	então o tempo é constante. Afinal, já que você tem anterior e 
	proximo nas mãos, basta acertar as referências.
	Se você precisar procurar pelo elemento primeiro, então o tempo 
	será linear, afinal passará por todas as células no pior caso.
	 * */
	public void remove(int posicao) {
		if (posicao == 0) {
			this.removeDoComeco();
		} else if (posicao == this.totalDeElementos - 1) {
			this.removeDoFim();
		} else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula atual = anterior.getProximo();
			Celula proxima = atual.getProximo();

			anterior.setProximo(proxima);
			proxima.setAnterior(anterior);

			this.totalDeElementos--;
		}

	}
	
	public boolean contem(Object elemento){
		Celula atual = this.primeira;
		
		while(atual != null){
			if(atual.getElemento().equals(elemento)){
				return true;
			}
			atual = atual.getProximo();
		}
		
		return false;
	}

	@Override
	public String toString() {

		if (totalDeElementos == 0) {
			return "[]";
		}

		Celula atual = primeira;

		StringBuilder builder = new StringBuilder("[");

		for (int i = 0; i < totalDeElementos; i++) {
			builder.append(atual.getElemento());
			builder.append(",");

			atual = atual.getProximo();
		}
		builder.append("]");

		return builder.toString();
	}
}
