package com.digiunion;

import static org.junit.Assert.assertEquals;

import com.digiunion.reader.DictionaryReader;

import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

/**
 * Unit test for simple App.
 */
public class ReaderTest {
    /**
     * Rigorous Test :-)
     * 
     * @throws ExecutionException
     * @throws InterruptedException
     */
    @Test
    public void readerTest() throws IOException, InterruptedException, ExecutionException {
        var reader = new DictionaryReader();
        assertEquals("escape physically.", reader.find("evade").get());
    }
}
