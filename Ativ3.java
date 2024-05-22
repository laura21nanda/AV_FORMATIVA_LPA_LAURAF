package Avaliaçãoformativa;

import java.util.Scanner;

public class Ativ3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double v1,v2,soma, sub, multi;
		String operacao;

		System.out.println("Informe o valor 1");
		v1 = ler.nextDouble();


		System.out.println("Informe o valor 2");
		v2 = ler.nextDouble();

		soma = v1+v2;
		sub = v1-v2;
		multi = v1*v2;


		System.out.println(" Informe a operação desejada multiplicação ou soma ou subtração");
		operacao = ler.next();	

		if (operacao.equals("soma")) {
			System.out.println("O resultado da soma é: " +soma);

		}
		else if (operacao.equals("subtracao")) {
		System.out.println("O resultado da subtracao é: " +sub);
	}
	else {
		System.out.println("O resultado da multiplicacao é: " +multi);

	}
	ler.close();
}
}