package com.digiunion.reader;

import java.io.IOException;
import java.util.Optional;

public interface IDictionaryReader {

 Optional<String> find(String term) throws IOException;

}
