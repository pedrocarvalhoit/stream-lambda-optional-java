package lambdas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class LambdaJava8 {
	
	public static void main(String[] args) {
		
		//Exemplo com Thread
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Olá Mundo");
			}
		}).run();
		
		new Thread(()-> System.out.println("Olá Mundo")).run();
		
		//Exemplo com JButton
		//Forma antiga de implementação
		JButton jButton = new JButton();
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Olá Mundo");
			}
		});
		
		JButton jButton2 = new JButton();
		jButton2.addActionListener(e -> System.out.println("Olá Mundo"));
		
		//Neste caso a expressao lambda funciona porque os métodos só possuem um método
		//abstrato -> SAM Single Abstract Method
		
		
		
	}

}
