package streams.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Collect2 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		//Passando pra String e separando 
		String join = list.stream()
				.map(n -> n.toString())
				.collect(Collectors.joining(" - "));
		System.out.println(join);
		
		System.out.println("---Média");
		Double media = list.stream()
		//É necessário transformar os Integers da lista em inteiros
			.collect(Collectors.averagingInt(n -> n.intValue()));
		System.out.println(media);
		
		System.out.println("---Somming");
		Integer soma = list.stream()
			.collect(Collectors.summingInt(n -> n.intValue()));
		System.out.println(soma);
				
		System.out.println("---Summarizing");
		IntSummaryStatistics stats = list.stream()
			.collect(Collectors.summarizingInt(n -> n.intValue()));
		System.out.println("---IntSummaryStatistics");
		System.out.println(stats.getAverage());
		System.out.println(stats.getMax());
		
		

	}

}
