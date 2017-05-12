package metodosInterfaceConsumer;

import java.util.List;
import java.util.function.Consumer;

import model.ListaUsuarios;
import model.Usuario;

/**
 * 
 * @author leonardo.barros
 * Explorando a Interface Consumer, 
 *
 *
 *
 *
 */
public class ClassMetodosConsumer {
	
	
	public int contador(int cont){
		 return cont++;
	}
	
	public static void main(String... args){
		
		ListaUsuarios lista = new ListaUsuarios();
		
		
		List<Usuario> usuarios = lista.listaUsuarios();
		
		Consumer<Usuario> exibeMens = u -> System.out.println("Usuario");
		Consumer<Usuario> imprimeNome = u-> System.out.println(u.getNome());
		
		usuarios.forEach(exibeMens.andThen(imprimeNome));
		
	}

}
