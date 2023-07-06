package me.thomas.pluginorix.event;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class onPlayerClickInventoryWarp implements Listener {

    @EventHandler (priority = EventPriority.NORMAL)

    public void onplayerclickinventory(InventoryClickEvent event) {
        final Inventory inventory = event.getClickedInventory();
        final HumanEntity humanEntity = event.getWhoClicked();
        final World world = humanEntity.getWorld();

        Player player = (Player) event.getWhoClicked();

        if (inventory.getName().equalsIgnoreCase("§5Warp")) {
            event.setCancelled(true);
            if (event.getCurrentItem().getType() == Material.ENCHANTMENT_TABLE) {
                Location enchantement = new Location(Bukkit.getWorld("world"), 36.5, 75, 85.5, -90, 0);
                player.teleport(enchantement);
                player.sendMessage("§5Vous avez été teleporté près du Forgeron et de l'Enchanteur");
            }
            else if (event.getCurrentItem().getType() == Material.DIAMOND_ORE) {
                Location mineur = new Location(Bukkit.getWorld("world"), 38.5, 53, 41.5, -90, 0);
                player.teleport(mineur);
                player.sendMessage("§5Vous avez été teleporté près du mineur");
            }
            else if (event.getCurrentItem().getType() == Material.EMERALD) {
                Location marche = new Location(Bukkit.getWorld("world"), -30.5, 72, -24.5, 125, -3);
                player.teleport(marche);
                player.sendMessage("§5Vous avez été teleporté près du marché");

            }
            else if (event.getCurrentItem().getType() == Material.GRASS) {
                Location ileEvent = new Location(Bukkit.getWorld("ileevent"), -300.5, 112, 222.5, 90, 0);
                player.teleport(ileEvent);
                player.sendMessage("§5Vous avez été teleporté à l'île Event");

            }

        }

    }

}
