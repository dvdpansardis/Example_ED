package br.com.alura.pilha;

import java.util.Stack;

public class TestaStack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("david");
		
		System.out.println(stack);

		stack.push("leh");
		
		System.out.println(stack);
		
		stack.pop();

		System.out.println(stack);

		stack.pop();
		
		System.out.println(stack);
		
		System.out.println(stack.isEmpty());
		
		stack.push("teste");

		System.out.println(stack);

		System.out.println(stack.isEmpty());
		
		String peek = stack.peek();
		
		System.out.println(peek);

		System.out.println(stack);
		
		
	}

}
