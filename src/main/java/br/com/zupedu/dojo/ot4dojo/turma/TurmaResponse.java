package br.com.zupedu.dojo.ot4dojo.turma;

import java.time.LocalDate;

public class TurmaResponse {


    private Long id;
    private String nome;
    private LocalDate iniciaEm;
    private LocalDate terminaEm;

    public TurmaResponse(Turma turma) {
        this.id = id;
        this.nome = nome;
        this.iniciaEm = iniciaEm;
        this.terminaEm = terminaEm;
    }
}
