package pricedown.scorched.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Message {
    public static void chat(CommandSender player, String msg) {
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
    }

    public static void subtitle(CommandSender player, String title, String subtitle) { }

    public static void sendAll(String msg) {
        for (Player player : Bukkit.getOnlinePlayers())
            chat(player, msg);
    }

    public static void sendConsole(String msg) {
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
    }

}
