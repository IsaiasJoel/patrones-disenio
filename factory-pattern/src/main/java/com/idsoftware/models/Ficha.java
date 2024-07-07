package com.idsoftware.models;

import com.idsoftware.factory.IDocumento;

import java.util.List;
import java.util.Map;

public class Ficha implements IDocumento {

    private String numero;
    private String zonaRegistral;
    private int numPaginas;
    private List<String> titulares;

    public Ficha(Map<String, Object> data) {
        this.numero = (String) data.get("numero");
        this.zonaRegistral = (String) data.get("numero");
        this.numPaginas = Integer.parseInt((String) data.get("numero"));
        this.titulares = (List<String>) data.get("numero");
    }

    @Override
    public Object procesar() {
        return this;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getZonaRegistral() {
        return zonaRegistral;
    }

    public void setZonaRegistral(String zonaRegistral) {
        this.zonaRegistral = zonaRegistral;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public List<String> getTitulares() {
        return titulares;
    }

    public void setTitulares(List<String> titulares) {
        this.titulares = titulares;
    }
}
