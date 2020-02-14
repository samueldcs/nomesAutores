package me.samueldcs.nomesAutores.clean.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NameArrayUtils {

    private final List<String> articles = Arrays.asList("da", "do", "dos", "das", "de");
    private final ArrayList<String> names;

    public NameArrayUtils(String inputFullName) {
        this.names = separateNames(inputFullName);
    }

    public ArrayList<String> getNames() {
        return capitalizeNames();
    }

    private ArrayList<String> capitalizeNames() {
        for(int index = 0; index < names.size(); index++) {
            String nameAtPosition = names.get(index);
            if(!articles.contains(nameAtPosition)) {
                names.set(index, Character.toUpperCase(nameAtPosition.charAt(0)) + nameAtPosition.substring(1));
            }
        }
        return names;
    }

    private ArrayList<String> separateNames(String input) {
        String[] str = input.toLowerCase().split(" ");
        return new ArrayList<>(Arrays.asList(str));
    }
}
