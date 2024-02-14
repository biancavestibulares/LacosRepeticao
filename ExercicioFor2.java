package aula4;

import java.util.Scanner;

public class ExercicioFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10 números inteiros via teclado e mostre na tela quantos números são pares e quantos número são ímpares
		//Variáveis
		int numerosPares = 0;
		int numerosImpares = 0;
		
		Scanner leia = new Scanner(System.in);
		
		//Criando um laço de repetição para que o usuário digite os 10 valores do programa
		for(int i = 0; i < 10; i++) { //Início no indíce 0 até o 9 - 10 números
			System.out.println("Digite o " + (i + 1) + "° número inteiro: ");
			int numero = leia.nextInt();
			
			//Verifica se o número é par ou ímpar
			if(numero % 2 == 0) { //Se o resto é 0, o número é par
				numerosPares++;
			} else {
				numerosImpares++;
			}
		}
		
		//Imprimindo os resultados
		System.out.println("\nTotal de números pares: " + numerosPares);
		System.out.println("Total de números ímpares: " + numerosImpares);
		
	}

}
