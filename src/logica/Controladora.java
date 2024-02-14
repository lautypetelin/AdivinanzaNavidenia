package logica;

import java.util.Random;

public class Controladora {
    
    public String[][] generarMatriz(){
    
        Random random = new Random();
        String emogis[] = {"🎅","⭐","🎄","🎁"};
        String matriz[][] = new String[4][4];
        
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                matriz[f][c] = emogis[random.nextInt(emogis.length)];
            }
        }
        
        return matriz;
    }
    
    public int determinarCantidadEmogi(String emogi, String matriz[][], int cantidad){
        
        int cantidadEncontrada = 0;
        
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                if(matriz[f][c].equals(emogi)){
                    cantidadEncontrada++;
                }
            }
        }
        
        return cantidadEncontrada;
    }
}
