package lista1;
public class Data9 {
	public int dia;
	public int mes;
	public int ano;
	
	public Data9() {
		//consctructor
	}
	
	public Data9 setData(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
}

package lista1;


public class Computador9 {
	public String nome, marca;
	public int dia, mes, ano;
	Data9 aux = new Data9();
	public Computador9() {
		//constructor
	}

	public Computador9 setNome(String nome) {
		this.nome = nome;
		return this;
	}
	public Computador9 setMarca(String marca) {
		this.marca = marca;
		return this;
	}
	/*
	public Data9 auxsetData(int dia, int mes, int ano) {
		return this.aux.setData(dia, mes, ano); 
	}*/
	
	public Computador9 setData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		return this;
	}
	
	
}

package lista1;

public class Principal9 {
	
	//Data9 aux = new Data9();
	
	public Principal9() {
		//constructor
	}
	
	public static void main(String [] args) {
		Computador9 c = new Computador9();
		c.setNome("comp1").setMarca("Intel").setData(1,1,2001);
		System.out.println(c.toString());
	}
	
}
