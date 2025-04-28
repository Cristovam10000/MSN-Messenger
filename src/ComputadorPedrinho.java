import apps.AppChossser;
import apps.ServicoMensagemInstantanea;


public class ComputadorPedrinho {
    public static void main(String[] args) {
        AppChossser appChossser = new AppChossser();
        ServicoMensagemInstantanea smi = appChossser.escolherApp();
        
        smi.enviarMensagem();
        smi.receberMensagem();
    }

}

// public class ComputadorPedrinho {
//     public static void main(String[] args) {
//         ServicoMensagemInstantanea smi = null;

//         String appEscolhido = "tlg";

//         if (appEscolhido.equals("msn"))
//             smi = new MSNMessenger();
//         else if (appEscolhido.equals("fbm"))
//             smi = new FacebookMessenger();
//         else if (appEscolhido.equals("tlg"))
//             smi = new Telegram();
        
//         smi.enviarMensagem();
//         smi.receberMensagem();
// }