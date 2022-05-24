package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public abstract class Executor {

 private static final ExecutorService executor = new ScheduledThreadPoolExecutor(
   Runtime.getRuntime().availableProcessors());

 public static ExecutorService getExecutor() {
  return executor;
 }

}
