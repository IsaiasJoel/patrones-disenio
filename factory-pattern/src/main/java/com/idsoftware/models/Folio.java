package com.idsoftware.models;

import com.idsoftware.factory.IDocumento;

import java.util.List;
import java.util.Map;

public class Folio implements IDocumento {

    private String numero;
    private String zonaRegistral;
    private String partidaRegistral;
    private String oficina;
    private List<String> titulares;
    private int numPaginas;

    public Folio(Map<String, Object> data) {
        this.numero = (String) data.get("numero");
        this.zonaRegistral = (String) data.get("zonaRegistral");
        this.partidaRegistral = (String) data.get("partidaRegistral");
        this.oficina = (String) data.get("oficina");
        this.titulares = (List<String>) data.get("titulares");
        this.numPaginas = Integer.parseInt((String) data.get("numPaginas"));
    }

    @Override
    public Object procesar() {
        //Realizar algún proceso adicional
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

    public String getPartidaRegistral() {
        return partidaRegistral;
    }

    public void setPartidaRegistral(String partidaRegistral) {
        this.partidaRegistral = partidaRegistral;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public List<String> getTitulares() {
        return titulares;
    }

    public void setTitulares(List<String> titulares) {
        this.titulares = titulares;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
}
