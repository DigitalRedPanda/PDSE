package com.digiunion.reader;

import java.io.IOException;
import java.util.Optional;

public sealed interface IDictionaryReader permits DictionaryReader {

 Optional<String> find(String term) throws IOException;

}
