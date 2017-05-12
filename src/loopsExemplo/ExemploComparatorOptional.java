package loopsExemplo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import model.ListaComboNacionalidade;

public class ExemploComparatorOptional {
	

	public static void main(String[] args) {

		
			
		ListaComboNacionalidade reg_1 = new ListaComboNacionalidade(new Long(9), "Brasil");
		ListaComboNacionalidade reg_2 = new ListaComboNacionalidade(new Long(1), "Albania");
		ListaComboNacionalidade reg_3 = new ListaComboNacionalidade(new Long(3), "Franca");
		ListaComboNacionalidade reg_4 = new ListaComboNacionalidade(new Long(10), "Alemanha");
		ListaComboNacionalidade reg_5 = new ListaComboNacionalidade(new Long(7), "Italia");
		
	
		List<ListaComboNacionalidade> pais = new ArrayList<ListaComboNacionalidade>();
		pais.add(reg_5); pais.add(reg_2); pais.add(reg_3); pais.add(reg_4); 		pais.add(reg_1);
		
		System.out.println("===== Desordenado=====");
		pais.forEach(p -> System.out.println("==:>" + p.getDescricao()));
		
		
	
		
		Optional<ListaComboNacionalidade>
				nacionalidade = pais.stream()
					.filter(p -> p.getDescricao().equalsIgnoreCase("Brasil")).findAny();
		
		pais.remove(nacionalidade.get());
		
		Collections.sort(pais,  (p1, p2)-> 
				String.CASE_INSENSITIVE_ORDER.compare(p1.getDescricao(),p2.getDescricao()));
		
		pais.add(0, nacionalidade.get());
		
		
		System.out.println("===== ordenado=====");
		pais.forEach(p -> System.out.println("==:>" + p.getDescricao()));
		
		
		
		
		
	}

}
