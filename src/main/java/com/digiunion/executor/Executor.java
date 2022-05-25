package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

import lombok.Getter;

public abstract class Executor {

  @Getter
  private static final ExecutorService executor = new ScheduledThreadPoolExecutor(
      Runtime.getRuntime().availableProcessors());

}
