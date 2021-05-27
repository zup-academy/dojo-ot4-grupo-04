package br.com.zupedu.dojo.ot4dojo.turma;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TurmaRequest {

	@NotBlank
	@Size(max = 50)
	private String nome;

	@FutureOrPresent
	@JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
	private LocalDate iniciaEm;

	@FutureOrPresent
	@JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
	private LocalDate terminaEm;

	@Deprecated
	public TurmaRequest() {
	}

	public TurmaRequest(String nome, LocalDate iniciaEm, LocalDate terminaEm) {
		this.nome = nome;
		this.iniciaEm = iniciaEm;
		this.terminaEm = terminaEm;
	}

	public Turma toModel(){
		return new Turma(this.nome, this.iniciaEm, this.terminaEm);
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getIniciaEm() {
		return iniciaEm;
	}

	public LocalDate getTerminaEm() {
		return terminaEm;
	}
}
