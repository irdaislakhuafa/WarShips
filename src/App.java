import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    private static final String edge = "0123456789";
    private static final String ship = "@";
    private static Scanner scan = new Scanner(System.in);
    private static int x, y;

    public static void main(String[] args) throws Exception {
        int muchShips = 0;
        List<List<String>> arrays = new ArrayList<>();

        // add arraylist 2 dimensi
        for (int i = 0; i < (edge.length()); i++) {
            arrays.add(new ArrayList<>());
        }

        System.out.println("Sebelum ditambahkan");
        System.out.println(Arrays.deepToString(arrays.toArray()));

        // add space characters
        for (int i = 0; i < arrays.size(); i++) {
            for (int j = 0; j < arrays.size(); j++) {
                arrays.get(i).add(" ");
            }
        }
        System.out.println("Sesudah ditambahkan");
        System.out.println(Arrays.deepToString(arrays.toArray()));

        printArrays(arrays);

        // input user
        System.out.print("How many ships? : ");
        muchShips = scan.nextInt();

        for (int i = 0; i < muchShips; i++) {
            System.out.println("=".repeat(5) + " Ships " + (i + 1) + " " + "=".repeat(5));
            System.out.print("Input X : ");
            x = scan.nextInt();
            System.out.print("Input Y : ");
            y = scan.nextInt();
            System.out.println();
            addShip(x, y, arrays);
        }
        printArrays(arrays);

    }

    private static void printArrays(List<List<String>> arrays) {
        clearScreen();
        System.out.println("  " + edge);

        for (int i = 0; i < arrays.size(); i++) {
            System.out.print(i + "|");
            for (int j = 0; j < arrays.size(); j++) {
                System.out.print(arrays.get(i).get(j));
            }
            System.out.print("|" + i);
            System.out.println();
        }

        System.out.println("  " + edge);
    }

    private static List<List<String>> addShip(int x, int y, List<List<String>> arrays) {
        arrays.get(y).set(x, ship);
        return arrays;
    }

    private static void clearScreen() {
        // System.out.println("\033\143");
    }
}
