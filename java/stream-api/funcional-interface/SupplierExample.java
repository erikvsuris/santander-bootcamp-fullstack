import java.util.List;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
public class SupplierExample {
  public static void main(String[] args) {
    /*
    Supplier<String> saudacao = () -> "Hello, world!";

    List<String> listaSaudacoes = Stream.generate(saudacao)
      .limit(5)
      .collect(Collectors.toList());
    */

    List<String> listaSaudacoes = Stream.generate(() -> "Hello, world!")
      .limit(5)
      .toList();

    listaSaudacoes.forEach(System.out::println);
  }
}
