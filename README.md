# 🧨 Campo Minado em Java (Console)

Projeto de **Campo Minado** desenvolvido em **Java**, executado no **terminal**, com foco em **boas práticas de Programação Orientada a Objetos**, uso de **exceções**, **streams**, **testes unitários com JUnit 5** e separação clara de responsabilidades.

---

## 📌 Funcionalidades

- ✅ Tabuleiro configurável (linhas, colunas e minas)
- 💣 Sorteio aleatório de minas
- 📍 Marcação e desmarcação de campos
- 🔄 Abertura automática de campos seguros
- ❌ Detecção de explosão ao abrir uma mina
- 🏆 Verificação de vitória
- 🔁 Reinício do jogo
- 🚪 Comando para sair a qualquer momento (`sair`)
- 🧪 Testes unitários cobrindo a lógica do campo

---

## 📁 Estrutura do Projeto

- **br.com.cod3r.cm**
  - `Aplicacao.java`
  - **excecao**
    - `ExplosaoException.java`
    - `SairException.java`
  - **modelo**
    - `Campo.java`
    - `Tabuleiro.java`
    - `CampoTeste.java`
  - **visao**
    - `TabuleiroConsole.java`

---

## 🧠 Conceitos Utilizados

- Programação Orientada a Objetos (POO)
- Encapsulamento
- Exceções personalizadas
- Streams e Lambda Expressions
- Predicate
- Recursividade
- Testes unitários com JUnit 5
- Organização em camadas:
  - **Modelo** → regra de negócio
  - **Visão** → interação com o usuário
  - **Exceções** → controle de fluxo do jogo

---

## 🧩 Principais Classes

### 🔹 Campo
Representa uma célula do tabuleiro.

Responsabilidades:
- Saber se está minado, aberto ou marcado
- Controlar abertura recursiva dos vizinhos
- Verificar se o objetivo foi alcançado
- Contar minas na vizinhança

---

### 🔹 Tabuleiro
Gerencia o jogo como um todo.

Responsabilidades:
- Criar os campos
- Associar vizinhos
- Sortear minas
- Controlar abertura e marcação
- Verificar vitória
- Reiniciar o jogo

---

### 🔹 TabuleiroConsole
Interface de interação via terminal.

Responsabilidades:
- Exibir o tabuleiro
- Ler entradas do usuário
- Controlar o ciclo do jogo
- Tratar exceções de explosão e saída

---

### 🔹 Exceções Personalizadas

- **ExplosaoException** → lançada quando o jogador abre uma mina  
- **SairException** → permite sair do jogo digitando `sair`

---

## ▶️ Como Executar

### Pré-requisitos
- Java 11+  
- IDE Java ou terminal configurado

### Executando pelo terminal

javac br/com/cod3r/cm/Aplicacao.java
java br.com.cod3r.cm.Aplicacao

Ou execute diretamente a classe `Aplicacao` pela sua IDE.

---

## 🎮 Como Jogar

- O tabuleiro será exibido no console
- Digite as coordenadas no formato:

linha,coluna

- Escolha a ação:
  - `1` → Abrir campo
  - `2` → Marcar / Desmarcar campo

- Digite `sair` a qualquer momento para encerrar o jogo

### Símbolos do tabuleiro

| Símbolo | Significado |
|--------|------------|
| `?` | Campo fechado |
| `x` | Campo marcado |
| `*` | Mina |
| `1..8` | Quantidade de minas ao redor |
| ` ` | Campo aberto e seguro |

---

## 🧪 Testes

O projeto possui testes unitários utilizando **JUnit 5**, focados principalmente na classe `Campo`, validando:

- Adição de vizinhos
- Marcação e desmarcação
- Abertura segura
- Explosão ao abrir mina
- Abertura recursiva de vizinhos

Arquivo de testes:

CampoTeste.java

---

## 🚀 Possíveis Melhorias Futuras

- Interface gráfica (JavaFX ou Swing)
- Níveis de dificuldade
- Timer de jogo
- Ranking de jogadores
- Salvamento de partidas
- Build com Maven ou Gradle

---

## 📚 Aprendizado

Este projeto é excelente para praticar:

- Lógica de jogos
- Organização de código
- Testes automatizados
- Uso correto de exceções
- Leitura e manutenção de código Java

---

## 👨‍💻 Autor: Cauã

Projeto desenvolvido com foco em **aprendizado e prática de Java**, aplicando conceitos fundamentais de programação orientada a objetos.

