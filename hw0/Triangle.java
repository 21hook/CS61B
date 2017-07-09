
public class Triangle {

    /**
     * Print a triangle with 5 rows at consoles
     */
    public static void drawTriangle() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }

    /**
     * drawTriangle(5);
     * drawTriangle(10);
     * 
     * Print a triangle with a specified rows at consoles
     * @param N the number of rows of a triangle
     */
    public static void drawTriangle2(int N) {

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }

    }

}
