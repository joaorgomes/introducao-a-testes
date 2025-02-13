package br.edu.ifpb.testeunitario.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExemploServiceTeste {

    @Test
    void testeSomaValoresVerificarSeIgualENaoIgual() {

        //configurar
        ExemploService exemploService = new ExemploService();
        int resultadoEsperado = 6;

        //executar
        int resultadoReal = exemploService.somaValores(2, 4);

        //verificar
        Assertions.assertEquals(resultadoEsperado, resultadoReal, "6 + 4 deve ser 10");

    }
}
