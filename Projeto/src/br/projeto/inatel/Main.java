package br.projeto.inatel;

import br.projeto.inatel.vil�es.*;
import br.projeto.inatel.vingadores.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {

	public static void main(String[] args) {

		Thor Thor = new Thor("Thor", "Martelo", 100);
		Capit�oAm�rica CapitaoAmerica = new Capit�oAm�rica("Steve Rogers", "Super For�a", 100);
		Gavi�oArqueiro Gavi�oArqueiro = new Gavi�oArqueiro("Clint Barton", "Habilidade em atirar com arco e flexa",
				100);
		Hulk Hulk = new Hulk("Bruce Banner", "Incontrol�vel for�a", 100);
		Vi�vaNegra Vi�vaNegra = new Vi�vaNegra("Natasha  Romanoff", "habilidade em lutar", 100);
		HomemDeFerro HomemDeFerro = new HomemDeFerro("Tony Stark", "Intelig�ncia", 100);
		Thanos Thanos = new Thanos("Thanos", "Super for�a", 100);

		Path arquivo = Paths.get("MotivosParaAssistirOsFilmesDaMarvel.txt");
		
		try {
			Files.write(arquivo,
					"Porque � bom demais, se voc� n�o gostou � porque assistiu errado, assiste novamente\n".getBytes(),
					StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		} catch (IOException erro) {
			erro.printStackTrace();
		}
		
		Thor.mostrainfo();
		CapitaoAmerica.mostrainfo();
		Gavi�oArqueiro.mostrainfo();
		Hulk.mostrainfo();
		Vi�vaNegra.mostrainfo();
		HomemDeFerro.mostrainfo();
		Thanos.mostrainfo();

		Thor.AtacandoThanos();
		Thanos.SofrendoAtaque();

		Thanos.AtacandoVingadores();
		CapitaoAmerica.SofrendoAtaque();
		Vi�vaNegra.SofrendoAtaque();

		CapitaoAmerica.AtacandoThanos();
		Thanos.SofrendoAtaque();

		HomemDeFerro.AtacandoThanos();
		Thanos.SofrendoAtaque();

		Thanos.AtacandoVingadores();
		Vi�vaNegra.SofrendoAtaque();
		HomemDeFerro.SofrendoAtaque();
		Gavi�oArqueiro.SofrendoAtaque();

		try {
			Thanos.CapturandoJoias(4);
		} catch (JoiaDoInfinitoInexistente erro) {
			System.out.println(erro.getMessage());
		}

		Thanos.AtacandoVingadores();
		Thor.SofrendoAtaque();
		HomemDeFerro.SofrendoAtaque();
		HomemDeFerro.SofrendoAtaque();

		try {
			Thanos.CapturandoJoias(2);
		} catch (JoiaDoInfinitoInexistente erro) {
			System.out.println(erro.getMessage());
		}

		try {
			Files.write(arquivo,
					"Porque � bom demais, se voc� n�o gostou � porque assistiu errado, assiste novamente\n".getBytes(),
					StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		} catch (IOException erro) {
			erro.printStackTrace();
		}

		System.out.println("Porem em Vingadores Ultimato eles voltam no tempo e vencem Thanos");

		try {
			Files.write(arquivo,
					"Porque � bom demais, se voc� n�o gostou � porque assistiu errado, assiste novamente\n".getBytes(),
					StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}

}
