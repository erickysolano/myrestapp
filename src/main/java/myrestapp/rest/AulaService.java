package myrestapp.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import myrestapp.aulas.Aula;


@Path("/aulas")
@Produces(MediaType.APPLICATION_JSON)
public class AulaService {
	
	@GET()
	public List<Aula> lista() {
		
		List<Aula> Aulas = new ArrayList<Aula>();
		Aula a = new Aula();
		a.setId(1);
		a.setNome("Aula - 1");
		Aulas.add(a);		
		
		return Aulas;
	}


}
