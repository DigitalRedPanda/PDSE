package com.digiunion.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import lombok.Getter;

public abstract class Executor {

  private static final ExecutorService executor = Executors.newFixedThreadPool(
      Runtime.getRuntime().availableProcessors());

  public static void execute(Runnable task) {
    executor.execute(task);
  }
}
