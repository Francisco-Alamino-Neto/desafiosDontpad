package desafioDontpad;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n1obj, n2obj, n3obj, n4obj, n5obj, n1dis, n2dis, n3dis, n4dis, n5dis;
        //as variáveis com "obj" no final se referem às notas objetivas, já aquelas com "dis" no final se referem as discursivas.
        
        System.out.println("Digite a nota 1, objetiva e discursiva respectivamente: ");
        n1obj = input.nextDouble();
        n1dis = input.nextDouble();

        System.out.println("Digite a nota 2, objetiva e discursiva respectivamente: ");
        n2obj = input.nextDouble();
        n2dis = input.nextDouble();

        System.out.println("Digite a nota 3, objetiva e discursiva respectivamente: ");
        n3obj = input.nextDouble();
        n3dis = input.nextDouble();
        
        System.out.println("Digite a nota 4, objetiva e discursiva respectivamente: ");
        n4obj = input.nextDouble();
        n4dis = input.nextDouble();
        
        System.out.println("Digite a nota 5, objetiva e discursiva respectivamente: ");
        n5obj = input.nextDouble();
        n5dis = input.nextDouble();

        double mediaobj = (n1obj + n2obj + n3obj + n4obj + n5obj) / 5; //cálculo da média das notas objetivas
        
        double mediadis = (n1dis + n2dis + n3dis + n4dis + n5dis) / 5; //cálculo da média das notas discursivas

        System.out.println("A média das notas objetivas foi: " + mediaobj + ", e a média das discursivas: " + mediadis);
        //A média das notas objetivas foi: 7.7, e a média das discursivas: 8.4.
        input.close();
	}
}