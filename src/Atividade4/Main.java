/*Menu de opções: 
 * 1 - media aritmetica, 2- media ponderada 3- sair
Receber duas notas e mostrar a média aritmetica


*/
package Atividade4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Menu de Opções:\n1-Média aritmética\n2-Média Ponderada\n3-Sair");
		System.out.println("Digite a opção desejada: ");
		int opcao = scan.nextInt();
		double nota1, nota2, nota3, peso1, peso2, peso3;
		if (opcao <= 0 || opcao > 3) {
			System.out.println("Opcão inválida");
		}
		switch (opcao) {
		case 1 :
			System.out.println("Nota 1: ");
			nota1 = scan.nextDouble();
			System.out.println("Nota 2: ");
			nota2 = scan.nextDouble();
			double mediaAritmetica = ((nota1 + nota2)/2);
			System.out.println("A média aritmética é: " + mediaAritmetica);
			break;
		case 2:
			System.out.println("Nota 1: ");
			nota1 = scan.nextDouble();
			System.out.println("Peso: ");
			peso1 = scan.nextDouble();
			System.out.println("Nota 2: ");
			nota2 = scan.nextDouble();
			System.out.println("Peso: ");
			peso2 = scan.nextDouble();
			System.out.println("Nota 3: ");
			nota3 = scan.nextDouble();
			System.out.println("Peso: ");
			peso3 = scan.nextDouble();
			double mediaPonderada = (((nota1*peso1) + (nota2*peso2) + (nota3*peso3))/(peso1+peso2+peso3));
			System.out.println("A média aritmética é: " + mediaPonderada);
			break;
		case 3:
			System.out.println("Saindo...");
			break;
		
			
		}

	}

}
