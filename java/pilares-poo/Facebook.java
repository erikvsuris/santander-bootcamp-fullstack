public class Facebook extends ServicoMensagem {

    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Facebook...");
    }
    
    public void receberMensagem() {
        validarConexaoInternet();
        System.out.println("Recebendo mensagem pelo Facebook...");
    }

}
