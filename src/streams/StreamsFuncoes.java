package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsFuncoes {
	public static void main(String[] args) {

		List<Integer> arrayList = Arrays.asList(1, 5, 8, 9, 1, 4, 7, 6, 6, 9, 9);

		System.out.println("---Skip");
		arrayList.stream()
			// Ignora os 2 primeiros elementos
			.skip(2)
			.forEach(e -> System.out.println(e));

		System.out.println("---Limit");
		arrayList.stream()
			// Printa apenas os 2 primeiros elementos
			.limit(2)
			.forEach(e -> System.out.println(e));

		System.out.println("---Distinct");
		arrayList.stream()
			//Distingue os números iguais
			.distinct()
			.forEach(e -> System.out.println(e));
		
		System.out.println("---Count");
			//Contando o tamanho
			long count = arrayList.stream()
			//Filtrando e depois contando o resto
				.filter(e -> e % 2 == 0)
				.count();
			System.out.println(count);

	}
}
