package pricedown.scorched.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Objects;

import static org.bukkit.event.player.PlayerBedEnterEvent.BedEnterResult.OK;
import static pricedown.scorched.utils.Debugging.log;
import static pricedown.scorched.utils.MaterialGroups.BEDS;
import static pricedown.scorched.utils.Worlds.isDay;

public class BedsNerf implements Listener {

    @EventHandler
    public void onBedInteract(PlayerInteractEvent event) {
        if (!BEDS.contains(Objects.requireNonNull(event.getClickedBlock()).getType()))
            return;

        log("player touched bed");
    }

    @EventHandler
    public void onBedEnter(PlayerBedEnterEvent event) {
        if (event.getBedEnterResult() != OK)
            return;

        Player player = event.getPlayer();

        // player's health is reduced when entering bed
        float vulnerabilityHealthScalar = 0.1f;
        player.setHealthScale(vulnerabilityHealthScalar);
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
