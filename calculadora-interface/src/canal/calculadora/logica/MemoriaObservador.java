package canal.calculadora.logica;

@FunctionalInterface
public interface MemoriaObservador {

	void valorAlterado(String novoValor);
}
