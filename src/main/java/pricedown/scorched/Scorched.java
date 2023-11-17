package pricedown.scorched;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import pricedown.scorched.listeners.BedsNerf;
import pricedown.scorched.utils.Debugging;

import java.util.Set;

public final class Scorched extends JavaPlugin {

    private static final PluginManager manager = Bukkit.getPluginManager();

    @Override
    public void onEnable() {
        Debugging.log("enabled!");
        registerEvents();
    }

    @Override
    public void onDisable() {
        Debugging.log("disabled!");
    }

    private void registerEvents() {
        // TODO: maybe use set
        manager.registerEvents(new BedsNerf(), this);
    }
}
