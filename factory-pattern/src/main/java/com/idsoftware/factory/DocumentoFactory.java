package com.idsoftware.factory;

import com.idsoftware.models.Asiento;
import com.idsoftware.models.Ficha;
import com.idsoftware.models.Folio;

import java.util.Map;

public class DocumentoFactory {
    public static IDocumento crearDocumento(String tipo, Map<String, Object> data) {
        return switch (tipo.toLowerCase()) {
            case "asiento" -> new Asiento(data);
            case "folio" -> new Folio(data);
            case "ficha" -> new Ficha(data);
            default -> throw new IllegalArgumentException("Tipo de documento desconocido: " + tipo);
        };
    }
}
