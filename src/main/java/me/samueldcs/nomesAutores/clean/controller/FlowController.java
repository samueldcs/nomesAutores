package me.samueldcs.nomesAutores.clean.controller;

import me.samueldcs.nomesAutores.clean.formatters.AuthorNameFormatter;
import me.samueldcs.nomesAutores.clean.utils.InputUtils;
import me.samueldcs.nomesAutores.clean.utils.NameArrayUtils;

import java.util.ArrayList;

import static me.samueldcs.nomesAutores.clean.utils.ValidatorUtils.inputMatchesExpectedNumberOfNames;
import static me.samueldcs.nomesAutores.clean.utils.ValidatorUtils.validateNumberOfNames;

public class FlowController {

    private String nameInput;
    private ArrayList<String> names;
    private Integer numberOfNames;

    public FlowController() {
        this.numberOfNames = validateNumberOfNames(InputUtils.readExpectedNumberOfNames());
        this.nameInput = InputUtils.readName();
        this.names = new NameArrayUtils(nameInput).getNames();
    }

    public String getFormattedAuthorName() {
        if (inputMatchesExpectedNumberOfNames(nameInput, numberOfNames)) {
            return new AuthorNameFormatter(names).getFormattedName();
        } else {
            throw new IllegalArgumentException("Número de nomes diferente do esperado!");
        }
    }


}
