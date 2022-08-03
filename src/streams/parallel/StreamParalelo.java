package streams.parallel;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamParalelo {
	public static void main(String[] args) {
		
		//Stream paralelos são utilizados pra ganhar performance de algum algorítmo
		//As operações em cima deste tipo de stream são executadas de forma paralela
		//Sem procupação com ordem
		
		List<Integer> list = Arrays.asList(1,2,3,4);
		
		//Foreach Ordered
		System.out.println("---Foreach");
		list.parallelStream()
			.forEach(System.out::println);
		list.parallelStream()
			.forEachOrdered(System.out::println);
		
		//FindAny
		//No paralelo ele retorna um componente aleatrório
		System.out.println("---FindAny");
		list.parallelStream()
			.findAny()
			.ifPresent(System.out::println);
		list.stream()
			.findAny()
			.ifPresent(System.out::println);
		
		//Melhores mapas para StreamParalelos
		System.out.println("---Map");
		Map<Integer, Boolean> collect = 
				list.parallelStream()
				.collect(Collectors.toConcurrentMap(n -> n, n -> n % 2 == 0));
		System.out.println(collect);
		
		System.out.println("---Map grouping by");
		Map<Boolean, List<Integer>> collect2 =
				list.parallelStream()
				.collect(Collectors.groupingByConcurrent(n -> n % 2 == 0));
		System.out.println(collect2);
		
	}

}
