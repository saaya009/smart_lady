package sl.util;

import java.io.PrintStream;
import java.nio.charset.Charset;

public class Log {

  public static void log(Object obj) {
    System.out.println(obj);
  }

  public static void notice(String str) {
    String x = new String(str.getBytes(Charset.forName("GBK")));
    System.err.println(x);
  }

  public static void log() {
    System.out.println("sl");
  }

  public static PrintStream
  log(String format, Object... args) {
    return System.out.printf(format, args);
  }
}
