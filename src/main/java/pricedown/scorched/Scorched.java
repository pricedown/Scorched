package pricedown.scorched;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import pricedown.scorched.listeners.Beds;
import pricedown.scorched.listeners.ExpEvents;
import pricedown.scorched.listeners.Spawn;
import pricedown.scorched.utils.Debug;

public final class Scorched extends JavaPlugin {

    private static final PluginManager manager = Bukkit.getPluginManager();

    @Override
    public void onEnable() {
        Debug.log("enabled!");
        registerEvents();
    }

    @Override
    public void onDisable() {
        Debug.log("disabled!");
    }

    private void registerEvents() {
        // TODO: maybe use set
        manager.registerEvents(new Beds(), this);
        manager.registerEvents(new ExpEvents(), this);
        manager.registerEvents(new Spawn(), this);
    }
}
