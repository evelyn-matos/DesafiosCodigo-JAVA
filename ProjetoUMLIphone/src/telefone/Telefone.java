package telefone;

public class Telefone implements AparelhoTelefonico {
	
	public void ligar(){
        System.out.println("Fazendo ligação telefônica...");
    }
    public void atender(){
        System.out.println("Atendendo ligação telefônica...");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz...");
    }
}
