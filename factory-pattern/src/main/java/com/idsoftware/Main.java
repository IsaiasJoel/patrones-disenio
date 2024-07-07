package com.idsoftware;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.idsoftware.factory.DocumentoFactory;
import com.idsoftware.factory.IDocumento;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        //Simulación de petición y respuesta de la API
        final String URL = "https://miapi.com";
        RestTemplate restTemplate = new RestTemplate();
        String apiResponse = restTemplate.getForObject(URL, String.class); //devuelve un Json (String)

        // Parsear la respuesta a un mapa
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> data = objectMapper.readValue(apiResponse, Map.class);

        // Adecuar según la estructura del objeto recibido
        // Aquí se puede implementar un algoritmo de identificación del tipo
        // Según la complejidad de la respuesta
        String tipoDocumento = (String) data.get("tipo");

        // Crear el documento usando el Factory
        IDocumento documento = DocumentoFactory.crearDocumento(tipoDocumento,data);

        // Procesar el documento
        // De aquí hacia adelante se puede adaptar el proceso de acuerdo a las necesidades
        Object miDocumento = documento.procesar();
    }
}