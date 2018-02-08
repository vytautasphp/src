package Uzduotis17;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        List<Saskaita> list = new ArrayList<>();
            list.add(new Saskaita("Jonas",200,LocalDate.of(2017, 2, 14)));
        list.add(new Saskaita("Petras",500,LocalDate.of(2017, 4, 18)));
        list.add(new Saskaita("Juozas",365,LocalDate.of(2017, 5, 10)));
        list.add(new Saskaita("Antanas",488,LocalDate.of(2017, 6, 18)));
        list.add(new Saskaita("Ona",633,LocalDate.of(2017, 9, 11)));
        list.add(new Saskaita("Ona",566,LocalDate.of(2017, 12, 11)));


        list.stream().forEach(System.out::println);


        Map<String, Double> q = list.stream()
                .collect(Collectors.groupingBy(
                        Saskaita::getQuarter,
                        Collectors.reducing(0.0, Saskaita::getSuma, Double::sum)));

        System.out.println("Ketvirciu sumos" + q);

    }
}