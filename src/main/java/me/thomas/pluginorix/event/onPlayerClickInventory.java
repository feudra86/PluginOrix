package me.thomas.pluginorix.event;

import org.bukkit.Bukkit;
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

public class onPlayerClickInventory implements Listener {
    @EventHandler (priority = EventPriority.NORMAL)

    public void onplayerclickinventory(InventoryClickEvent event) {
        final Inventory inventory = event.getClickedInventory();
        final HumanEntity humanEntity = event.getWhoClicked();
        final World world = humanEntity.getWorld();
        Player player = (Player) event.getWhoClicked();

        if (inventory.getName().equalsIgnoreCase("§5Passe de Combat")) {
            event.setCancelled(true);

            if (event.getSlot() == 0) {
                player.closeInventory();
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "eco take " + player.getName() + " 30000");
                player.getInventory().addItem(new ItemStack(Material.DIAMOND_BLOCK, 32));

                if (event.getSlot() == 1) {
                    player.closeInventory();
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " diamondsword 1");

                }
            }

        }
    }
}
