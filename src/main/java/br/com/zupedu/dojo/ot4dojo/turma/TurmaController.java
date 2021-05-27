package br.com.zupedu.dojo.ot4dojo.turma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

  @Autowired
  private TurmaRepository turmaRepository;

	@PostMapping
	public ResponseEntity<?> novaTurma(@Valid @RequestBody TurmaRequest request, UriComponentsBuilder uriComponentsBuilder){

		if(turmaRepository.existsByNome(request.getNome())){
			return ResponseEntity.badRequest().body(new ValidateErroroOutPut("aluno", "Aluno já existe"));
		}
		if (turmaRepository.existsByIniciaEm(request.getIniciaEm())){
			return ResponseEntity.badRequest().body("Data já existe para uma turma");
		}

	  Turma turma = request.toModel();

	  var result = turmaRepository.save(turma);

	  URI uri = uriComponentsBuilder.path("/turmas/{id}").buildAndExpand(result.getId()).toUri();

		return ResponseEntity.created(uri).body(new TurmaResponse(turma));
  }

}
