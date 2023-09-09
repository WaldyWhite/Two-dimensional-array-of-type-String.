public class TwoDimensionalArray {
    public static void main(String[] args) {
        String[][] arrays = new String [3][6];
        int i, j, k;
        for ( i = 0; i < arrays.length; i++) {
            for (j = 0; j < arrays[i].length; j++) {
                if (i == 0) {
                    arrays[i][j] = "a" + (j + 1);
                } else if (i == 1) {
                    arrays[i][j] = "b" + (j + 1);
                } else {
                    arrays[i][j] = "c" + (j + 1);
                }
            }
        }

        for (String[] el : arrays) {
            for (k = 0; k < el.length; k++) {
                if (k == 5) {
                    System.out.print("\n");
                } else {
                    System.out.print(el[k] + " ");
                }
            }
        }
    }
}
