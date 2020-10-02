package org.utils.stringutils;

import org.junit.jupiter.api.Test;
import org.utils.exceptions.InvalidStringInputException;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringParserTest {
    // Three part name for test

    @Test
    void splitString_oneSeparator_returnsTwoStrings() throws InvalidStringInputException {
        StringParser sp = new StringParser();
        String inputString = "Hello@World";

        //object.function (sp is an object under class StringParser)
        // run the function and collect the split string in List<String> stringParts
        List<String> stringParts = sp.splitString(inputString, "@");

        //assertEquals check if there are 2 values in stringParts
        assertEquals(stringParts.size(), 2); // this conducts the test
    }


    @Test
    void splitString_nullInput_expectException() throws InvalidStringInputException {
        StringParser sp = new StringParser();
        String inputString = null;
        //assertThrows is JUnit
        assertThrows(InvalidStringInputException.class, () ->
        {
            sp.splitString(inputString, "@");
        });
    }
}