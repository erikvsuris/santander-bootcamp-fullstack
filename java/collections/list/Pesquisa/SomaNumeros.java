package Pesquisa;
import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    
    private List<Integer> numeros;

    public SomaNumeros() {
        numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer i : numeros) {
            soma += i;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maior = 0;
        for (Integer i : numeros) {
            if (i > maior) maior = i;
        }
        return maior;
    }

    public int encontrarMenorNumero() {
        int menor = Integer.MAX_VALUE;
        for (Integer i : numeros) {
            if (i < menor) menor = i;
        }
        return menor;
    }

    public List<Integer> exibirNumeros() {
        return numeros;
    }

}
