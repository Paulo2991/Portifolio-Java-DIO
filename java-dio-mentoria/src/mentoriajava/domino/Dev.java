package mentoriajava.domino;

import java.util.List;

public class Dev {
	private String nome;
	private List<ConteudoEducacional> conteudosInscritos;
	private List<ConteudoEducacional> conteudosConcluidos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<ConteudoEducacional> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(List<ConteudoEducacional> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public List<ConteudoEducacional> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(List<ConteudoEducacional> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}
}
