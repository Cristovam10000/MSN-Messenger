package apps;
import java.util.Scanner;
public class AppChossser {
    public ServicoMensagemInstantanea escolherApp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o aplicativo que você quer usar (msn, fbm ou tlg):");
        String appEscolhido = scanner.nextLine();
        scanner.close();

        switch (appEscolhido) {
            case "msn":
                return new MSNMessenger();
            case "fbm":
                return new FacebookMessenger();
            case "tlg":
                return new Telegram();
            default:
                System.out.println("Aplicativo inválido. Usando o Telegram por padrão.");
                return new Telegram();
        }
    }
}
