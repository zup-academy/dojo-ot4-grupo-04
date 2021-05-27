package br.com.zupedu.dojo.ot4dojo.turma;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

public class TurmaRequest {

	@NotBlank
	@Size(max = 50)
	private String nome;

	@FutureOrPresent
	@JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
	private LocalDateTime iniciaEm;

	@FutureOrPresent
	@JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
	private LocalDateTime terminaEm;

	@Deprecated
	public TurmaRequest() {
	}

	public TurmaRequest(String nome, LocalDateTime iniciaEm, LocalDateTime terminaEm) {
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

	public LocalDateTime getIniciaEm() {
		return iniciaEm;
	}

	public LocalDateTime getTerminaEm() {
		return terminaEm;
	}

}
