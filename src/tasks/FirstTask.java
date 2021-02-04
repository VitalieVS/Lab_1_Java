package tasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class FirstTask {

    public void solve() {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(System.in));
        System.out.println(
                "N = "
        );
        try {
            int n = Integer.parseInt(
                    reader.readLine()); // will throw error if string
            ArrayList<Double> numberList = readNumbers(n, reader);
            System.out.println(
                    "Min: " + getMin(numberList)
            );
        } catch (Exception e) {
            System.out.println(
                    "Error: " + e
            );
        }
    }

    final ArrayList<Double> readNumbers(int value, BufferedReader reader) {
        double number;
        ArrayList<Double> numberList = new ArrayList<>();
        for (int i = 0; i < value; i++) {
            try {
                System.out.println(
                        "Dati numarul " + i
                );
                number = Double.parseDouble(reader.readLine());
                numberList.add(number);
            } catch (Exception e) {
                System.out.println(
                        "Error: " + e
                );
            }
        }
        return numberList;
    }

    final double getMin(ArrayList<Double> numberList) {
        return Collections.min(numberList);
    }
}
