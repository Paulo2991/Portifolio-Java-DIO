package mentoriajava.domino;

import java.time.LocalDate;
import java.util.List;

public class Bootcamp {
	private String nome;
	private List<Dev> inscritos;
	private List<ConteudoEducacional> conteudoEducacional;
	private List<Curso> cursos;
	private List<Mentoria> mentoria;
	private LocalDate dataInicio;
	private LocalDate dataFim;

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

	public List<ConteudoEducacional> getConteudoEducacional() {
		return conteudoEducacional;
	}

	public void setConteudoEducacional(List<ConteudoEducacional> conteudoEducacional) {
		this.conteudoEducacional = conteudoEducacional;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public List<Mentoria> getMentoria() {
		return mentoria;
	}

	public void setMentoria(List<Mentoria> mentoria) {
		this.mentoria = mentoria;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}
}
