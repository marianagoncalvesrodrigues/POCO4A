package lista1;
import java.util.Scanner;

public class Pendulo {
	public int contador, a, b, c;
	classedoC verifica = new classedoC();
	public Pendulo() {
		//constructor
	}
	
	public void Pendulo(int contador) {
		this.contador = contador;
		
			
		if(contador > 30) {
			this.c = 0;
			this.b = b + 1;
			verifica.classedoC();//contabiliza as vezes em que a variavel C foi resetada
		}
		if(b > 30) {
			this.b = 0;
			this.c = 0;
			this.a = a + 1;
			verifica.classedoC();//contabiliza as vezes em que a variavel C foi resetada
		}
		if(a > 30) {
			this.a = 0;
			this.b = 0;
			this.c = c + 1;
		}
		
		System.out.println("A:["+a+",30]         B:["+b+",30]         C:["+c+",30]");
		
	}
	
}

package lista1;

import java.util.Scanner;

public class Principal7{
	public static int oscila, a, b, c;
	public Principal7() {
		//constructor
	}
	
	public static void main(String [] args) {
		Pendulo pendulo = new Pendulo();
		do {
			Scanner Scan = new Scanner(System.in);
			System.out.println("Insira a quantidade de oscilacoes:\n");
			oscila = Scan.nextInt();
			
			pendulo.Pendulo(oscila);
		}while(oscila > 0); // 0 ou inferior sai do laço
	}
	
}
