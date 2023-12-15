package pricedown.scorched.listeners;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerSpawnChangeEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import pricedown.scorched.utils.Message;

import static org.bukkit.event.player.PlayerBedEnterEvent.BedEnterResult.OK;
import static pricedown.scorched.utils.Debug.log;
import static pricedown.scorched.utils.MaterialGroups.BEDS;
import static pricedown.scorched.utils.Worlds.isDay;

public class Beds implements Listener {

    @EventHandler
    public void onBedInteract(PlayerInteractEvent event) {
        if (event.getAction() != Action.RIGHT_CLICK_BLOCK)
            return;

        Block block = event.getClickedBlock();

        if (block == null || !BEDS.contains(block.getType()))
            return;
    }

    @EventHandler
    public void onSetSpawn(PlayerSpawnChangeEvent event) {
        if (event.getCause() != PlayerSpawnChangeEvent.Cause.BED)
            return;

        event.setCancelled(true);
        //Message.chat(event.getPlayer(), "Spawnpoints cannot be set by beds");
    }

    @EventHandler
    public void onBedEnter(PlayerBedEnterEvent event) {
        if (event.getBedEnterResult() != OK)
            return;

        Player player = event.getPlayer();

        // player's health is reduced when entering bed
        player.setHealthScale(0.1f);
        player.setHealthScaled(true);
    }

    @EventHandler
    public void onBedLeave(PlayerBedLeaveEvent event) {
        Player player = event.getPlayer();

        player.setHealthScaled(false);

        // *temp buff for successfully sleeping*
        if (isDay(player.getWorld())) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 200, 0));
        }
    }
}
