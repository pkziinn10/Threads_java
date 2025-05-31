# 🧵 Ordenação Paralela com Threads em Java ⚡️

**Ordenação Paralela com Threads em Java** é um projeto que demonstra o poder da computação paralela aplicada à ordenação de dados. Utilizando múltiplas threads para processar diferentes partes de um vetor simultaneamente, este projeto oferece uma solução eficiente para ordenação de grandes conjuntos de dados, mostrando na prática os benefícios da programação concorrente.

## 📌 Funcionalidades

- **Geração de dados aleatórios**  
  - Cria um vetor de 1000 números inteiros positivos entre 1 e 10000

- **Divisão inteligente**  
  - Separa o vetor em 10 partes de 100 elementos cada

- **Ordenação paralela**  
  - Cada parte é ordenada por uma thread independente

- **Visualização clara**  
  - Impressão do vetor completo após ordenação  
  - Exibição individual das 10 partes ordenadas

- **Monitoramento em tempo real**  
  - Mensagens de log mostrando o progresso de cada thread

## ⚙️ Arquitetura e Boas Práticas

Este projeto segue princípios modernos de desenvolvimento de software, visando qualidade e eficiência:

### 🧱 Padrões de Projeto

- **Separação de Responsabilidades**  
  - Divisão clara entre geração de dados, processamento e exibição

- **Encapsulamento**  
  - Detalhes de implementação protegidos em classes especializadas

- **Programação Orientada a Interfaces**  
  - Uso da interface `Runnable` para tarefas paralelas

### ⚡️ Concorrência

- **Modelo de threads**  
  - Execução paralela de cada subvetor por threads independentes

- **Sincronização com `join()`**  
  - Coordenação das threads para aguardar a conclusão de todas antes de prosseguir

- **Tarefas independentes**  
  - Cada thread opera exclusivamente em seu subvetor, garantindo máxima eficiência

### 📐 Boas Práticas

- **Mensagens informativas de log**  
- **Formatação de saída para melhor visualização**  
- **Tratamento adequado de exceções**

## 🧪 Qualidade de Código

Para garantir robustez e eficiência, implementamos:

- **Validação de Dados**  
  - Garantia de números dentro do intervalo especificado

- **Constantes Configuráveis**  
  - Flexibilidade para ajustes (tamanhos, intervalos)

- **Documentação Clara**  
  - Código autoexplicativo com comentários estratégicos

## 🧠 Conceitos Técnicos Aplicados

### ⚡️ Programação Concorrente

- Utilização de threads para processamento paralelo  
- Implementação da interface `Runnable` para tarefas paralelizáveis  
- Sincronização com `thread.join()` para coordenação de execução

### 📊 Estrutura de Dados

- Manipulação eficiente de arrays com `System.arraycopy()`  
- Algoritmo de ordenação otimizado com `Arrays.sort()`  
- Organização de dados em matrizes bidimensionais

## ⚡️ Como Executar

```bash
# 1. Clone o repositório
git clone https://github.com/seu-usuario/ordenacao-paralela-threads-java.git

# 2. Acesse o diretório
cd ordenacao-paralela-threads-java

# 3. Compile os arquivos
javac *.java

# 4. Execute o programa
java Main
