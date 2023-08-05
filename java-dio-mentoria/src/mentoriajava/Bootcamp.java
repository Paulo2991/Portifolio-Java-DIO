package mentoriajava;

import java.util.List;

public class Bootcamp {
	private String nome;
	private List<Dev> inscritos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Dev> getInscritos() {
		return inscritos;
	}
	public void setInscritos(List<Dev> inscritos) {
		this.inscritos = inscritos;
	}
}
