package br.senai.sp.jandira;

import java.util.Scanner;

public class JurosSimples {

	public static void main(String[] args) {
		
		//as variaveis podem ser declaradas na mesma linha se forem do mesmo tipo
		double juros,capital,taxa,tempo;
		Scanner leitor;
		
		leitor = new Scanner(System.in);
		
		System.out.print("Qual é o capital? ");
		capital = leitor.nextDouble();
		
		System.out.print("Qual é a taxa de juros? ");
		taxa = leitor.nextDouble();
		
		System.out.print("Qual o tempo? ");
		tempo = leitor.nextDouble();
		
		juros = capital* taxa / 100* tempo; //J=C.I.T
		
		System.out.println("O valor do juros é: " + juros);	
		
		System.out.printf("Ao final do periodo você terá R$%s " , juros + capital);
		
	}

}
