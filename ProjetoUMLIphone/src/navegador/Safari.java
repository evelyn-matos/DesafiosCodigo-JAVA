package navegador;

public class Safari implements NavegadorInternet{
	
	public void exibirPagina(){
        System.out.println("Exibindo página de internet...");
    }

    public void adicionarNovaAba(){
        System.out.println("Adicionada nova aba ao navegador.");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando página de internet...");
    }
}
