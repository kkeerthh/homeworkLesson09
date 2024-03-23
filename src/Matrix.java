

public class Matrix {
    public static void main(String[] args) {
        int[][] array = new int[8][8];

        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0) {
                    array[i][j] = j + 1;
                } else {
                    array[i][j]=array[i].length - j;
                }
                System.out.printf("%2d", array[i][j]);
            }
            System.out.println(" ]");
        }
    }
}
