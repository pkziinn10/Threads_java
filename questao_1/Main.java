public class Main {
    public static void main(String[] args) throws InterruptedException {
        GerenciadorArray gerenciador = new GerenciadorArray();

        // Criar e iniciar threads
        Thread[] threads = new Thread[GerenciadorArray.NUM_PARTES];
        int[][] partes = gerenciador.getPartes();

        for (int i = 0; i < GerenciadorArray.NUM_PARTES; i++) {
            threads[i] = new Thread(new TarefaOrdenacao(partes[i], i));
            threads[i].start();
        }

        // Aguardar conclusão de todas as threads
        for (Thread thread : threads) {
            thread.join();
        }

        // Exibir resultados
        gerenciador.imprimirArrayCompleto();
        gerenciador.imprimirPartesIndividualmente();
    }
}
