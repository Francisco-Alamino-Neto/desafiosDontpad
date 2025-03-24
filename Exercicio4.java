package desafioDontpad;

import java.util.Scanner;

public class Exercicio4 {

		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);

		        double nota; 
		        
		        System.out.println("Digite sua nota: ");
		        nota = input.nextDouble();
		        
		        //Se a nota for maior que 7, "aprovado!" aparecerá; Caso entre 4 e 7, "Você está em recuperação" que aparecerá, se não, "Reprovado" aparecerá.
		        if (nota > 7) {
		            System.out.println("Aprovado! média: " + nota);
		        } else if (nota <= 7 && nota >= 4) {
		            System.out.println("Você está em recuperação! Média: " + nota);
		        } else {
		        	System.out.println("Reprovado! Média: " + nota);
		        }
		        input.close();
		    }
}
