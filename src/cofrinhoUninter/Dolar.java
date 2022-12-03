package cofrinhoUninter;

public class Dolar extends Coin {

	public Dolar(double value) {
		
		this.value = value;
	}
	
	
	@Override
	public void info() {
		
		System.out.println("Dolar " + value);
		//função de exibir o valor em dólar
	}

	@Override
	public double converter() {
		return this.value * 5.14;
		//método converter (cotação fictícia)
		
		
	}
	
	//metodo para determinar o equals e 
	@Override
	public boolean equals(Object object) {
		if(this.getClass() != object.getClass()) {
			return false;
		}
		
		Dolar dolarObject = (Dolar) object;
		
		
		if(this.value != dolarObject.value) {
			return false;
		}
		
		return true;
	}
	
	
	

}
