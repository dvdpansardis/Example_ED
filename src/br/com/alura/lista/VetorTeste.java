package br.com.alura.lista;

public class VetorTeste {

	// ARMAZENAMENTO SEQUENCIAL
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("david");
		Aluno aluno2 = new Aluno("joao");

		Vetor vetor = new Vetor();

		System.out.println(vetor.tamanho());
		vetor.adiciona(aluno1);
		System.out.println(vetor.tamanho());
		vetor.adiciona(aluno2);
		System.out.println(vetor.tamanho());

		System.out.println(vetor);

		System.out.println(vetor.contem(aluno1));

		Aluno aluno3 = new Aluno("leticia");

		System.out.println(vetor.contem(aluno3));

		System.out.println(vetor.pega(0));

		vetor.adiciona(1, aluno3);
		System.out.println(vetor);

		vetor.remove(1);
		System.out.println(vetor);
		
		for(int i = 0; i < 300; i++){
			Aluno alunoTeste = new Aluno("Joao " + i);
			vetor.adiciona(alunoTeste);
		}
		System.out.println(vetor);
		
	}

}
