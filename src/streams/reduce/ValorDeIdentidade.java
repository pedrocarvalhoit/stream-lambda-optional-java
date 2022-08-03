package streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ValorDeIdentidade {
	public static void main(String[] args) {
		
		List<Integer> list =  Arrays.asList(1,2,3,4,5,6); 
		
		System.out.println("---Soma");
		Integer soma = list.stream()
			//Para soma, o primeiro valo tem que ser 0, pois um valor somado a outro + 0
			//sempre será igual ao resultado
			.reduce(0, (n1, n2)-> n1 + n2);
		
		System.out.println(soma);

		System.out.println("---Multiplicação");
		Integer multiplicacao = list.stream()
			//Para multiplicação o valor precisa ser 1, porque um número multiplicado por 0
			//é 0. Então precisa ser multiplicado por 1
			.reduce(1, (n1, n2)-> n1 * n2);
		
		System.out.println(multiplicacao);
		
		System.out.println("---Concatenação");
		String s = "Pedro Duarte em formação para Desenvolvedor Java";
		String[] split = s.split(" ");
		List<String> listaString= Arrays.asList(split);
		//O valor de identidade para String, deve ser uma String vazia.
		
		String concatenacao = listaString.stream()
				.reduce("",(s1, s2 )-> s1.concat(s2));
		
		System.out.println(concatenacao);
		
}

}
