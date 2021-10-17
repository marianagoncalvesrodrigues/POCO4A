package lista1;

import java.util.Random;
import java.util.Scanner;

public class Descobrir5 {
	
	public int numero;
	public int advinha=0;
	
	public Descobrir5() {
	}
	
	public void isTheSame (int numero) {
		this.numero  = numero;
		Random descobrir = new Random();
		advinha = descobrir.nextInt(10);
		int contador = 1;
		do {
			if(contador == 3) {
				novaClasse beneficio = new novaClasse();
				System.out.println("BENEFICIO DESBLOQUEADO!!!!!");
				if(beneficio.primo(advinha)) {
					System.out.println("O numero aleatorio eh primo!");
				}else {
					System.out.println("O numero aleatorio nao eh primo!");
				}
			}
			if(advinha == numero) {
				System.out.println("UAUUUUUUUUU!!!!");
			} else if(advinha > numero){
				System.out.println("o numero informado eh menor que o numero aleatorio\nInsira um novo valor:\n");
				Scanner novo_numero = new Scanner(System.in);
				numero = novo_numero.nextInt();
				contador++;
			} else if(advinha < numero) {
				System.out.println("o numero informado eh maior que o numero aleatorio\nInsira um novo valor:\n");
				Scanner novo_numero = new Scanner(System.in);
				numero = novo_numero.nextInt();
				contador++;
			}
			
		}while(numero != advinha);
		System.out.println("Voce advinhou o numero em "+contador+" tentativas!!\n");
	}
}

package lista1;

import java.util.Scanner;
import java.util.Random;

public class Principal5 {

		public Principal5() {
			//constructor
		}
		
		public static void main(String [] args) {
			Descobrir5 numeros = new Descobrir5();
			System.out.println("Advinhe o número entre 1 e 10:");
			Scanner novonumero = new Scanner(System.in);
			int numero = novonumero.nextInt();
			numeros.isTheSame(numero);
		}
}

