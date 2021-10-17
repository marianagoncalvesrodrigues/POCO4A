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
