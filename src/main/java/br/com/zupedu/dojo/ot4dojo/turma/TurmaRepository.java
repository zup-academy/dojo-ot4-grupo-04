package br.com.zupedu.dojo.ot4dojo.turma;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long> {
    boolean existsByNome(String nome);

    boolean existsByIniciaEm(LocalDateTime iniciaEm);
}
