package br.com.alura.lista;

import java.util.Arrays;

public class Vetor {

	private Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos = 0;

	private void garantirEspaco() {
		if (totalDeAlunos == alunos.length) {
			// Boa pratica matematica dobrar o tamanho do array
			Aluno[] novoArrayDeAlunos = new Aluno[alunos.length * 2];
			for (int i = 0; i < alunos.length; i++) {
				novoArrayDeAlunos[i] = alunos[i];
			}
			alunos = novoArrayDeAlunos;
		}
	}

	public boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= totalDeAlunos;
	}

	// O(N)
	public void adiciona(int posicao, Aluno aluno) {
		garantirEspaco();
		if (!posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posi��o invalida");
		}
		for (int i = totalDeAlunos - 1; i >= posicao; i--) {
			alunos[i + 1] = alunos[i];
		}
		alunos[posicao] = aluno;
		totalDeAlunos++;
	}

	public void adiciona(Aluno aluno) {
		garantirEspaco();
		alunos[totalDeAlunos] = aluno;
		totalDeAlunos++;
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < totalDeAlunos;
	}

	public Aluno pega(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posi��o invalida");
		}
		return alunos[posicao];
	}

	// O(N)
	public void remove(int posicao) {
		if (!posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posi��o invalida");
		}
		for (int i = posicao; i < totalDeAlunos; i++) {
			alunos[i] = alunos[i + 1];
		}
		totalDeAlunos--;
	}

	// O(N)
	public boolean contem(Aluno aluno) {
		for (int i = 0; i < totalDeAlunos; i++) {
			if (alunos[i].equals(aluno)) {
				return true;
			}
		}
		return false;
	}

	public int tamanho() {
		return totalDeAlunos;
	}

	public String toString() {
		return Arrays.toString(alunos);
	}
}
