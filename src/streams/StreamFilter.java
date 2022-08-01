package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilter {
	public static void main(String[] args) {

		List<Integer> arrayList = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);
	
		arrayList.stream()
			.filter(e -> e % 2 == 0)
			.forEach(e -> System.out.println(e));
		
		System.out.println("---");
		arrayList.stream()
			.filter(e -> e < 8 && e> 5)
			.forEach(e -> System.out.println(e));
		
		
	}
}
