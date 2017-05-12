package model;

import java.util.ArrayList;
import java.util.List;

public class ListaUsuarios {

	public List<Usuario> listaUsuarios(){
		
		List<Usuario> lista = new ArrayList<Usuario>();
		
		lista.add(new Usuario("Lennon", 100));
		lista.add(new Usuario("Paje", 89));
		lista.add(new Usuario("Plant", 93));
		lista.add(new Usuario("Jones", 79));
		lista.add(new Usuario("Bonhan", 60));
		lista.add(new Usuario("Jim Morrison", 80));
		lista.add(new Usuario("Hendrix", 94));
		lista.add(new Usuario("Janis Joplin", 90));
		lista.add(new Usuario("King", 79));
		
		return lista;
		
	}
}
