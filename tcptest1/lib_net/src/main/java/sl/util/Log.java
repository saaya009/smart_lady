package sl.util;

import java.io.PrintStream;

public class Log {

  public static void log(Object obj) {
    System.out.println(obj);
  }

  public static void log() {
    System.out.println("sl");
  }

  public static void Log(Object obj) {
    System.out.print(obj);
  }

  public static PrintStream
  log(String format, Object... args) {
    return System.out.printf(format, args);
  }
}
