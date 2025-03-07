package curso_programacao.ExerciciosRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosFor {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
//		exercicio1(sc);
//		exercicio2(sc);
//		exercicio3(sc);
//		exercicio4(sc);

	}

	public static void exercicio1(Scanner sc) {
//		Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//		X, se for o caso.

		System.out.println("Digite o valor de X");
		int x = sc.nextInt();
		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

	public static void exercicio2(Scanner sc) {
//	Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//	Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//	essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo

		int in = 0, out = 0, x = 0;
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			x = sc.nextInt();
			if (x <= 20 && x >= 10) {
				in++;
			} else {
				out++;
			}
		}

		System.out.println(in + " in");
		System.out.println(out + " out");
	}

	public static void exercicio3(Scanner sc) {
//	Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//	de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//	conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//	peso 5.	

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double media = (a * 2 + b * 3 + c * 5) / 10;

			System.out.printf("%.1f%n", media);
		}

	}

	public static void exercicio4(Scanner sc) {
//		Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//		de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//		conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//		peso 5.

		int n = sc.nextInt();
		double divisao = 0;
		
		for (int i = 0; i < n; i++) {
			
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			if (num2 == 0) {
				System.out.println("Divisão impossivel");		
			} 
			else {
				divisao = (double) num1 / num2;
				System.out.printf("%.1f%n", divisao);
			}

		}

	}

}
