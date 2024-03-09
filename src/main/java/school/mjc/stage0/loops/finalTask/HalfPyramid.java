package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
   	
    	 for (int i = cathetusLength; i >= 1; i--) {
             for (int j = 1; j < i; j++) {
                 System.out.print("  "); // Imprime espacios en blanco para alinear los asteriscos
             }
             for (int k = i; k <= cathetusLength; k++) {
                 System.out.print("* ");
             }
             System.out.println();
         }}

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
