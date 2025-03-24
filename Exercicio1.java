package desafioDontpad;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double n1, n2, n3, media; 

		//variáveis "n" se referem as notas, variável "média" se refere a média dessas notas.

		System.out.println("Digite a nota 1, 2 e 3, respectivamente: ");

		n1 = input.nextDouble();
		n2 = input.nextDouble();
		n3 = input.nextDouble();

		media = (n1 + n2 + n3) / 3;
		//Se a média das notas for maior ou igual a 7, "aprovado!" aparecerá; Caso contrário, "Reprovado" que aparecerá.

		if (media >= 7) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado! Média: " + media);
			}
		input.close();
		}
	}
