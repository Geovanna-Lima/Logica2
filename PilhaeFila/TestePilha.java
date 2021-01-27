package PilhaeFila;

import java.util.Stack;

public class TestePilha {

public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		
		System.out.println("A pilha de usuários é: ");
		
		pilha.push("Geovanna");
		System.out.println(pilha);
		
		pilha.push("Fátima");
		System.out.println(pilha);
		
		System.out.println("A desempilhação é: ");
		
		String r1 = pilha.pop();
		System.out.println(r1);
		
		String r2 = pilha.pop();
		System.out.println(r2);
		
		System.out.println(pilha.vazia());
		
		pilha.push("Flávia");
		
		System.out.println(pilha.vazia());

		System.out.println("A pilha atual é: ");
		System.out.println(pilha);

		//Segunda Pilha
		Stack<String> stack = new Stack<String>();
		
		System.out.println("A pilha de usuários é: ");
		stack.push("Geovanna");
		stack.push("Flávia");
		
		System.out.println(stack);
		
		System.out.println("O usuário removido foi: ");
		System.out.println(stack.pop());
		
		System.out.println("A pilha atual é: ");
		System.out.println(stack);
		
		System.out.println("O próximo usuário a sair é: ");
		String nome = stack.peek();
		System.out.println(nome);
		
		System.out.println("A pilha atual é: ");
		System.out.println(stack);
		
	}
}

