package br.com.zupedu.dojo.ot4dojo.turma;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;

@Entity
public class Turma {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Column(length = 50)
	private String nome;
	
	@FutureOrPresent
	private LocalDateTime iniciaEm;

	@FutureOrPresent
	private LocalDateTime terminaEm;

	@Deprecated
	public Turma() {
	}

	public Turma(String nome, LocalDateTime iniciaEm, LocalDateTime terminaEm) {
		this.nome = nome;
		this.iniciaEm = iniciaEm;
		this.terminaEm = terminaEm;
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
