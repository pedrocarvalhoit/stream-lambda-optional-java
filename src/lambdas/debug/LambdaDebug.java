package lambdas.debug;

import java.util.Arrays;
import java.util.List;

public class LambdaDebug {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,5,8,9);
		
		list.stream()
			.map((n)-> new StringBuilder().append(n).append("s").append("a"))
			.forEach(System.out::println);
		
		//Melhor sintaxe para fazer o debug e entender as etapas 
		list.stream()
			.map((n)-> {
				StringBuilder builder = new StringBuilder();
				builder.append(n);
				builder.append("s");
				builder.append("a");
				return builder;
			})
			.forEach(System.out::println);
		
		//Método PEEK ajuda na visualização quando o stream possui muitas operações
		System.out.println("---Peek");
		list.stream()
			.peek((n)-> System.out.println(n + " Se inscreva"))
			.filter(n -> n % 2 == 0)
			.forEach(System.out::println);
		
		
	}

}
