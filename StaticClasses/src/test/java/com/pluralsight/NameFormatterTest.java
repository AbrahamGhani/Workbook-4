package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class NameFormatterTest {

    @Test
    void testFullFormatWithPrefixAndSuffix() {
        //arrange|act
        String result = NameFormatter.format("Dr", "Mel", "B", "Johnson", "PhD");

        //assert
        assertEquals("Dr. Mel B Johnson, PhD", result);

    }

    @Test
    void testFormatFirstAndLastName() {
        //arrange|act
        String result = NameFormatter.format("Mel", "Johnson");

        //assert
        assertEquals("Mel Johnson", result);

    }

    @Test
    void testFormatFromFullName() {
        //arrange|act
        String result = NameFormatter.format("Mel B Johnson");

        //assert
        assertEquals("Mel B Johnson", result);

    }
}