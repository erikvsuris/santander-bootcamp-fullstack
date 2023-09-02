public class App {
    
    public static void main(String[] args) {
        
        OrdenacaoNumeros ord = new OrdenacaoNumeros();

        ord.adicionarNumero(1);
        ord.adicionarNumero(8);
        ord.adicionarNumero(5);
        ord.adicionarNumero(19);
        ord.adicionarNumero(4);

        System.out.println(ord.ordenarAscendente());
        System.out.println(ord.ordenarDescendente());

    }

}
