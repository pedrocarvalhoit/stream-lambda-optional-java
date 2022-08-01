package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collect {
	public static void main(String[] args) {
		
		List<Integer> arrayList = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);
		
		//Criando uma nova lista
		System.out.println("---Nova lista");
		List<Integer> novaLista = arrayList.stream()
				.filter(e -> e % 2 == 0)
				.map(e -> e * 3)
				.collect(Collectors.toList());
		System.out.println(novaLista);
		
		//Agrupando por conceito pares e ímpares
		System.out.println("---P/I");
		Map<Boolean, List<Integer>> mapa = arrayList.stream()
			.map(e -> e * 3)
			.collect(Collectors.groupingBy(e -> e % 2 == 0));
		System.out.println(mapa); 
		
		//Agrupando pelo resto da divisão por 3
		System.out.println("---Resto 3");
		Map<Integer, List<Integer>> mapa2 = arrayList.stream()
				//Seleciona esta linha e com CTRL + 1 adiciona á uma variável
				.collect(Collectors.groupingBy(e -> e % 3));
			System.out.println(mapa2); 
			
		//Juntando tudo em uma String
			System.out.println("---Agrupando");
			String collect = arrayList.stream()
				.map(e -> String.valueOf(e))
				//separando com ;
				.collect(Collectors.joining(";"));
			System.out.println(collect);
			
		
	}

}
