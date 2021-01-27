package PilhaeFila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteFila {

	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		fila.adiciona("Geovanna");
		fila.adiciona("Flávia");
		
		System.out.println("A fila atual é: " +fila);

		String x1 = fila.remove();
		System.out.println("O usuário removido foi: ");
		System.out.println(x1);
		
		System.out.println("A fila atual é: ");
		System.out.println(fila);
		
		//Segunda Fila
		Queue<String> FilaDoJava = new LinkedList<String>();
		
		FilaDoJava.add("Fátima");
		System.out.println("A fila atual é: ");
		System.out.println(FilaDoJava);

		System.out.println("O usuário removido foi: ");
		String x2 = FilaDoJava.poll();
		
		System.out.println(x2);
		
	}

}
