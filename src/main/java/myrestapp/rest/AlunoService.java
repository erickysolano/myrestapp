package myrestapp.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import myrestapp.alunos.Aluno;

@Path("/alunos")
@Produces(MediaType.APPLICATION_JSON)
public class AlunoService {
	
	@GET()
	public List<Aluno> lista() {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		Aluno a = new Aluno();
		a.setId(1);
		a.setNome("Aluno - 1");
		alunos.add(a);		
		
		return alunos;
	}

}
