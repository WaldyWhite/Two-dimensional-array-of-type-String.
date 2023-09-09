import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        String[][] arrays = {
                {"a1", "a2", "a3", "a4", "a5", "a6"},
                {"b1", "b2", "b3", "b4", "b5", "b6"},
                {"c1", "c2",  "c3", "c4", "c5", "c6"}
        };
        for (String[] el : arrays) {
            for (int i = 0; i < el.length ; i++) {
                if (i == el.length-1) {
                    System.out.print("\n");
                } else {
                    System.out.print(el[i]+ " ");
                }
            }
        }
    }
}
