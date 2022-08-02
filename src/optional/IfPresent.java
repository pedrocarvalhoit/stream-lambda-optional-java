package optional;

import java.util.Optional;

public class IfPresent {
	public static void main(String[] args) {
		
		String s = "132123";
		//Forma mais concisa de escrita
		converteEmNumero(s).ifPresent(e -> System.out.println(e));
		
	}
	
private static Optional<Integer> converteEmNumero(String stringNum) {
		
		//Se a String não possuir apenas números, me retorna vazio
		try {
			Integer integer = Integer.valueOf(stringNum);
			return Optional.of(integer);
		} catch (NumberFormatException e) {
			return Optional.empty();
		}
		
	}

}
