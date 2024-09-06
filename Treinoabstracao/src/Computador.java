public class Computador {
	public String processador;
	public int memoria;
	public String fonte;
	
	public void ligarComputador() {
		System.out.println("Ligado!");
	}
	public void acessarInternet(){
		System.out.println("Internet Acessada!");
	}
	public int  memoria(){
		return 1000;	
	}
	
	public void programar(){
		System.out.println("Programando! \n");
	}
	
}
