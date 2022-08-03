package streams.reduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {
	public static void main(String[] args) {

		List<Integer> list =  Arrays.asList(1,2,3,4,5,6); 
		
		//Soma todos os valores da lista
		//A cada passagem, a soma vira o n1 
		// -> 1 + 2 = 3 depois 3 + 3 = 6 depois 6 + 4 = 10 ...
		System.out.println("---Soma");
		Optional<Integer> reduce = list.stream()
			.reduce((n1, n2 )-> n1 + n2);
		
		//A função principal do reduce é pegar todos os elementos so stream, e transformar
		//em um único objeto, de acordo com o filtro determinado
		System.out.println(reduce.get());
		
		//Transformando a string em uma lista de strings
		System.out.println("---Concatenação");
		String s = "Pedro Duarte em formação para Desenvolvedor Java";
		String[] split = s.split(" ");
		List<String> listaString= Arrays.asList(split);
		//Ordenando com um método da próprio da String
		Optional<String> concatenacao = listaString.stream()
				.reduce((s1, s2 )-> s1.concat(s2));
		System.out.println(concatenacao.get() );
		
		
	}

}
