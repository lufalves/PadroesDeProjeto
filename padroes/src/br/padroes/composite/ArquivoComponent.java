package br.padroes.composite;

public abstract class ArquivoComponent {
	String nomeDoArquivo;

	public String getNomedoArquivo() {
		return this.nomeDoArquivo;
	}

	public void printNomeDoArquivo() {
		System.out.println(this.nomeDoArquivo);
	}
}

