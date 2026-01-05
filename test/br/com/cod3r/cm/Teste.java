package br.com.cod3r.cm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Teste {

    void testarSeIgualADois() {
        int a = 1 + 1;

        assertEquals(2, a);
    }
    void testarSeIgualATres() {
        int a = 1 + 1 + 1;

        assertEquals(3, a);
    }

    @Test
    void testarSeIgualATress() {
        int a = 1 + 1 + 1;

        assertEquals(3, a);
    }

}
