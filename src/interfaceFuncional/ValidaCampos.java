package interfaceFuncional;

/**
 * 
 * @author leonardo.barros
 *
 */


public class ValidaCampos  {

	Validador<String> validadorCEP =
			valor -> valor.matches("[0-9]{5}-[0-9]{3}");

			
			public static void main(String... args){
				
				ValidaCampos v = new ValidaCampos();
				System.out.println(v.validadorCEP.vaida("y6875-098"));
				
				
			}
}
