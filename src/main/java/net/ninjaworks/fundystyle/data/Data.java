package net.ninjaworks.fundystyle.data;

import org.bukkit.Location;
import org.bukkit.block.Block;

public class Data {

    public static boolean shouldFall(Block block) {
        Location underneath = block.getLocation().subtract(0, 1, 0);
        if(underneath.getBlock().isEmpty() == true) {
        return true;
    } else {
            return false;
        }
    }
}
