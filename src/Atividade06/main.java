package Atividade06;

public class main {
	
  	public static void main(String[] args) {
  		
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        
        int valorBusca = 16;
        BuscaArray busca = new BuscaArray(array, valorBusca);
        
        int resultado = busca.buscar(4); 
        System.out.println("Resultado: " + resultado);
    }

}
