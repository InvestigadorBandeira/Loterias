package br.com.vga.loterias.dao.xml.db;

import java.util.ArrayList;
import java.util.List;

import br.com.vga.loterias.model.Concurso;

public class Concursos {

    private List<Concurso> concursos = new ArrayList<>();

    public List<Concurso> getConcursos() {
	return concursos;
    }

    public void setConcursos(List<Concurso> concursos) {
	this.concursos = concursos;
    }

}
