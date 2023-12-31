package pricedown.scorched.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;

import static pricedown.scorched.utils.Worlds.isDay;

public class ExpEvents implements Listener {
    // Gives 1L + 30xp for successfully sleeping
    @EventHandler
    public void onBedLeave(PlayerBedLeaveEvent event) {
        Player player = event.getPlayer();
        if (isDay(player.getWorld())) {
            player.giveExpLevels(1);
            player.giveExp(30);
        }
    }



}
