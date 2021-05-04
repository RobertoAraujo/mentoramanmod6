package br.gov.ac.sefaz.app;

import java.util.Scanner;

import br.gov.ac.sefaz.classes.Carro;

public class MainCarro {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Carro carro = new Carro();
		
		System.out.println("Ocarro esta ligado ! ");
		boolean x =  entrada.nextBoolean();
		carro.methodoLigar(x);
		
		System.out.println("O carro Esta parado ?");
		boolean carroP = entrada.nextBoolean();
		carro.methodoParad(carroP);
		
	
		System.out.println("Qual a cor do carro ? ");
		int cor = entrada.nextInt();
		carro.methodoCor( cor);
		
		
		System.out.println("O carro tem ar ? ");
		boolean Ar = entrada.nextBoolean();
		carro.methodoAr(Ar);
		
		System.out.println("O carro tem som ?");
		String som = entrada.next();
		System.out.println(""+som);
		
		System.out.println("qual o motor do carro ?");
		String motor = entrada.next();
		System.out.println(""+motor);
		
		
		entrada.close();
	}

}
