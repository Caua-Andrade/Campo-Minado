package br.com.cod3r.cm.modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CampoTeste {

    private Campo campo;

    // O BeforEach serve para executar algo antes de cada método
    @BeforeEach
    void iniciarCampo() {
        new Campo(3, 3);
    }

    @Test
    void testeVizinhoRealDistancia1() {
        Campo vizinho = new Campo(3, 2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }
}
