package Avaliaçãoformativa;

import java.util.Scanner;

public class Ativ1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
     double real, celsius, fahrenheit;
     
     System.out.println("Informe a temperatura: ");
     fahrenheit = ler.nextDouble();
      
     celsius = ((fahrenheit-32)*5)/9;
     
     System.out.println("A temperatura convertida para celsius é: " +celsius);
	}

}
