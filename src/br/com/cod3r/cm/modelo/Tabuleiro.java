package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {

    private int linhas;
    private int colunas;
    private int minas;

    private final List<Campo> campos = new ArrayList<>();

    public Tabuleiro(int linhas, int colunas, int minas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.minas = minas;

        gerarCampos();
        associarVizinhos();
        sortearAsMinas();
    }

    private void gerarCampos() {
        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                campos.add(new Campo(linha, coluna));
            }
        }
    }

    private void associarVizinhos() {
        for (Campo c1: campos) {
            for (Campo c2: campos) {
                // Define quem pode ser ou não vizinho, isso de acordo com a distância
                c1.adicionarVizinho(c2);
            }
        }
    }

    private void sortearAsMinas() {
        int minasArmadas = 0;

        // O do-while a seguir vai ser usado para rodar até ter a quantidade de minas desejadas

    }
}
