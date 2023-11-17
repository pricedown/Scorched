package pricedown.scorched.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.spigotmc.event.player.PlayerSpawnLocationEvent;
import pricedown.scorched.utils.Debug;

public class Spawn implements Listener {
    @EventHandler
    public void onSpawn(PlayerSpawnLocationEvent event) {
        Player player = event.getPlayer();

        Debug.log(player.getDisplayName() + " spawned in");
    }
}
