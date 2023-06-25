package calculadora;

import java.util.ArrayList;

public class Experimento {

	protected ArrayList<Calculadora> calculadoras;
	
	public Experimento() {
	  calculadoras = new ArrayList<Calculadora>();
	}
	
	public void carregarDados() {
		
		Calculadora cal;
		for (int i = 0; i < 100; i++) {
			cal= new Calculadora(i,i+1);
			calculadoras.add(cal);
		}
	}
}
