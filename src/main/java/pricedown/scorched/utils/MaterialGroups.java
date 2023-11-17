package pricedown.scorched.utils;

import com.google.common.collect.ImmutableSet;
import org.bukkit.Material;

public class MaterialGroups {
    public static final ImmutableSet<Material> BEDS;

    static {
        BEDS = ImmutableSet.<Material>builder()
                .add(Material.BLACK_BED)
                .add(Material.BLUE_BED)
                .add(Material.BROWN_BED)
                .add(Material.CYAN_BED)
                .add(Material.GRAY_BED)
                .add(Material.GREEN_BED)
                .add(Material.LIGHT_BLUE_BED)
                .add(Material.LIGHT_GRAY_BED)
                .add(Material.LIME_BED)
                .add(Material.MAGENTA_BED)
                .add(Material.ORANGE_BED)
                .add(Material.PINK_BED)
                .add(Material.PURPLE_BED)
                .add(Material.RED_BED)
                .add(Material.WHITE_BED)
                .add(Material.YELLOW_BED)
                .build();
    }
}
