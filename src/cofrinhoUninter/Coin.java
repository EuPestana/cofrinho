package cofrinhoUninter;

public abstract class Coin {
	
	double value;
	
	public abstract void info();
	public abstract double converter();
	 
	//A classe Coin é a "mãe" das outras moedas (dolar, euro e real), aqui conseguimos converter e exibir as informçãoes da moeda
	

}
