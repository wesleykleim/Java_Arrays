package br.com.fiap.entity;

import br.com.fiap.view.Produto;

public class CaixaProd {
	
	public static void main(String[] args) {
		


	Produto [] produtos = new Produto[2];

	Produto produto1 = new Produto();
	Produto produto2 = new Produto();
	
	produto1.setNome("Maça");
	produto1.setDescricao("Gala");
	produto1.setValor(10.50);
	
	produto2.setNome("Mamão");
	produto2.setDescricao("Papaia");
	produto2.setValor(7.50);
	
	produtos[0] = produto1;
	produtos[1] = produto2;
	
	for(int i=0; i < produtos.length; i++) {
		//System.out.println("Os produtos do array são : \n" + (i+1) +"º produto:\n"+ (produtos[i].toString()));
		
		if (i == 1){
			System.out.println("O "+ (i+1) + "º produto é:");
			System.out.println(produto1.getNome());
			System.out.println(produto1.getDescricao());
			System.out.println(produto1.setValor());
		}else {
			System.out.println("O "+ (i+1) + "º produto é:");
			System.out.println(produto2.getNome());
			System.out.println(produto2.getDescricao());
			System.out.println(produto2.setValor());
		}
		
	}
	
	










	}

}

