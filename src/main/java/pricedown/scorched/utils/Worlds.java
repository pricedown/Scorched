package pricedown.scorched.utils;

import org.bukkit.World;

public class Worlds {
    public static boolean isDay(World world) {
        long time = world.getTime();
        return  (time >= 23459 || time < 12542);
    }
}
