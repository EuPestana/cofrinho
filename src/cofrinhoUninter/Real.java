package cofrinhoUninter;

public class Real extends Coin {

	public Real(double value) {
		
		this.value = value;
	}
	
	
	@Override
	public void info() {
		
		System.out.println("Real " + value);
		//função de exibir o valor em real
	}

	@Override
	public double converter() {
		return this.value;
		// o real não precisa converter
		
	}
	
	
	//metodo para determinar o equals e 
	@Override
	public boolean equals(Object object) {
		if(this.getClass() != object.getClass()) {
			return false;
		}
		
		Real realObject = (Real) object;
		
		
		if(this.value != realObject.value) {
			return false;
		}
		
		return true;
	}
	

}
