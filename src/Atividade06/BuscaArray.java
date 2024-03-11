package Atividade06;

public class BuscaArray {
    
    private static boolean encontrou = false;
    private static int result = -1;

    private int[] array;
    private int valorBusca;

    public BuscaArray(int[] array, int valorBusca) {
        this.array = array;
        this.valorBusca = valorBusca;
    }

    public int buscar(int nThreads) {
        encontrou = false; 
        result = -1; 

        int tamSegmento = array.length / nThreads; // Tamanho do segmento de cada thread
        Thread[] threads = new Thread[nThreads];

        for (int i = 0; i < nThreads; i++) {
            int inicio = i * tamSegmento;
            int fim = (i == nThreads - 1) ? array.length : inicio + tamSegmento;

            threads[i] = new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " segmento: " + inicio + " a " + (fim - 1));
                for (int j = inicio; j < fim; j++) {
                    synchronized (this) {
                        if (!encontrou) {
                            System.out.println(Thread.currentThread().getName() + "' verificando posição " + j);
                            if (array[j] == valorBusca) {
                                encontrou = true;
                                result = j;
                                System.out.println("-> " + Thread.currentThread().getName() + " ENCONTROU O NÚMERO " + valorBusca + " NO ÍNDICE " + j);
                            }
                        }
                    }
                    if (encontrou) {
                        break;
                    }
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

}
