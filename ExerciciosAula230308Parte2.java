package br.com.fiap;

import java.util.Scanner;

public class ExerciciosAula230308Parte2 {

	public static void main(String[] args) {
		int anoNascido = 0, anoAtual = 0;
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite o ano de seu nascimento: ");
			anoNascido = scan.nextInt();
			System.out.println("Digite o ano atual: ");
			anoAtual = scan.nextInt();
			System.out.println("Sua idade é " + (anoAtual - anoNascido));
		} catch (Exception e) {
			System.out.println("Formato inválido");
		}

	}

}
