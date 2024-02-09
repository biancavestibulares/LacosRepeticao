package aula4;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Idade de várias pessoas (números inteiros), e mostre na tela o total de pessoas cuja idade 
		//seja menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos
		//Variáveis
		int idade;
		int menores21 = 0; //Variável que irá guardar os menores de 21
		int maiores50 = 0; //Variável que irá guardar os maiores de 50
		Scanner leia = new Scanner(System.in);
		
		//Informativo gráfico
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~ Menu ~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~ Digite um número negativo para exibir os resultados ~~");
		System.out.println("\n");

		while(true) { //Enquanto o scanner captar dados de acordo com a variável int
			//Loop para recolher os dados da idade
			System.out.println("Insira uma idade: ");
			idade = leia.nextInt();
			
			if(idade < 0) { //Se a idade for menor que 0, o while acaba
				break;
			} else if(idade <  21) { //Se for menor que 21, adiciona valor ao menores21
				menores21++;
			} else if(idade >  50) { //Se for maior que 50, adiciona valor ao maiores50
				maiores50++;
			}
			
		}
		
		//Imprime o resultado assim que um número negativo for inserido
		System.out.println("\nTotal de pessoas menores de 21 anos: " + menores21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiores50);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	}

}
