import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String filepath = "C:\\GUI\\tasks\\task1\\dane.txt";

        List<String> col1 = new ArrayList<>();
        List<String> col2 = new ArrayList<>();

        try {
            File file = new File(filepath);
            Scanner scanner = new Scanner(file);

            boolean firstCol = true;


            while (scanner.hasNext()) {
                String word = scanner.next();

                if (firstCol) {
                    col1.add(word);
                } else {
                    col2.add(word);
                }
                firstCol = !firstCol;
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.err.println("Nie można odnaleźć pliku pod tą lokalizacją: " + filepath);
            e.printStackTrace();
        }


        for (int i = 0; i < col1.size(); i++) {
            System.out.println(col2.get(i) + "\t" + col1.get(i));
        }
    }
}
