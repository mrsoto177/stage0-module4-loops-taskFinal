package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
    	/*/int j = 0;
    	for(int i = 0; i < cathetusLength; i++) {
    		for( j = 1; j <= i; j++) {
    			//System.out.print(j);
    			//System.out.print(i);
    			
    			System.out.print("");
    			
        	}
    		
    		System.out.println(j);
    	}*/
    	
    	/* for (int i = 0; i < cathetusLength; i++) { //iterar sobre las filas
             for (int j = 0; j <= i; j++) {
            	   System.out.print("8");//iterar en columnas del cuadrado
                 
             }
             System.out.println("");
         }*/
    	for (int i = 1; i <= cathetusLength; i++) {
            // Imprimir espacios en blanco
            for (int j = 1; j <= cathetusLength - i; j++) {
                System.out.print(" ");
            }

         // Imprimir números ascendentes
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

            // Imprimir números descendentes
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }

            // Cambiar de línea después de cada fila
            System.out.println();
        }
    	 
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
