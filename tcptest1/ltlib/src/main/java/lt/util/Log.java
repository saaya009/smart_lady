package lt.util;

public class Log {

  private static boolean isDebug = true;

  public static void log(Object obj) {
    if (isDebug) {
      System.out.println(obj);
    }
  }
}
