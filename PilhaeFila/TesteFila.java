package PilhaeFila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteFila {

	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		fila.adiciona("Geovanna");
		fila.adiciona("Fl�via");
		
		System.out.println("A fila atual �: " +fila);

		String x1 = fila.remove();
		System.out.println("O usu�rio removido foi: ");
		System.out.println(x1);
		
		System.out.println("A fila atual �: ");
		System.out.println(fila);
		
		//Segunda Fila
		Queue<String> FilaDoJava = new LinkedList<String>();
		
		FilaDoJava.add("F�tima");
		System.out.println("A fila atual �: ");
		System.out.println(FilaDoJava);

		System.out.println("O usu�rio removido foi: ");
		String x2 = FilaDoJava.poll();
		
		System.out.println(x2);
		
	}

}
