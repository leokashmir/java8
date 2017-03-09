package loopsExemplo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import model.Usuario;

public class Exemplo {
	public static void main(String ... args){
		
		Usuario user_1 = new Usuario("Paje", 89);
		Usuario user_2 = new Usuario("Plant", 93);
		Usuario user_3 = new Usuario("Jones", 79);
	
		
		
		
		List<Usuario> usuarios  = Arrays.asList(user_1, user_2, user_3);
		
		//Forma utilizada desde do java 5
		for(Usuario u : usuarios){
			System.out.println(" Nome  ===> " + u.getNome() + " Pontos ==> "+ u.getPontos());
		}
		
		
		
		System.out.println("\n============================== FOREACH ============================================\n");
		
		/* Agora uma função nova do Java 8 Foreach:
		 * 
		 * O Foreach recebe um objeto "Consurmer" que é uma nova interface do java 8 
		 * e possue apenas 1 metodo accept.
		 * 
		 * Criaremos um "Exibir" que vai extender um Consrumer, antes de fazer o foreach.
		 * 
		 * Podemos criar a classe de forma anonima ou em outro pacote.
		 * 
		 * */
		
		Exibir exibir = new Exibir();
		
		usuarios.forEach(exibir);
		
		
		
		System.out.println("\n============================ CLASSE ANOMINA =============================================\n");
		//Exemplo com uma classe anomima
		
		usuarios.forEach( new Consumer<Usuario>(){
			@Override
			public void accept(Usuario u) {
				System.out.println("CLASSE ANOMINA, FOREACH JAVA 8 =>  Nome  ===> " + u.getNome() + " Pontos ==> "+ u.getPontos());
			}
			
		});
		
		
		System.out.println("\n======================  LAMBDA =======================================\n");
		/*
		 * Agora mais um novo conceito. O Lambda.
		 * Podemos implementar esse loop anterior de uma forma mais refinada utlizando o Lambda
		 * Vamos ao exemplo.
		 * 
		 * */
		
		Consumer<Usuario> exibirUser =
				(Usuario u) -> { System.out.println("LAMBDA =>  Nome  ===> " + u.getNome() + " Pontos ==> "+ u.getPontos());};
		usuarios.forEach(exibirUser);
		
		
		
		/* Podemos fazer o Labmda de forma mais reduziada ainda.
		 * 
		 *  O compilador consegue também inferir o tipo, sem a necessi-dade de utilizar  Usuario  nem parênteses:
		 * 
		 * */
		
			
		System.out.println("\n======================  LAMBDA 2 =======================================\n");
		
		
		
		Consumer<Usuario> exibirUser1 =
				u -> System.out.println("LAMBDA =>  Nome  ===> " + u.getNome() + " Pontos ==> "+ u.getPontos());
				
		usuarios.forEach(exibirUser1);
		
		/* Há maneiras mais resumidas ainda para essa linha de codigo.
		 *  
		 *  Ex1:
		 *  Consumer<Usuario> user =u -> {System.out.println(u.getNome());};
		 *  
		 *  Casos haja apenas 1 instrução entre os {} podemos resumir mais.
		 *  
		 *   Consumer<Usuario> user =u -> System.out.println(u.getNome());
		 *   
		 *   E por fim, uma unica linha:
		 *   
		 *   Consumer<Usuario> user = u -> System.out.println(u.getNome());
		 *   
		 *   Podemos também passar esse trecho de código diretamente para usuarios.forEach  em vez de declarar a variável temporaria usuer
		 *   
		 *   usuarios.forEach(u -> System.out.println(u.getNome()));
		 * 
		 * */
		
		System.out.println("\n======================  LAMBDA 2 =======================================\n");
		
		
		usuarios.forEach(u -> System.out.println("LAMBDA 1 LINHA =>  Nome  ===> " + u.getNome() + " Pontos ==> "+ u.getPontos()));
		
		 
	
	}
}
