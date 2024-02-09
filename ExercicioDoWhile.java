package aula4;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leia números inteiros via teclado, até que o número zero seja digitado.
		//Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos
		//Variáveis
		int numero;
		int somaNumerosPositivos = 0;
		Scanner leia = new Scanner(System.in);
		
		//Informativo gráfico
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~ Menu ~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~ Digite o número 0 para exibir a soma dos positivos ~~");
		System.out.println("\n");
		
		do {
			System.out.println("Digite um número inteiro: ");
			numero = leia.nextInt();
			
			if(numero > 0) { //Se o número for positivo é somado aos outros
				somaNumerosPositivos += numero;
			}
			
		} while(numero != 0); //Assim que o número digitado for 0, o LOOP acaba
		
		//Saída
		System.out.println("A soma dos números positivos é igual a: " + somaNumerosPositivos);
	}

}
