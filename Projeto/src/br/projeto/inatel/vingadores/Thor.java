package br.projeto.inatel.vingadores;

public class Thor extends Her�is {

	public Thor(String nome, String poder, float for�a) {
		super(nome,poder,for�a);
	}

	@Override
	public void SofrendoAtaque() {
		for�a-=10;
		
	}
	
	public void AtacandoThanos() {
		for�a+= 30;
	}
	
	@Override
	public void mostrainfo() {
		System.out.println("Nome: " + nome + "\n"
				+ "Poder: " + poder + "\n"
				+ "For�a: " + for�a);
}
	
	

}
