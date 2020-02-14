package me.samueldcs.nomesAutores.clean.utils;

import java.util.Scanner;

public class InputUtils {

    private static Scanner scanner = new Scanner(System.in);

    public static String readExpectedNumberOfNames() {
        return showMessageForAnswer("Digite quantos nomes voce quer para seu autor:");
    }

    public static String readName() {
        return showMessageForAnswer("Digite o nome completo do autor");
    }

    private static String showMessageForAnswer(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
