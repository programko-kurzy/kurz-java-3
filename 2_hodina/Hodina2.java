import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hodina2 {

    public static void main(String[] args) {

        // 2.1
        Map<String, Integer> points = new HashMap<>();
        points.put("Adam", 34);
        points.put("Paul", 20);
        points.put("Anna", 45);
        points.put("Nina", 30);
        System.out.println(points);
        for (String i : points.keySet()) {
            System.out.println(i);
        }
        for (Integer i : points.values()) {
            System.out.println(i);
        }

        //2.2
        Scanner myScanner = new Scanner(System.in);
        String slova = "";
        for (int i = 0; i < 10; i++) {
            String input = myScanner.nextLine();
            slova = slova + input;
        }
        Map<Character, Integer> statistics = new HashMap<>();
        for (int i = 0; i < slova.length(); i++) {
            char pismeno = slova.charAt(i);
            if (statistics.get(pismeno) != null) {
                statistics.put(pismeno, statistics.get(pismeno) + 1);
            } else {
                statistics.put(pismeno, 1);
            }
        }
        System.out.println(statistics);

        // 2.3
        Map<String, Integer> points2 = new HashMap<>();
        points2.put("Adam", 28);
        points2.put("Mary", 30);
        points2.put("John", 21);
        points2.put("Paul", 15);
        points2.put("Anna", 24);
        points2.put("Tina", 18);
        points2.put("David", 12);
        points2.put("Max", 25);

        Map<String, String> grades = new HashMap<>();
        for (String key : points2.keySet()) {
            String grade = "";
            int point = points2.get(key);
            if (point >= 26) {
                grade = "A";
            } else if (point >= 21) {
                grade = "B";
            } else if (point >= 16) {
                grade = "C";
            } else if (point >= 11) {
                grade = "D";
            } else if (point >= 6) {
                grade = "E";
            }
            grades.put(key, grade);
        }
        System.out.println(grades);

        //2.4
        int sucet = 0;
        for (String key : points2.keySet()) {
            sucet = sucet + points2.get(key);
        }
        System.out.println(sucet);

        // 2.5
        String text = null;
        Integer cislo = null;
        System.out.println(text);
        System.out.println(cislo);
        if (text == null) {
            System.out.println("Nullpointer exception");
        } else {
            System.out.println(text.length());
        }
    }
}
