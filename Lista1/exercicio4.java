/**
* @file Ex4.java
* @author Mariana Goncalves Rodrigues, Anderson Soares da Silva
* @r.a: 2151014 e 2150875
* @date 04 OUT 2021
* @brief  cadastro de veiculos no estacionamento e calculo da tarifa, com diferença 
* para valores em que o veiculo é uma moto.
*/

package lista1;

import java.time.LocalTime;

public class Ex4 {
	
	public String veiculo;
	public String tipo;
	public String placa;
	public LocalTime chegada;
	public LocalTime saida;
	public LocalTime diferenca;
	
	public Ex4() {
		
	}
	
	public Ex4(String veiculo, String tipo, String placa, int hChegada, int mChegada, int hSaida, int mSaida) {
		cad(veiculo, tipo, placa, hChegada, mChegada, hSaida, mSaida);
	}
	
	public void cad(String veiculo, String tipo, String placa, int hChegada, int mChegada, int hSaida, int mSaida) {
		this.veiculo = veiculo;
		this.tipo = tipo;
		this.placa = placa;
		this.chegada = LocalTime.of(hChegada, mChegada);
		this.saida = LocalTime.of(hSaida, mSaida);
		this.diferenca = saida.minusHours(hChegada).minusMinutes(mChegada);
	}
	
	public String toString() {
		if (this.diferenca.getMinute() < 30 && this.diferenca.getHour() == 0) {
			return 	this.tipo + " (" + 
					this.placa + ")\nChegada: " + 
					this.chegada + "\nSaída: " + 
					this.saida + "\nValor: Gratuito\n";
		} else if (this.diferenca.getMinute() >= 30 && this.diferenca.getHour() == 0) {
			return 	this.tipo + " (" + 
					this.placa + ")\nChegada: " + 
					this.chegada + "\nSaída: " + 
					this.saida + "\nValor: R$5,00\n";
		} else {
			return 	this.tipo + " (" + 
					this.placa + ")\nChegada: " + 
					this.chegada + "\nSaída: " + 
					this.saida + "\nValor: R$10,00\n";
		}
	}

}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
package lista1;

import java.time.LocalTime;

import java.util.Scanner;

public class Ex3 {
	String tipo;
	String placa;
	LocalTime chegada;
	LocalTime saida;
	LocalTime diferenca;
	
	//métodos construtores
	public Ex3() {
		
	}
	public Ex3(String tipo, String placa, int hChegada, int mChegada, int hSaida, int mSaida) {
		cadastro(tipo, placa, hChegada, mChegada, hSaida, mSaida);
	}
	
	public void cadastro(String tipo, String placa, int hChegada, int mChegada, int hSaida, int mSaida) {     
			this.tipo = tipo;
			this.placa = placa;
			this.chegada = LocalTime.of(hChegada, mChegada);
			this.saida = LocalTime.of(hSaida, mSaida);
			this.diferenca = saida.minusHours(hChegada).minusMinutes(mChegada);
	}
	
	public static void main(String[] args){
		String tipo, placa, veiculo;
		String Moto = "moto";
		int hChegada, mChegada, hSaida, mSaida;
		
		Scanner objeto = new Scanner(System.in);
		
		System.out.println("Insira o tipo do seu veiculo:\n");
		veiculo = objeto.nextLine();
		
		System.out.println("Insira o modelo do seu veiculo:\n");
		tipo = objeto.nextLine();
		
		System.out.println("Insira a placa do seu veiculo:\n");
		placa = objeto.nextLine();
		
		System.out.println("Insira a hora de chegada:\n");
		hChegada = objeto.nextInt();
		
		System.out.println("Insira o min de chegada:\n");
		mChegada = objeto.nextInt();
		
		System.out.println("Insira a hora de saida:\n");
		hSaida = objeto.nextInt();
		
		System.out.println("Insira o min de saida:\n");
		mSaida = objeto.nextInt();
		
	
		Ex3 vaga1 = new Ex3();
		Ex4 vaga2 = new Ex4();
		
		if(veiculo.equals(Moto) == true) {
			vaga2.cad(veiculo, tipo, placa, hChegada, mChegada, hSaida, mSaida);
			System.out.print(vaga2);
		
		}else {
		
			vaga1.cadastro(tipo, placa, hChegada, mChegada, hSaida, mSaida);
			System.out.print(vaga1);
		}
	}
	
	
	
	public String toString() {
		if (this.diferenca.getMinute() < 30 && this.diferenca.getHour() == 0) {
			return 	this.tipo + " (" + 
					this.placa + ")\nChegada: " + 
					this.chegada + "\nSaída: " + 
					this.saida + "\nValor: Gratuito\n";
		} else if (this.diferenca.getMinute() >= 30 && this.diferenca.getHour() == 0) {
			return 	this.tipo + " (" + 
					this.placa + ")\nChegada: " + 
					this.chegada + "\nSaída: " + 
					this.saida + "\nValor: R$10,00\n";
		} else {
			return 	this.tipo + " (" + 
					this.placa + ")\nChegada: " + 
					this.chegada + "\nSaída: " + 
					this.saida + "\nValor: R$20,00\n";
		}
	}
}
