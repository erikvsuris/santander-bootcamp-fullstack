public abstract class ServicoMensagem {
    
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConexaoInternet() {
        System.out.println("Validando a conexão à internet...");
    }

}
