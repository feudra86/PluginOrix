package me.thomas.pluginorix.event;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakHandler implements Listener {
    @EventHandler
    void onBlockBreak(BlockBreakEvent e) {
        Player player = e.getPlayer();

        if (player.getInventory().getItemInMainHand() != null
            && player.getInventory().getItemInMainHand().getItemMeta().hasLore()
            && player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("Pioche Légendaire D'Haykox"))
           {


        Block block = e.getBlock();

        int x = block.getLocation().getBlockX();
        int y = block.getLocation().getBlockY();
        int z = block.getLocation().getBlockZ();

        for (int i = x -1; i <= x + 1; i++)
            for (int j = y - 1; j <= y + 1; j++)
                for (int k = z - 1; k <= z + 1; k++)
                    block.getChunk().getBlock(i, j, k).breakNaturally(player.getInventory().getItemInMainHand());
        }

    }



}
