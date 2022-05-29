package com.digiunion;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

import com.digiunion.reader.DictionaryReader;

public class Run {
    // TODO The plan is to create a command-line application that serves as a search
    // engine for terms within my personal english dictionary along with support for
    // different commands
    public static void main(String[] args) {
        var future = CompletableFuture.runAsync(() -> {
            try (var input = new Scanner(System.in)) {
                System.out.print("Type a word that you want to find in the dictionary: ");
                var reader = new DictionaryReader();
                reader.find(input.next());
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        future.join();
    }
}
