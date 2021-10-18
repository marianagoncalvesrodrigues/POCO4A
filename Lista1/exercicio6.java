/**
* @author Mariana Goncalves Rodrigues, Anderson Soares da Silva
* @r.a: 2151014 e 2150875
* @date 04 OUT 2021
*/
package lista1;

public class novaClasse {//verifica se o numero aleatorio é primo, beneficio acionado ao chegar em 3 tentativas erradas
	public int advinha;
	public novaClasse() {
		//constructor
	}
	public static boolean primo(int advinha) {
	    for (int j = 2; j < advinha; j++) {
	        if (advinha % j == 0 || advinha == 0)
	            return false;   
	    }
	    return true;
	}
}
