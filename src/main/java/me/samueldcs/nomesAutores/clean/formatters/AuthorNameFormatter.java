package me.samueldcs.nomesAutores.clean.formatters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AuthorNameFormatter {

    private final List<String> familyNames = Arrays.asList("neto", "neta", "filho", "filha", "sobrinho", "sobrinha", "junior");
    private ArrayList<String> names;

    private String surname = "";

    public AuthorNameFormatter(ArrayList<String> names) {
        this.names = names;
    }

    public String getFormattedName() {
        if(names.size() == 1) {
            return singularName();
        }
        return fullAuthorName();
    }

    private String fullAuthorName() {
        addFamilyNameIfPresent();
        surname = names.get(names.size() - 1).toUpperCase().concat(surname);
        removeLastElementFrom(names);
        return surname + ", " + String.join(" ", names);
    }

    private String singularName() {
        return names.get(0).toUpperCase();
    }

    private void addFamilyNameIfPresent() {
        if(hasFamilyName(names)) {
            surname = surname.concat(" " + names.get(names.size() - 1).toUpperCase());
            removeLastElementFrom(names);
        }
    }

    private boolean hasFamilyName(ArrayList<String> names) {
        return familyNames.contains(names.get(names.size() - 1).toLowerCase());
    }

    private void removeLastElementFrom(ArrayList list) {
        list.remove(list.size() - 1);
    }
}
