package curso_programacao.ExerciciosRepeticao;

import java.util.Scanner;

public class ExcerciciosWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		exercicio1(sc);
		exercicio2(sc);

	}
	
	public static void exercicio1(Scanner sc) {
//		Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//		incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//		impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
		
		int senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
			
		}
		System.out.println("Acesso permitido");
	}

	public static void exercicio2(Scanner sc) {
//		Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//		um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//		4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//		que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//		mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//		exemplo.
		
		int contadorGasolina = 0, contadorAlcool = 0, contadorDiesel = 0;
		int tipo = sc.nextInt();
		
		while(tipo != 4) {
			
			
			if(tipo == 1) {
				contadorAlcool++;
			}  
			
			else if(tipo == 2) {
				contadorGasolina++;
			} 
			
			else if(tipo == 3) {
				contadorDiesel++;
			} 
			tipo = sc.nextInt();
		}
		
		System.out.println("Muito Obrigado");
		System.out.println("Alcool: "+contadorAlcool);
		System.out.println("Gasolina: "+contadorGasolina);
		System.out.println("Diesel: "+contadorDiesel);
		
		sc.close();
	}
}