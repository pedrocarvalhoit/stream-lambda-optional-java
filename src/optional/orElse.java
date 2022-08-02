package optional;

import java.util.Optional;

public class orElse {

public static void main(String[] args) {
		
		//String s = "132123";
		String s = "Pedro Duarte";
		//Este método imprimi uma alternativa ao possível nulo da primeira tentativa
		Integer numero = converteEmNumero(s).orElse(2);
		System.out.println(numero);
		
		//Este recebe função lambda
		String s2 = "Personal Trainer";
		Integer numero2 = converteEmNumero(s)
				.orElseGet(() -> 5);
		System.out.println(numero2);
		
		//Lançando exception
		String s3 = "Programador Java";
		Integer numero3 = converteEmNumero(s)
				.orElseThrow(()-> new NullPointerException("Valor vazio"));
		System.out.println(numero3);
		
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
