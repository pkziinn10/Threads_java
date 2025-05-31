import java.util.Random;

public class GerenciadorArray {
    public static final int TAMANHO_TOTAL = 1000;
    public static final int TAMANHO_PARTE = 100;
    public static final int NUM_PARTES = TAMANHO_TOTAL / TAMANHO_PARTE;

    private final int[][] partes = new int[NUM_PARTES][TAMANHO_PARTE];

    public GerenciadorArray() {
        gerarArrayAleatorio();
    }

    private void gerarArrayAleatorio() {
        Random random = new Random();
        int[] arrayCompleto = new int[TAMANHO_TOTAL];

        for (int i = 0; i < TAMANHO_TOTAL; i++) {
            arrayCompleto[i] = random.nextInt(10000) + 1;
        }

        dividirArray(arrayCompleto);
    }

    private void dividirArray(int[] arrayCompleto) {
        for (int i = 0; i < NUM_PARTES; i++) {
            System.arraycopy(arrayCompleto, i * TAMANHO_PARTE, partes[i], 0, TAMANHO_PARTE);
        }
    }

    public int[][] getPartes() {
        return partes;
    }

    public void imprimirArrayCompleto() {
        System.out.println("\nVetor completo após ordenação paralela:");
        for (int[] parte : partes) {
            for (int valor : parte) {
                System.out.print(valor + " ");
            }
        }
        System.out.println();
    }

    public void imprimirPartesIndividualmente() {
        System.out.println("\nPartes ordenadas individualmente:");
        for (int i = 0; i < NUM_PARTES; i++) {
            System.out.println("\nParte " + (i + 1) + ":");
            for (int j = 0; j < TAMANHO_PARTE; j++) {
                System.out.print(partes[i][j] + " ");
                if ((j + 1) % 10 == 0) System.out.println();
            }
        }
    }
}
