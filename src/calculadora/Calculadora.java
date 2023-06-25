package calculadora;

public class Calculadora {

	protected int a;
	protected int b;
	
	public Calculadora(int a, int b){
		this.a=a;
		this.b=b;
	}
	public int somar () {
		return a + b;
	}
}
