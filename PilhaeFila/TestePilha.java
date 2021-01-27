package PilhaeFila;

import java.util.Stack;

public class TestePilha {

public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		
		System.out.println("A pilha de usu�rios �: ");
		
		pilha.push("Geovanna");
		System.out.println(pilha);
		
		pilha.push("F�tima");
		System.out.println(pilha);
		
		System.out.println("A desempilha��o �: ");
		
		String r1 = pilha.pop();
		System.out.println(r1);
		
		String r2 = pilha.pop();
		System.out.println(r2);
		
		System.out.println(pilha.vazia());
		
		pilha.push("Fl�via");
		
		System.out.println(pilha.vazia());

		System.out.println("A pilha atual �: ");
		System.out.println(pilha);

		//Segunda Pilha
		Stack<String> stack = new Stack<String>();
		
		System.out.println("A pilha de usu�rios �: ");
		stack.push("Geovanna");
		stack.push("Fl�via");
		
		System.out.println(stack);
		
		System.out.println("O usu�rio removido foi: ");
		System.out.println(stack.pop());
		
		System.out.println("A pilha atual �: ");
		System.out.println(stack);
		
		System.out.println("O pr�ximo usu�rio a sair �: ");
		String nome = stack.peek();
		System.out.println(nome);
		
		System.out.println("A pilha atual �: ");
		System.out.println(stack);
		
	}
}

