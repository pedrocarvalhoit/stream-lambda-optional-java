package streams.interfacesFuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Supplier {

	public static void main(String[] args) {
		
		Stream.generate(()-> new Random().nextInt())
			.limit(5)
			.forEach(System.out::println);
		

	}

}
