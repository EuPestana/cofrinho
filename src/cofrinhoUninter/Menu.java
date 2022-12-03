package cofrinhoUninter;

import java.util.Scanner;

public class Menu {
	
	private Scanner put1;
	private Cofrinho cofrinho; //chamar a classe Cofrinho para estabelecer os métodos.
	
	public Menu() {
		put1 = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}

	public void showMenu() {
		System.out.println("----------------------------");
		System.out.println("SEJA BEM VINDO AO COFRINHO");
		System.out.println("o QUE VOCÊ DESEJA?");
		System.out.println("----------------------------");
		System.out.println("1. Adicionar Moeda");
		System.out.println("2. Remover Moeda");
		System.out.println("3. Listar Moedas");
		System.out.println("4. Obter valor convertido");
		System.out.println("0. Sair");
		System.out.println("----------------------------");
		
		String option = put1.next();
	
		//funcionalidades do Menu principal
		switch (option) {
			case "0": //finalizar
				System.out.println("Finalizando operação!");
				break;
				
			case "1": //adicionar moeda
				System.out.println("Escolha a moeda:");
				System.out.println("1 - Real");
				System.out.println("2 - Dólar");
				System.out.println("3 - Euro");
				
				int opcaoMoeda = put1.nextInt();
				
				System.out.println("Digite o valor: ");
				double valorMoeda = put1.nextDouble();
				
				if (opcaoMoeda == 1){
					Real moeda = new Real(valorMoeda);
					cofrinho.adicionar(moeda);
				} else if(opcaoMoeda == 2){
					Dolar moeda = new Dolar(valorMoeda);
					cofrinho.adicionar(moeda);
				} else if(opcaoMoeda == 3){
					Euro moeda = new Euro(valorMoeda);
					cofrinho.adicionar(moeda);
				} else {
					System.out.println("Não existe essa moeda");
				}
				System.out.println("Adicionado :)");
			
				showMenu();
				break;
				
			case "2": //remover moedas;
				System.out.println("Escolha a moeda:");
				System.out.println("1 - Real");
				System.out.println("2 - Dólar");
				System.out.println("3 - Euro");
				
				int opcaoMoeda1 = put1.nextInt();
				
				System.out.println("Digite o valor: ");
				double valorMoeda1 = put1.nextDouble();
				
				if (opcaoMoeda1 == 1){
					Real moeda = new Real(valorMoeda1);
					cofrinho.remover(moeda);
					} else if(opcaoMoeda1 == 2){
					Dolar moeda = new Dolar(valorMoeda1);
					cofrinho.remover(moeda);
					} else if(opcaoMoeda1 == 3){
					Euro moeda = new Euro(valorMoeda1);
					cofrinho.remover(moeda);
						} else {
					System.out.println("Não existe essa moeda");
					}
					
				showMenu();	
				System.out.println("Removido :)");
				showMenu();
				break;
				
			case "3": //listar moedas
				cofrinho.listagemMoedas();
				showMenu();
				break;
				
			case "4": //converter moedas
				double convertedValue = cofrinho.totalConvertido();
				System.out.println("Valor total convertido para reais: " + convertedValue);
				showMenu();
				break;
			default: //voltar para o menu, caso não seja escolhida um dos cases
				System.out.println("Ops, tente novamente!");
				showMenu();
				break;
			
		}
		
	}
}
	

