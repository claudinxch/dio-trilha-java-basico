package desafios.Contador.controller;

import java.util.Locale;
import java.util.Scanner;

import desafios.Contador.exceptions.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro parâmentro: ");
		int p1 = scan.nextInt();
		System.out.print("Digite o segundo parâmentro: ");
		int p2 = scan.nextInt();
		
		try{
			contar(p1, p2);
			
		} catch(ParametrosInvalidosException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	static void contar(int p1, int p2) throws ParametrosInvalidosException {
		if (p1 > p2) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}

		int amount = p2 - p1;

		for (int i = 1; i <= amount; i++) {
			System.out.println(i);
		}

	}
}

