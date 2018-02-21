package Uzduotis23;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

        static final long LOOP = 100;

        public static void main(String... args) throws InterruptedException {

            List<Integer> list = Collections.synchronizedList(new ArrayList<>());


            for (int y = 0; y < 10; y++) {
                // Create Thread class
                Thread temp = new Thread(() -> {
                    for (int i = 0; i < LOOP; i++) {
                        Random rand = new Random();
                        int x = rand.nextInt(100) + 1;
                        list.add(x);
                    }
                });

                temp.start();

                try {
                    temp.join(10);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            Map<Integer, Long> lista = list.stream()
                    .collect(Collectors.groupingBy(
                            Function.identity(), Collectors.counting()));
            System.out.println(lista);
        }
}
