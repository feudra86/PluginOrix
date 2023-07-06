package me.thomas.pluginorix.event;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakHandlerPierro implements Listener {
    @EventHandler
    void onBlockBreak(BlockBreakEvent e) {
        Player player = e.getPlayer();

        if (player.getInventory().getItemInMainHand() != null
            && player.getInventory().getItemInMainHand().getItemMeta().hasLore()
            && player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("Pioche Légendaire D'Elpierooo")) {

        Block block = e.getBlock();

        int x = block.getLocation().getBlockX();
        int y = block.getLocation().getBlockY();
        int z = block.getLocation().getBlockZ();

        for (int i = x -2; i <= x + 2; i++)
            for (int j = y - 2; j <= y + 2; j++)
                for (int k = z - 2; k <= z + 2; k++)
                    block.getChunk().getBlock(i, j, k).breakNaturally(player.getInventory().getItemInMainHand());
        }

    }



}
