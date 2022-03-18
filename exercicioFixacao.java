package Calculadora;

import java.util.Scanner;

public class exercicioFixacao {

	
	public static void Verifier() {

		Scanner sc=new Scanner(System.in);
		System.out.println("\nDeseja encerrar a aplica��o?\nS para Sim\nN para N�o");
		switch (sc.next().toUpperCase()) {
		
		case "N": 
		Menu();
		break;
		
		default: 
			System.exit(0);
		} 
		
	}
	
	public static void Media() {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Diga um n�mero de cada vez");
		double first = sc.nextInt();
		double second = sc.nextInt();
		double result = (first+second)/2;
		System.out.println("A m�dia entre eles � "+result);
		} catch (Exception SyntaxERROR) {
				System.out.println("N�o foi digitado um numero v�lido");
			} finally {
			Verifier();
			}
	}
	
	public static void Area() {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Diga o tamanho da base");
		int first = sc.nextInt();
		System.out.println("Diga a altura");
		int second = sc.nextInt();
		System.out.println("A area do tringulo �: "+ (first*second)/2);
		} catch (Exception SyntaxERROR) {
			System.out.println("N�o foi digitado um numero v�lido");
		} finally {
		Verifier();
		}
	}
	
	public static void Imc() {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("digita sua altura");
		double altura = sc.nextDouble();
		System.out.println("digita o seu peso");
		int peso = sc.nextInt();
		altura *= altura;
		double IMC = peso/altura;
		System.out.println("IMC �: "+ IMC);
		} catch (Exception SyntaxERROR) {
				System.out.println("N�o foi digitado um numero v�lido");
			} finally {
			Verifier();
			}
	}
	
	public static void Fetch() {
		Scanner sc= new Scanner(System.in);
		try {
		System.out.println("Digite o numero");
		int number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("o numero � par");
		} else {
			System.out.println("o numero � impar");
		}
		} catch (Exception SyntaxERROR) {
			System.out.println("N�o foi digitado um numero v�lido");
		} finally {
		Verifier();
		}
	}
	
	public static void Menu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("\na = M�dia \nb = �rea \nc = IMC \nd = Par ou �mpar");
		switch (sc.next()) {
			case "a":
				Media();
				break;
		
			case "b":
				Area();
				break;
		
			case "c":
				Imc();
				break;
		
			case "d":
				Fetch();
				break;	
			
			default:
				System.out.println("Fun��o n�o encontrada :/");
				Verifier();
		}
	}
	
	public static void main(String[] arg) {
		Menu();
	}
	
}
