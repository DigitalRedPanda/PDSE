package com.digiunion;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import com.digiunion.reader.DictionaryReader;

public class Run {
    // TODO The plan is to create a command-line application that serves as a search
    // engine for terms within my personal english dictionary along with support for
    // different commands
    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
        System.out.print("Insert a word to search for: ");
        var reader = new DictionaryReader();
        var input = new Scanner(System.in);
        var term = input.next();
        System.out.printf("%s means %s", term, reader.find(term).get());
    }
}
