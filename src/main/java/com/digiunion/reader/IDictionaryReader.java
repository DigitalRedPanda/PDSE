package com.digiunion.reader;

import java.io.File;
import java.io.IOException;
import java.util.function.Function;

public interface IDictionaryReader {

 void find(String term) throws IOException;

}
