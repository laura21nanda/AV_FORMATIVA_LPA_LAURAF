package Avaliaçãoformativa;

import java.util.Scanner;

public class Ativ2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
	double lado,area;
	
	System.out.println("Informe o valor do lado");
	lado = ler.nextDouble();
			
			area = lado*lado;
			
			System.out.println("O valor da area é: "+ area);
	}

}
