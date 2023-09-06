package email;

public class YahooMail implements Email {
	
	public void enviarEmail() {
        System.out.println("Enviando e-mail via Yahoo!Mmail...");
    }

    public void responderEmail() {
        System.out.println("Respondendo e-mail via Yahoo!Mmail...");
    }

    public void apagarEmail() {
        System.out.println("Apagando e-mail via Yahoo!Mmail...");
    }
}
