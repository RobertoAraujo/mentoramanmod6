package br.gov.ac.sefaz.coletions;

import java.util.ArrayList;

public class Carros2 {

	public static void main(String[] args) {
		ArrayList<String> colecao = new ArrayList<String>();
		
		colecao.add("Gol Bola");
		colecao.add("Moto Yamaha");
		colecao.add("carro doido");
		colecao.add("novo carro");
		
		System.out.println(colecao.size());
		System.out.println(colecao.get(1));
		System.out.println();
		
		for(String veiculo: colecao) {
			System.out.println(veiculo);
		}
	}
}
