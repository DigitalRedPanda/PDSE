package com.digiunion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.digiunion.reader.DictionaryReader;

import org.junit.Test;

import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class ReaderTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void isReaderWorking() throws IOException {
        var reader = new DictionaryReader();
        assertEquals("escape physically.", reader.find("evade").get());
    }
}
