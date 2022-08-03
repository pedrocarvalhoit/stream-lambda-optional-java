package exercicios.agrupandoIdade;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class TesteIdade {
	public static void main(String[] args) {
		
		List<Cliente> catalogo = new ArrayList<>();
		catalogo.add(new Cliente("Pedro", 29));
		catalogo.add(new Cliente("Thamires", 35));
		catalogo.add(new Cliente("Leonardo", 32));
		catalogo.add(new Cliente("Bruno", 21));
		catalogo.add(new Cliente("Marrone", 18));
				
		//Selecionando por idade
		System.out.println("---Maior de 30");
	 	catalogo.stream()
			.filter(c -> c.getIdade() > 30)
			.forEach(System.out::println);
		
		System.out.println("---Entre 20 e 30");
		catalogo.stream()
			.filter(c -> c.getIdade() < 30 && c.getIdade()> 20)
			.forEach(System.out::println);
		
	}
	

}
