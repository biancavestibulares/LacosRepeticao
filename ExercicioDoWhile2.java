package aula4;

import java.util.Scanner;

public class ExercicioDoWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leia números inteiros via teclado, até que o número zero seja digitado
		//Ao final, mostre na tela a média de todos os números digitados, que sejam múltiplos de 3
		//Variáveis
		int numero;
		int contadorNumerosMultiplos3 = 0;
		int somaNumerosMultiplos3 = 0;
		double mediaNumerosMultiplos3 = 0;

		Scanner leia = new Scanner(System.in);

		//Informativo gráfico
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Menu ~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~ Digite o número 0 para exibir a média dos múltiplos de 3 ~~");
		System.out.println("\n");
		
		do {
			System.out.println("Digite um número inteiro: ");
			numero = leia.nextInt();
			
			if(numero % 3 == 0) { //Se o número for múltiplo de 3
				somaNumerosMultiplos3 += numero; //Soma os valores múltiplos de 3
				contadorNumerosMultiplos3++;
			}
			
		} while(numero != 0); //Assim que o número digitado for 0, o LOOP acaba
		
		//Calculando a média se houver algum número múltiplo de 3
		if(contadorNumerosMultiplos3 > 0) {
			mediaNumerosMultiplos3 = (double) somaNumerosMultiplos3 / contadorNumerosMultiplos3;
		}
		
		//Imprimindo os resultados
		System.out.println("A média de todos os números múltiplos de 3 é: " + mediaNumerosMultiplos3);

	}

}
