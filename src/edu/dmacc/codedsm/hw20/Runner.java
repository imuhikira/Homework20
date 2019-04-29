package edu.dmacc.codedsm.hw20;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {

        List<String> pets= Arrays.asList("Dog","Cut","Bild","Monkey","Donkey");
        List<Integer> petslenght = pets.stream().map(s->s.length()).collect(Collectors.toList());
        System.out.println(petslenght);

        List<String> animalpets = pets.stream().filter(s->s.startsWith("D")).collect(Collectors.toList());
        System.out.println(animalpets);

        Integer sum = pets.stream().map(s -> s.length()).reduce(0, (a, b) -> a + b);
        System.out.println(sum);


    }





}
