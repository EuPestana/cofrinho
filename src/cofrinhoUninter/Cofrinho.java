package cofrinhoUninter;

import java.util.ArrayList;

public class Cofrinho {

	//este método cria a lista de moedas no cofrinho
	private ArrayList<Coin> coinList;
	
	public Cofrinho() {
		this.coinList = new ArrayList<>();
			
	}
	//adiciona moedas na lista
	public void adicionar(Coin moeda) {
		this.coinList.add(moeda);
	}
	//remove moedas na lista
	public void remover(Coin moeda) {
		this.coinList.remove(moeda);
	}
	
	
	
	// exibe moedas na lista
	public void listagemMoedas () {
		
		if (this.coinList.isEmpty()) {
			System.out.println("Seu cofrinho está vazio :(");
			return;
		} else
			for (Coin moeda : this.coinList) {
			moeda.info();
		}
	}

	
	// este método converte o valor, acumula o valor convertido e retorna o valor total convertido 
	public double totalConvertido() {
		if (this.coinList.isEmpty()) {
			return 0.0;
		}
		
		if (this.coinList.size() == 1) {
			return 1.0;
		}
		
		double valorAcumulado = 0;
		for (Coin moeda : this.coinList) {
			valorAcumulado = valorAcumulado + moeda.converter();
		} 
		return valorAcumulado;
	}
}
