package br.projeto.inatel.vil�es;


public class Thanos extends Vil�es {
	
	int JoiaDoInfinito;

	public Thanos(String nome, String poder, float for�a) {
		super(nome, poder, for�a);
	}

	public void AtacandoVingadores() {
		 for�a += 10;
	}
	
	public void CapturandoJoias(int joia) throws JoiaDoInfinitoInexistente {
		JoiaDoInfinito+= joia;
		
		if(JoiaDoInfinito == 6) {
			System.out.println("Foi capturada as 6 j�ias do infinito, Thanos vence os vingadores" +
	"\n" + "Tudo isso acontece em: Vingadores Guerra Infinita");
		}
		
		else if (JoiaDoInfinito < 6) {
			System.out.println("Thanos ja capturou " + JoiaDoInfinito + " joias do infinito");
		}
		
		else {
			throw new JoiaDoInfinitoInexistente (" N�o existe mais joias Thanos");
		}
	}

	@Override
	public void SofrendoAtaque() {
		for�a-= 20;
		
	}
	
	@Override
	public void mostrainfo() {
		System.out.println("Nome: " + nome + "\n"
				+ "Poder: " + poder + "\n"
				+ "For�a: " + for�a);
}
	
	
}
