package sl.util;

import java.io.PrintStream;

public class Log {

    public static void log(Object obj) {
        System.out.println(obj);
    }

    public static void lnLog() {
        System.out.println();
    }

    public static void nbLog(Object obj) {
        System.out.print(obj);
    }

    public static PrintStream
    logf(String format, Object... args) {
        return System.out.printf(format, args);
    }

}
