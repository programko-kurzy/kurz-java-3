import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Hodina1 {

    public static void main(String[] args) {

        // 1.1
        Random r = new Random();
        int x = r.nextInt(20) + 1;
        List<Integer> cisla = new ArrayList<>();
        for (int i = 0; i <= x; i++) {
            int cislo = r.nextInt(100) + 1;
            cisla.add(cislo);
        }
        System.out.println(cisla);

        // 1.2
        System.out.println("Dlzka: " + cisla.size());
        int sucet = 0;
        for (int i = 0; i < cisla.size(); i++) {
            sucet = sucet + cisla.get(i);
        }
        System.out.println("Sucet: " + sucet);
        int index = r.nextInt(cisla.size());
        cisla.remove(index);
        System.out.println(cisla);

        // 1.3
        int minimum = cisla.get(0);
        for (int i = 1; i < cisla.size(); i++) {
            if (cisla.get(i) < minimum) {
                minimum = cisla.get(i);
            }
        }
        System.out.println("Minimum: " + minimum);
        int maximum = cisla.get(0);
        for (int i = 1; i < cisla.size(); i++) {
            if (cisla.get(i) > maximum) {
                maximum = cisla.get(i);
            }
        }
        System.out.println("Maximum: " + maximum);
        int rozdiel = maximum - minimum;
        System.out.println("Rozdiel max - min: " + rozdiel);
        if (rozdiel >= cisla.size()) {
            cisla.add(rozdiel);
        } else {
            cisla.remove(rozdiel);
        }
        System.out.println(cisla);

        // 1.4
        List<Integer> cisla2 = new ArrayList<>(Arrays.asList(1, 3, 3, 41, 5, 6, 10, 13, 27, 0, -7, 9));
        System.out.println(cisla2);
        int minIndex = 0;
        for (int i = 1; i < cisla2.size(); i++) {
            if (cisla2.get(i) < cisla2.get(minIndex)) {
                minIndex = i;
            }
        }
        System.out.println("Index minima: " + minIndex);
        int maxIndex = 0;
        for (int i = 1; i < cisla2.size(); i++) {
            if (cisla2.get(i) > cisla2.get(maxIndex)) {
                maxIndex = i;
            }
        }
        System.out.println("Index maxima: " + maxIndex);

        // 1.5
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 72));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(-5, 0, 29));
        List<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            list3.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            list3.add(list2.get(i));
        }
        System.out.println(list3);
        if (list3.size() > 7) {
            for (int i = 0; i < 3; i++) {
                list3.remove(i);
            }
        } else {
            for (int i = 0; i < list3.size() / 2; i++) {
                list3.remove(i);
            }
        }
        System.out.println(list3);

        // 1.6
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1, 3, 3, 41, 5, 6, 10, 13, 27, 0, -7, 9));
        int i = 0;
        System.out.println("while");
        while (i < list4.size()) {
            System.out.println(list4.get(i));
            i++;
        }
        System.out.println("for");
        for (i = list4.size() - 1; i >= 0; i--) {
            System.out.println(list4.get(i));
        }

        // 1.7
        int n = r.nextInt(list4.size());
        for (i = 0; i < n; i++) {
            int idx = r.nextInt(list4.size());
            list4.remove(idx);
        }
        System.out.println(list4);

        //1.8
        List<Integer> list5 = new ArrayList<>(Arrays.asList(1, 3, 5, 6, 10, 27, 0, 9));
        list5.add(2, 3);
        list5.add(3, 41);
        list5.add(7, 13);
        list5.add(10, -7);
        System.out.println(list5);
    }
}
