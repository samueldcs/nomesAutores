package me.samueldcs.nomesAutores.dirty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        format();
    }
    private static void format() {
        Scanner in = new Scanner(System.in);
        System.out.println("DIGITE QUANTOS NOMES VAI QUERER");
        String inteiro = in.nextLine(); // inteiro em string
        int inteiro2 = 0; // inteiro em inteiro

        /* usuário colocou letras */
        try {
            inteiro2 = Integer.parseInt(inteiro); // valor no inteiro
        } catch (NumberFormatException e) {
            System.out.println("não");
        }

        if(inteiro2 < 1) throw new IllegalArgumentException();

        System.out.println("DIGITE O NOME");
        String nome = in.nextLine(); // nome
        if (nome.trim().isEmpty() || nome.trim().split("\\s+").length < inteiro2)
            throw new IllegalArgumentException();

        String[] str = nome.split(" ");
        ArrayList<String> al = new ArrayList<>(Arrays.asList(str));

        ArrayList<String> cap = new ArrayList<>(al);
        for(int i = 0; i<cap.size(); i++) {
            String st = cap.get(i).toLowerCase();
            if(!(st.equalsIgnoreCase("da") || st.equalsIgnoreCase("do") || st.equalsIgnoreCase("de") || st.equalsIgnoreCase("dos") || st.equalsIgnoreCase("das"))) {
                cap.set(i,Character.toUpperCase(st.charAt(0)) + st.substring(1));
            }
        }

        if (cap.size() < inteiro2)
            throw new IllegalArgumentException();
        if (cap.size() == 1)
            System.out.println(nome.toUpperCase());
        if (cap.size() > 1)
            if (cap.get(cap.size() - 1).equalsIgnoreCase("FILHO") || cap.get(cap.size() - 1).equalsIgnoreCase("FILHA") || cap.get(cap.size() - 1).equalsIgnoreCase("NETO") || cap.get(cap.size() - 1).equalsIgnoreCase("NETA") || cap.get(cap.size() - 1).equalsIgnoreCase("SOBRINHA") || cap.get(cap.size() - 1).equalsIgnoreCase("SOBRINHO") || cap.get(cap.size() - 1).equalsIgnoreCase("JUNIOR")) {
                String nf = cap.get(cap.size() - 1).toUpperCase(); // nome familia (filho neto etc)
                String sn = cap.get(cap.size() - 2).toUpperCase(); //sobrenome
                cap.remove(cap.size()-1);
                cap.remove(cap.size()-1);
                System.out.println(sn + " " + nf + ", " + String.join(" ", cap));
            } else {
                String sn = cap.get(cap.size() - 1).toUpperCase(); // sobrneome
                cap.remove(cap.size() - 1);
                System.out.println(sn + ", " + String.join(" ", cap));
            }
    }
}
