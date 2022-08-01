package streams;

import java.util.Arrays;
import java.util.List;

public class StreamMap {
	public static void main(String[] args) {

		List<Integer> arrayList = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);
		
		arrayList.stream()
			//Modificando a lista, porém, sem modificar a original
			//Importante filtrar antes de fazer as oprações
			.limit(3)
			.map(e -> e * 2)
			.forEach(e -> System.out.println(e));
		
		System.out.println("---");
		arrayList.stream()
			.map(e -> e * 2)
			.forEach(e -> System.out.println(e));
		
		
			
		
	}

}
