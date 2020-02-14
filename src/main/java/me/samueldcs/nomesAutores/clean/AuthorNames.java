package me.samueldcs.nomesAutores.clean;

import me.samueldcs.nomesAutores.clean.controller.FlowController;

public class AuthorNames {
    public static void main(String[] args) {
        System.out.println(new FlowController().getFormattedAuthorName());
    }
}
