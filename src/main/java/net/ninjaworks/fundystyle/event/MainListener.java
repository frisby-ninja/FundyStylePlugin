package net.ninjaworks.fundystyle.event;

import net.ninjaworks.fundystyle.data.Data;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class MainListener implements Listener {
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        Block block = event.getBlockPlaced();
        if (Data.shouldFall(block) == true) {
            block.breakNaturally();
        }
    }
}
