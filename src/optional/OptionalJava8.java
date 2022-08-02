package optional;

import java.util.Optional;

public class OptionalJava8 {
	public static void main(String[] args) {
		
		String s = "Pedro Duarte Java";
		Optional<Integer> numero = converteEmNumero(s);
		System.out.println(numero);
		
	}
	
	private static Optional<Integer> converteEmNumero(String stringNum) {
		
		try {
			Integer integer = Integer.valueOf(stringNum);
			return Optional.of(integer);
		} catch (NumberFormatException e) {
			return Optional.empty();
		}
		
	}
	
	
}
