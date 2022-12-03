package cofrinhoUninter;

public class Euro extends Coin {

	public Euro(double value) {
		
		this.value = value;
	}
	
	
	@Override
	public void info() {
		
		System.out.println("Euro " + value);
		//função de exibir o valor em euro
	}

	@Override
	public double converter() {
		return this.value * 5.45;
		//método converter (cotação fictícia)
		
		
		
	}
	
	//metodo para determinar o equals e 
	@Override
	public boolean equals(Object object) {
		if(this.getClass() != object.getClass()) {
			return false;
		}
		
		Euro euroObject = (Euro) object;
		
		
		if(this.value != euroObject.value) {
			return false;
		}
		
		return true;
	}
	
	
	

}
