package lambdas;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class MethodReference {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);
		
		list.stream()
			.map((n)-> multipliquePorDois(n))
			.forEach(System.out::println);
		
		//Métodos estáticos
		list.stream()
		//É necessário instanciar a classe e o método
			.map(MethodReference::multipliquePorDois)
			.forEach(System.out::println);
		
		//Construtores
		list.stream()
			.map(BigDecimal::new);
		
		//Várias instâncias
		list.stream()
			.map(Integer::doubleValue)
			.forEach(System.out::println);
		
	}
	
	private static Integer multipliquePorDois(Integer i) {
		return i * 2;
	}

}
