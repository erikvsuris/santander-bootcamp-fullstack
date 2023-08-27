public class Telegram extends ServicoMensagem {

    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Telegram...");
    }
    
    public void receberMensagem() {
        validarConexaoInternet();
        System.out.println("Recebendo mensagem pelo Telegram...");
    }

}
