package exercicios.endereco;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class TesteLista {
	public static void main(String[] args) {
	
		List<Cliente> catalogoLista = new LinkedList<>();
		catalogoLista.add(new Cliente("Pedro", "Estoril"));
		catalogoLista.add(new Cliente("Thamires", "Estoril"));
		catalogoLista.add(new Cliente("Victor", "Buritis"));
		catalogoLista.add(new Cliente("Luisa", "Buritis"));
		catalogoLista.add(new Cliente("Thalvanes", "Castelo"));
		
		System.out.println(catalogoLista);
		catalogoLista.forEach(e -> System.out.println(e));
		
		//Armazenando em um Map
		System.out.println("--- Set");
		Map<String, String> catalogoMap = catalogoLista.stream()
				.collect(Collectors.toMap(Cliente::getNome, Cliente::getEndereco));
		System.out.println(catalogoMap);
		//Selecionando apenas quem mora em Estoril
		//É preciso filtrar e imprimir o filtro
		System.out.println("---Moradores do Estoril");
		catalogoMap.entrySet().stream()
			.filter(c -> c.getValue().equalsIgnoreCase("Estoril"))
			.forEach(c -> System.out.println(c));
		
		
		
	
		
		
	}
}
	

	
	
	
	
	

