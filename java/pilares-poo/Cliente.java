public class Cliente {
    
    public static void main(String[] args) {
        
        MSNMessenger msn = new MSNMessenger();
        Facebook fcb = new Facebook();
        Telegram tlg = new Telegram();

        System.out.println("\nMSN");
        msn.enviarMensagem();
        msn.receberMensagem();
        
        System.out.println("\nFacebook");
        fcb.enviarMensagem();
        fcb.receberMensagem();
        
        System.out.println("\nTelegram");
        tlg.enviarMensagem();
        tlg.receberMensagem();
        
    }

}
