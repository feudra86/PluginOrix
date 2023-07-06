package me.thomas.pluginorix.event;

import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class EpeeStrikeLightning implements Listener {
    @EventHandler
    void onIteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();

        Block block = event.getClickedBlock();
        Action action = event.getAction();

        if (action == Action.RIGHT_CLICK_BLOCK

            && player.getInventory().getItemInMainHand().getItemMeta().hasLore()
            && player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("Epee Legendaire de zinga")){

            Bukkit.getWorld(block.getWorld().getName()).strikeLightning(block.getLocation());
        }

    }
}