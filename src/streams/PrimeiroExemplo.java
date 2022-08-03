package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class PrimeiroExemplo {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		
		Stream<String> stream = list.stream();
		
		Stream<String> toLowerCaseStream = stream.map((String element) -> {
			return element.toLowerCase();
		});
		
		toLowerCaseStream.forEach(e ->{
			System.out.println(e);
		});
		
		System.out.println("---Random");
		Stream.generate(()-> new Random().nextInt())
		.limit(5)
		.forEach(System.out::println);
		
		
	}

}
