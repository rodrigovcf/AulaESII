package br.com.es2;

public class Mensageiro {

	private String mensagem;
	
	public Mensageiro(String mensagem){
		this.mensagem = mensagem;
	}
	
	public void exibeMensagem(){
		System.out.println(mensagem);
	}
	
	public void exibeOutraMensagem(){
		System.out.println("Outra mensagem: " + mensagem);
	}
	
}
