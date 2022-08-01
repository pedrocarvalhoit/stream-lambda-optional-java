package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FirstExample {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		
		Stream<String> stream = list.stream();
		
		
	}

}
