package pricedown.scorched.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import static pricedown.scorched.utils.Messaging.sendConsole;

public class Debugging {

    public static String prefix = "&7[&bScorched&7] ";

    public static void log(String msg) { sendConsole(prefix + msg); }

    public static void log(String format, Object... objects) {
        log(String.format(format, objects));
    }
}
