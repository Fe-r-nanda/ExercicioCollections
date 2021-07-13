package br.com.generation.estoque;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EstoqueCollections {

	public static void main(String[] args) {
		
		String prod1 = "perfume";
		String prod2 = "rímel";
		String prod3 = "batom";
		String prod4 = "shampoo";
		String prod5 = "creme";
		String prod6 = "anel";
		
		ArrayList<String> prods = new ArrayList<>();
		
		prods.add(prod1);
		prods.add(prod2);
		prods.add(prod3);
		prods.add(prod4);
		prods.add(prod5);
		prods.add(prod6);
		
		System.out.println("Lista de produtos original: " + prods);
		
		System.out.println("===========================");
		prods.remove(1);
		System.out.println(prods);
		
		for(String i: prods) {
			System.out.println("Produto: " + i);
		}
		
		List<String> prods2 = Arrays.asList("esmalte", "escova" );
		prods.addAll(prods2);
		System.out.println("Lista de produtos atualizada: " + prods);
		
	
			
			System.out.println("Lista de produtos final: " + prods);
		
		
		

	}

}
