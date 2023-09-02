import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
 
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        numeros = new ArrayList<>();
    }
    
    public void adicionarNumero(Integer i) {
        numeros.add(i);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosOrdenados = new ArrayList<>(numeros);
        if ( !numerosOrdenados.isEmpty() ) {
            Collections.sort(numerosOrdenados);
            return numerosOrdenados;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    
    public List<Integer> ordenarDescendente() {
        List<Integer> numerosOrdenados = new ArrayList<>(numeros);
        if ( !numerosOrdenados.isEmpty() ) {
            numerosOrdenados.sort(Collections.reverseOrder());
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
        return numerosOrdenados;
    }
}
