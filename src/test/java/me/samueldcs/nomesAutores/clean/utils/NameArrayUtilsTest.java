package me.samueldcs.nomesAutores.clean.utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class NameArrayUtilsTest {

    @Test
    public void capitalizesFIrstLetterOfEachName() {
        NameArrayUtils nameArrayUtils = new NameArrayUtils("SAMUEL simão");
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Samuel", "Simão"));
        assertEquals(expected, nameArrayUtils.getNames());
    }

    @Test
    public void skipsCapitalizingArticles() {
        NameArrayUtils nameArrayUtils = new NameArrayUtils("SAMUEL DE cASTrO simão");
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Samuel", "de", "Castro", "Simão"));
        assertEquals(expected, nameArrayUtils.getNames());
    }

}