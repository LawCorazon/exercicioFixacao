package Calculadora;

import java.util.Scanner;

public class exercicioFixacao {

	
	public static void Verifier() {

		Scanner sc=new Scanner(System.in);
		System.out.println("\nDeseja encerrar a aplicação?\nS para Sim\nN para Não");
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
		System.out.println("Diga um número de cada vez");
		double first = sc.nextInt();
		double second = sc.nextInt();
		double result = (first+second)/2;
		System.out.println("A média entre eles é "+result);
		} catch (Exception SyntaxERROR) {
				System.out.println("Não foi digitado um numero válido");
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
		System.out.println("A area do tringulo é: "+ (first*second)/2);
		} catch (Exception SyntaxERROR) {
			System.out.println("Não foi digitado um numero válido");
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
		System.out.println("IMC é: "+ IMC);
		} catch (Exception SyntaxERROR) {
				System.out.println("Não foi digitado um numero válido");
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
			System.out.println("o numero é par");
		} else {
			System.out.println("o numero é impar");
		}
		} catch (Exception SyntaxERROR) {
			System.out.println("Não foi digitado um numero válido");
		} finally {
		Verifier();
		}
	}
	
	public static void Menu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("\na = Média \nb = Área \nc = IMC \nd = Par ou Ímpar");
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
				System.out.println("Função não encontrada :/");
				Verifier();
		}
	}
	
	public static void main(String[] arg) {
		Menu();
	}
	
}
