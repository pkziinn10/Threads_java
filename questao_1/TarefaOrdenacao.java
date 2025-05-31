import java.util.Arrays;

public class TarefaOrdenacao implements Runnable {
    private final int[] array;
    private final int idParte;

    public TarefaOrdenacao(int[] array, int idParte) {
        this.array = array;
        this.idParte = idParte;
    }

    @Override
    public void run() {
        System.out.println("Thread " + (idParte + 1) + " iniciando ordenação...");
        Arrays.sort(array);
        System.out.println("Thread " + (idParte + 1) + " concluída!");
    }
}
