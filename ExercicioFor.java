package aula4;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leia 2 números inteiros via teclado, onde o primeiro número deve ser menor do que o segundo número
		//No intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5.
		//Variáveis
		int num1, num2;
		Scanner leia = new Scanner(System.in);
		
		//Recolhendo os valores das variáveis
		System.out.println("Digite o 1° número inteiro: ");
		num1 = leia.nextInt();
		System.out.println("Digite o 2° número inteiro: ");
		num2 = leia.nextInt();
		
		if(num2 > num1) { //Funciona se o num2 for maior que o num1
			System.out.println("No Intervalo entre " + num1 + " e " + num2 + ": ");
			
			for(int i = num1; i < num2; i++) { //FOR que se inicia no num1, e termina no num2
				if(valoresMultiplos(i)) { //Captura o método valoresMultiplos para cada um dos indíces verdadeiros
					System.out.println(i + " é múltiplo de 3 e 5"); 
				}
			}
			
		} else {
			System.out.println("Intervalo Inválido!"); //Caso num2 < num1, sistema invalida
		}

	}
	
	public static boolean valoresMultiplos(int numero) { //Método para verificar se os indíces são multiplos de 3 e 5
		return ((numero % 3 == 0) && (numero % 5 == 0));
	}

}
