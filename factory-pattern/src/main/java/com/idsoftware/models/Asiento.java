package com.idsoftware.models;

import com.idsoftware.factory.IDocumento;

import java.util.Map;

public class Asiento implements IDocumento {
    private String numero;
    private String titular;
    private int numPaginas;

    public Asiento(Map<String, Object> data) {
        this.numero = (String) data.get("numero");
        this.titular = (String) data.get("titular");
        this.numPaginas = Integer.parseInt((String) data.get("numPaginas"));
    }

    @Override
    public Object procesar() {
        //realizar algún proceso adicional
        return this;
    }

    // Getters y setters (o utiliza Lombok para generarlos automáticamente)
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
}