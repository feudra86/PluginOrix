package me.thomas.pluginorix.event;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;


public class Evenements implements Listener {

    @EventHandler
    public void onIteract(PlayerInteractEvent event) {

        ItemStack item = event.getItem();
        Block block = event.getClickedBlock();
        Action action = event.getAction();

        if(action == Action.RIGHT_CLICK_BLOCK && (item.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Epée de Zinga"))) {

            //if(item.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Epée de Zinga")) ;{
            Bukkit.getWorld(block.getWorld().getName()).strikeLightning(block.getLocation());
            //}



            }
        }

    }

