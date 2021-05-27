package br.com.zupedu.dojo.ot4dojo.turma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

  @Autowired
  private TurmaRepository turmaRepository;

	@PostMapping
	public ResponseEntity<TurmaRequest> novaTurma(@Valid @RequestBody TurmaRequest request){

	  Turma turma = request.toModel();

	  turmaRepository.save(turma);

	  return ResponseEntity.ok().build();
  }

}
