/*Equação de 2 grau.
delta= b^2 -4ac
x' = (-b+raiz(delta))/2a
x" = (-b-raiz(delta))/2a

*/
package Atividade2;

import java.util.Scanner;
import java.math.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int a, b, c;
		System.out.println("Informe o valor de a: ");
		a=scan.nextInt();
		System.out.println("Informe o valor de b: ");
		b=scan.nextInt();
		System.out.println("Informe o valor de c: ");
		c=scan.nextInt();
		double delta = (b*b)-(4*a*c);
		double x1 = ((-b+Math.sqrt(delta))/(2*a));
		double x2 = ((-b-Math.sqrt(delta))/(2*a));
		System.out.println("O valor de x1= " + x1);
		System.out.println("O valor de x2= " + x2);
	}

}
