package apps;
public abstract class ServicoMensagemInstantanea {
   public abstract void enviarMensagem();
   public abstract void receberMensagem();

   protected void validarConectadoInternet() {
    System.out.println("validando se está conectado a internet...");
   }

   protected void salvarHistoricoMensagem() {
    System.out.println("salvando o histórico de mensagens...");
   }


}



