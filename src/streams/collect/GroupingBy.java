package streams.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);
		
		//Criando um mapa, e agrupando pelo resto da divisão por 3
		Map<Integer, List<Integer>> collect = list.stream()
			.map(n -> n * 2)
			.collect(Collectors.groupingBy((n)-> n % 3));
		System.out.println(collect);
			
		//Criando um mapa, e agrupando por ímpares
		Map<Boolean, List<Integer>> collect2 = list.stream()
		.map(n -> n * 2)
		.collect(Collectors.groupingBy((n)-> n % 3 == 0));
	System.out.println(collect2);
		
		

	}

}
