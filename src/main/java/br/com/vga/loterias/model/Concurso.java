package br.com.vga.loterias.model;

import java.io.Serializable;
import java.util.Calendar;

public class Concurso implements Serializable {

    private int concurso;
    private Calendar dataSorteio;
    private int bolas[] = new int[20];

    public Concurso() {
    }

    public Concurso(int concurso, Calendar dataSorteio, int[] bolas) {
	this.concurso = concurso;
	this.dataSorteio = dataSorteio;
	this.bolas = bolas;
    }

    public int getConcurso() {
	return concurso;
    }

    public void setConcurso(int concurso) {
	this.concurso = concurso;
    }

    public Calendar getDataSorteio() {
	return dataSorteio;
    }

    public void setDataSorteio(Calendar dataSorteio) {
	this.dataSorteio = dataSorteio;
    }

    public int[] getBolas() {
	return bolas;
    }

    public void setBolas(int[] bolas) {
	this.bolas = bolas;
    }

}
