package loopsExemplo;

import java.util.function.Consumer;

import model.Usuario;

public class Exibir implements Consumer<Usuario>  {

	@Override
	public void accept(Usuario u) {
		
		System.out.println("FOREACH JAVA 8 =>  Nome  ===> " + u.getNome() + " Pontos ==> "+ u.getPontos());
	}

}
