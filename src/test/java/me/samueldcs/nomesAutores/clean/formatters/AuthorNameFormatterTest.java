package me.samueldcs.nomesAutores.clean.formatters;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class AuthorNameFormatterTest {

    @Test
    public void correctlyFormatsMultiPartName() {
        AuthorNameFormatter formater = new AuthorNameFormatter(new ArrayList<>(Arrays.asList("Antônio", "Castro")));
        String expected = "CASTRO, Antônio";
        assertEquals(expected, formater.getFormattedName());
    }

    @Test
    public void considersFamilyNameWhenFormatting() {
        AuthorNameFormatter formater = new AuthorNameFormatter(new ArrayList<>(Arrays.asList("João", "Silva", "Neto")));
        String expected = "SILVA NETO, João";
        assertEquals(expected, formater.getFormattedName());
    }

    @Test
    public void correctlyFormatsSingularName() {
        AuthorNameFormatter formater = new AuthorNameFormatter(new ArrayList<>(Arrays.asList("guimarães")));
        String expected = "GUIMARÃES";
        assertEquals(expected, formater.getFormattedName());
    }
}