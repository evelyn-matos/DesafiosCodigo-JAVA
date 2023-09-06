package application;

import java.util.Scanner;

import iphone.Iphone;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        Iphone iphone = new Iphone();
        
        int op = 1;
        
        do{
            System.out.println("""
                                     
                                     iPhone_2007
                    LIGAR(1), ATENDER(2), INICIAR_CORREIO_VOZ(3), 
                    TOCAR(4), PAUSAR(5), SELECIONAR_MUSICA(6), 
                    EXIBIR_PAGINA_WEB(7), ADICIONAR_NOVA_ABA(8), ATUALIZAR_PAGINA(9), 
                    ENVIAR_EMAIL(10), RESPONDER_EMAIL(11), APAGAR_EMAIL(12)
                    """);
            System.out.print("Sua opção: ");
            int opcao = sc.nextInt();
            
            switch (opcao){
                case 1:
                    iphone.ligar();
                    break;
                case 2:
                    iphone.atender();
                    break;
                case 3:
                    iphone.iniciarCorreioVoz();
                    break;
                case 4:
                    iphone.tocar();
                    break;
                case 5:
                    iphone.pausar();
                    break;
                case 6:
                    iphone.selecionarMusica();
                    break;
                case 7:
                    iphone.exibirPagina();
                    break;
                case 8:
                    iphone.adicionarNovaAba();
                    break;
                case 9:
                    iphone.atualizarPagina();
                    break;
                case 10:
                    iphone.enviarEmail();
                    break;
                case 11:
                    iphone.responderEmail();
                    break;
                case 12:
                    iphone.apagarEmail();
                    break;

                default:
                    System.out.println();
            }

            System.out.print("Gostaria de continuar usando seu iPhone? S/N ");
            String r = sc.next().toLowerCase();
            if(r.charAt(0) != 's'){
                op = 0;
            }
        } while(op != 0);
        
        sc.close();

	}

}
