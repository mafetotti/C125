package br.projeto.inatel.marvel;

public abstract class Marvel {
	
	protected String nome;
	protected String poder;
	protected float for�a;
	
	public Marvel(String nome, String poder, float for�a) {
		this.nome = nome;
		this.poder= poder;
		this.for�a = for�a;
	}

	public abstract void SofrendoAtaque();
	
	public abstract void mostrainfo();
}
