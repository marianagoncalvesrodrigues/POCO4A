/**
* @file ex2.java
* @author Mariana Goncalves Rodrigues, Anderson Soares da Silva
* @r.a: 2151014 e 2150875
* @date 04 OUT 2021
* @brief adicao de funcionalidade que soma valores */
package lista1;

public class ex2 {
	
	private double valor1;
	private double valor2;
	private double resultado;
	
	public ex2() {
		
	}
	
	public ex2(double valor1, double valor2, double resultado) {
		soma(valor1, valor2, resultado);
	}
	
	public void soma(double valor1, double valor2, double resultado) {
		this.valor1= valor1;
		this.valor2 = valor2;
		this.resultado = valor1 + valor2;
	}
	
	public String toString(){
		return "valor 1:" + this.valor1 +
				"\nvalor 2: " + this.valor2 +
				"\nresultado: " + this.resultado;				
	}
}
//////////// a classe ex2 é chamada na linha 117 na classe do ex1, como pode ser visto a seguir o codigo do ex1 com a classe ex2 inserida//////
package lista1;

import java.lang.Math;
import java.util.Scanner;

public class ex1 {
	public ex1() {
		
	}
	
	public static void Abs(double valor1, double valor2, double resultado1, double
resultado2) {
		resultado1 = Math.abs(valor1);
		resultado2 = Math.abs(valor2);
		System.out.println("O modulo do valor 1 eh:" + resultado1 + "\nO modulo
do valor 2 eh:" + resultado2);
	}
	public static void Ceil(double valor1, double valor2, double resultado1, double
resultado2) {
		resultado1 = Math.ceil(valor1);
		resultado2 = Math.ceil(valor2);
		System.out.println("O valor arredondado para cima do valor 1 eh:" + 
resultado1 + "\nO valor arredondado do valor 2 eh:" +
resultado2);
	}
	public static void Cos(double valor1, double valor2, double resultado1, double
resultado2) {
		resultado1 = Math.cos(valor1);
		resultado2 = Math.cos(valor2);
		System.out.println("O cosseno do valor 1 eh:" + resultado1 + "\nO
cosseno do valor 2 eh:" + resultado2);
	}
	public static void Exp(double valor1, double valor2, double resultado1, double
resultado2) {
		resultado1 = Math.exp(valor1);
		resultado2 = Math.exp(valor2);
		System.out.println("O exp do valor 1 eh:" + resultado1 + "\nO exp do
valor 2 eh:" + resultado2);
	}
	public static void Floor(double valor1, double valor2, double resultado1,
double resultado2) {
		resultado1 = Math.floor(valor1);
		resultado2 = Math.floor(valor2);
		System.out.println("O valor arredondado para baixo do valor 1 eh:" + 
resultado1 + "\nO valor arredondado para baixo do valor 2 eh:" +
resultado2);
	}
	public static void Log(double valor1, double valor2, double resultado1, double
resultado2) {
		resultado1 = Math.log(valor1);
		resultado2 = Math.log(valor2);
		System.out.println("O log do valor 1 na base 10 eh:" + resultado1 + "\nO
log do valor 2 na base 10 eh:" + resultado2);
	}
	public static void Max(double valor1, double valor2, double resultado1, double
resultado2) {
		resultado1 = Math.max(valor1, valor2);
		System.out.println("O valor max entre o valor 1 e o valor 2 eh:" +
resultado1);
	}
	public static void Min(double valor1, double valor2, double resultado1, double
resultado2) {
		resultado1 = Math.min(valor1, valor2);
		System.out.println("O valor min entre o valor 1 e o valor 2 eh:" + 
resultado1);
	}
	public static void Pow(double valor1, double valor2, double resultado1, double
resultado2) {
		resultado1 = Math.pow(valor1, valor2);
		resultado2 = Math.pow(valor2, valor1);
		System.out.println("O valor 1 elevado ao valor 2 eh:" + resultado1 +
"\nO valor 2 elevado ao valor 1 eh:" + resultado2);
	}
	public static void Sqrt(double valor1, double valor2, double resultado1, double
resultado2) {
		resultado1 = Math.sqrt(valor1);
		resultado2 = Math.sqrt(valor2);
		System.out.println("A raiz do valor 1 eh:" + resultado1 + "\nA raiz do
valor 2 eh:" + resultado2);
	}
	public static void soma(double valor1, double valor2, double resultado1) {
		ex2 mais = new ex2();
		mais.soma(valor1, valor2, resultado1);
		System.out.println(mais.toString());
	}

	
	public static void main(String [] args) {
		double valor1, valor2, resultado1=0, resultado2=0;
		int escolha=0;
		
		
			
			Scanner objeto = new Scanner(System.in);
			
			System.out.println("Insira o valor 1:\n");
			valor1 = objeto.nextDouble();
			
			System.out.println("Insira o valor 2:\n");
			valor2 = objeto.nextDouble();
			
		do {	
			System.out.println("Escolha a operação que desejar:\n1-Abs\n2-Ceil\n3-Cos\n4-Exp\n5-Floor\n6-Log\n7-Max\n8-Min\n9-Pow\n10-Sqrt\n11-soma\n0-Sair\n");
			escolha = objeto.nextInt();
			
			switch(escolha){
				case 1:
					Abs(valor1, valor2, resultado1, resultado2);
					break;
				case 2:	
					Ceil(valor1, valor2, resultado1, resultado2);
					break;
				case 3:
					Cos(valor1, valor2, resultado1, resultado2);
					break;
				case 4:
					Exp(valor1, valor2, resultado1, resultado2);
					break;
				case 5:
					Floor(valor1, valor2, resultado1, resultado2);
					break;
				case 6:
					Log(valor1, valor2, resultado1, resultado2);
					break;
				case 7:
					Max(valor1, valor2, resultado1, resultado2);
					break;
				case 8:
					Min(valor1, valor2, resultado1, resultado2);
					break;
				case 9:
					Pow(valor1, valor2, resultado1, resultado2);
					break;
				case 10:
					Sqrt(valor1, valor2, resultado1, resultado2);
					break;
				case 11:
					soma(valor1, valor2, resultado1);
					break;
			}
			if(escolha < 0 || escolha > 11) {
				System.out.println("Opcao invalida, tente novamente!\n");
			}
		}while(escolha!=0);
		
		System.out.println("O programa encerrou!");
		
	}
}

