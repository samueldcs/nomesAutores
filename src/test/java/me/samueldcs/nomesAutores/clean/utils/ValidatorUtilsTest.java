package me.samueldcs.nomesAutores.clean.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorUtilsTest {

    @Test(expected = IllegalArgumentException.class)
    public void throwsExceptionIfInputCantBeCastToNumber() {
        ValidatorUtils.validateNumberOfNames("ks");
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwsExceptionIfInputLessThanOne() {
        ValidatorUtils.validateNumberOfNames("-2");
    }

    @Test
    public void correctlyDeterminesIfNumberOfNamesMatchesInput() {
        assertTrue(ValidatorUtils.inputMatchesExpectedNumberOfNames("Samuel Simão", 2));
        assertFalse(ValidatorUtils.inputMatchesExpectedNumberOfNames("Antônio Castro", 26));
    }
}