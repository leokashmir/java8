package interfaceFuncional;

/**
 * 
 * @author leonardo.barros
 *
 * @param <T>
 * 
 * Exemplo de uma interface funcional. 
 * Uma interface, para ser considerada funcional, é um tipo de interface que pode ser instaciada
 * atraves de uma expressao lambda.
 * 
 * Essa interface tem apenas um unico metodo abstrado. (Caso tenha mais metodos, eles deve ser "Defult")
 * Qualquer interface java que possua apenas um metodo, pode ser instanciada como um codigo lambda.
 * Um exemplo seria a interface Runnable que possui apenas o metodo run();
 * 
 * 
 * Para a marcar que uma interface é funcional, devemos adicionar a anotacao @FunctionalInterface
 * ela nao é obrigada. Mas o ideia é usa-la. Assim evita que outro desenvolvedor implemente metodos na interface
 * fazendo com que ela dispare erros na aplicacao.
 * 
 */


@FunctionalInterface
public interface Validador<T> {
	
	boolean vaida(T t);

}
