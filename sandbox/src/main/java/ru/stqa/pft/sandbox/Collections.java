package ru.stqa.pft.sandbox;

import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 21.03.2016.
 */
public class Collections {
    public static void main(String[] args) {
        String[] langs = {"Java", "C#", "Python", "PHP"};

        List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP");

        List languages1 = Arrays.asList("Java", "C#", "Python", "PHP");

        for(Object l: languages1){
            System.out.println("Я хочу выучить "+ l);
        }

        for(String l: langs){
            System.out.println("Я хочу выучить "+ l);
        }

        for(String l: languages){
            System.out.println("Я хочу выучить "+ l);
        }
        for(int i = 0; i > languages.size(); i++){
            System.out.println("Я хочу выучить "+ languages.get(i));
        }
    }
}
