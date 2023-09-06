package iphone;

import email.Email;
import navegador.NavegadorInternet;
import reprodutor.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico, Email {

	@Override
	public void exibirPagina() {
	    System.out.println("Exibindo página web no safari browser do seu iPhone.");
	}
	
	@Override
	public void adicionarNovaAba() {
	    System.out.println("Abrindo nova aba no safari browser do seu iPhone.");
	}
	
	@Override
	public void atualizarPagina() {
	    System.out.println("Atualizando página web no safari browser do seu iPhone.");
	}

	@Override
	public void tocar() {
	    System.out.println("Tocando música no reprodutor de músicas do seu iPhone.");
	}
	
	@Override
	public void pausar() {
	    System.out.println("Música no reprodutor de músicas do seu iPhone esta em pausa.");
	}
	
	@Override
	public void selecionarMusica() {
	    System.out.println("Selecionando música no reprodutor de músicas do seu iPhone.");
	}

	@Override
	public void ligar() {
	    System.out.println("Ligando para um contato de sua agenda no seu iPhone.");
	}
	
	@Override
	public void atender() {
	    System.out.println("Atendendo ligação telefônica no seu iPhone.");
	}
	
	@Override
	public void iniciarCorreioVoz() {
	    System.out.println("Verificando mensagens de seu correio de voz no seu iPhone.");
	}
	
	@Override
	public void enviarEmail() {
	    System.out.println("Enviando e-mail pelo app em seu iPhone.");
	}
	
	@Override
	public void responderEmail() {
	    System.out.println("Rspondendo e-mail pelo app em seu iPhone.");
	}
	
	@Override
	public void apagarEmail() {
	    System.out.println("Apagando e-mail de sua caixa de entrada pelo app em seu iPhone.");
	}
}
