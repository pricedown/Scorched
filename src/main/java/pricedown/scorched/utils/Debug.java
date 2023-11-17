package pricedown.scorched.utils;

import static pricedown.scorched.utils.Message.sendConsole;

public class Debug {

    public static String prefix = "&7[&bScorched&7] ";

    public static void log(String msg) { sendConsole(prefix + msg); }

    public static void log(String format, Object... objects) {
        log(String.format(format, objects));
    }
}
