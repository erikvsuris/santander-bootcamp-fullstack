public class MSNMessenger extends ServicoMensagem {

    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo MSN...");
    }
    
    public void receberMensagem() {
        validarConexaoInternet();
        System.out.println("Recebendo mensagem pelo MSN...");
    }

}
