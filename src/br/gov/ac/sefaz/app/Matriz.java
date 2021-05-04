package br.gov.ac.sefaz.app;

public class Matriz {
	public static void main(String[] args) {
		// istanciando mina lista 
		int[] valor = new int[4];
		//adicionando valores
		valor[0] = 10;
		valor[1] = 20;
		valor[2] = 30;
		valor[3] = 40;
		
		//aqui faco meu for percorrer minha lista
		for(int i = 0; i < valor.length; i++)
			// aqui eum imprimo
		System.out.println(valor[i]);
		
		
		int[] valoresReversos = new  int[valor.length];
		
		//invertendo a posição do array de tras pra frente
		int valorMaximo = valor.length -1;
		for(int i = valorMaximo; i>= 0; i-- ) {
			System.out.println(valor[i]);
 		}
		
		for(int i = 0; i < valor.length; i++) {
			// aqui faço a reversão de valores
			valoresReversos[valorMaximo -1] = valor[i];	
			System.out.println("Valores reversos "+valoresReversos[i]);
			}
	}
	
	
}
