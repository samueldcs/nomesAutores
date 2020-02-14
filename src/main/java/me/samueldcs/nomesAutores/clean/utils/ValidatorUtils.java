package me.samueldcs.nomesAutores.clean.utils;

public class ValidatorUtils {
    public static Boolean inputMatchesExpectedNumberOfNames(String name, Integer expectedNumberOfNames) {
        return name.trim().split("\\s+").length >= expectedNumberOfNames;
    }

    public static Integer validateNumberOfNames(String input) {
        try {
            int numberOfNames = Integer.parseInt(input);
            if(numberOfNames < 1) {
                throw new IllegalArgumentException("O número deve ser maior do que zero!");
            }
            return numberOfNames;
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("Você deve digitar um número.");
        }
    }
}
