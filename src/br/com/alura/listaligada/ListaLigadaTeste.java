package br.com.alura.listaligada;

public class ListaLigadaTeste {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adicionaNoComeco("david");
        System.out.println(lista);
        lista.adicionaNoComeco("leticia");
        System.out.println(lista);
        lista.adicionaNoComeco("victor");
        System.out.println(lista);
     
        lista.adiciona("teste");
        System.out.println(lista);

        lista.adiciona(2, "teste 2");
        System.out.println(lista);
        
        Object x = lista.pega(2);
        System.out.println(x);
        
        System.out.println(lista.tamanho());
        
        lista.removeDoComeco();
        System.out.println(lista);
        System.out.println(lista.tamanho());
        
    }
}
