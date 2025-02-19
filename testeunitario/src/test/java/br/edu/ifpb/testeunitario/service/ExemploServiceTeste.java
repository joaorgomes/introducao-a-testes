package br.edu.ifpb.testeunitario.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ExemploServiceTeste {
    private ExemploService exemploService;

    @Order(4)
    @Test
    @DisplayName("Verifica se os numeros sao iguais")
    void testeSomaValoresVerificarSeIgualENaoIgual() {

        // //configurar
        // ExemploService exemploService = new ExemploService();
        // int resultadoEsperado = 10;

        // //executar
        // int resultadoReal = exemploService.somaValores(6, 4);

        // //verificar
        // Assertions.assertEquals(resultadoEsperado, resultadoReal, "6 + 4 deve ser 10");

        ExemploService exExemploService = new ExemploService();
        assertEquals(6, exExemploService.somaValores(2, 4), "2 * 4 deve ser 6");
    }

    @Order(3)
    @Test
    @DisplayName("Verifica se o ojeto é nulo")
    void testeVerificarObjetoNulo(){
        ExemploService exExemploService = new ExemploService();
        assertNull(exExemploService.verificarNulo(null), "O objeto dever ser nulo");
        assertNotNull(exExemploService.verificarNulo("string"), "O objeto não deve ser nulo");
    }

    @Test
    @Order(2)
    @DisplayName("Verifica se um numero é maior que outro")
    void testeVerificarSeValorMaiorQue(){
        ExemploService exExemploService = new ExemploService();
        assertTrue(exExemploService.verificarSeMaiorQue(10,5),"O valor 1 deve ser maior que 2");
        assertFalse(exExemploService.verificarSeMaiorQue(5,20),"O valor 1 deve ser maior que 2");
    }
    @Order(1)
    @Test
    void testeVerificarTimeout(){
        System.out.println("Metodo: testeVerificarTimeout");
        assertTimeout(Duration.ofSeconds(6),()-> {exemploService.checarTimeout();});
        assertTimeoutPreemptively(Duration.ofSeconds(6),()-> {exemploService.checarTimeout();});
    }

    @BeforeAll
    static void configuraAntesDeTudo(){
        System.out.println("Executanda BeforeAll");
    }
    @AfterAll
    static void configuraDepoisDeTudo(){
        System.out.println("Executanda AfterAll");
    }
    @BeforeEach
    void configuraAntesDeCadaMetodoTeste(){
        System.out.println("Executando o metodo com BeforeEach");
        exemploService = new ExemploService();
    }
    @AfterEach
    void executarDepoisDeCadaMetodoTeste(){
        System.out.println("Executando o metodo com AfterEach\n\n");
        
    }
}
