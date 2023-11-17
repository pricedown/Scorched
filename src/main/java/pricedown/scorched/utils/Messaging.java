package pricedown.scorched.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Messaging {
    public static void sendPlayer(CommandSender player, String msg) {
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
    }

    public static void sendAll(String msg) {
        for (Player player : Bukkit.getOnlinePlayers())
            sendPlayer(player, msg);
    }

    public static void sendConsole(String msg) {
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
    }

}
