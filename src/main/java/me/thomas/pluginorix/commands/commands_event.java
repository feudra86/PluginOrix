package me.thomas.pluginorix.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class commands_event implements CommandExecutor, Listener {

    private final Inventory inventory;

    public commands_event(){
        this.inventory = Bukkit.createInventory(null, 5*9, "§5Event et Informations");
        this.inventory.setItem(8+9+6, getItem(Material.TOTEM, 1, "Information Totem", "Clic pour Plus d'info", "----------"));
        this.inventory.setItem(8+9+4, getItem(Material.STONE, 1, "Information KOTH", "Clic pour Plus d'info", "----------"));
        this.inventory.setItem(0, getItemGlass(Material.STAINED_GLASS_PANE, 1, 15));
        this.inventory.setItem(1, getItemGlass(Material.STAINED_GLASS_PANE, 1, 10));
        this.inventory.setItem(2, getItemGlass(Material.STAINED_GLASS_PANE, 1, 15));
        this.inventory.setItem(3, getItemGlass(Material.STAINED_GLASS_PANE, 1, 10));
        this.inventory.setItem(4, getItemGlass(Material.STAINED_GLASS_PANE, 1, 15));
        this.inventory.setItem(5, getItemGlass(Material.STAINED_GLASS_PANE, 1, 10));
        this.inventory.setItem(6, getItemGlass(Material.STAINED_GLASS_PANE, 1, 15));
        this.inventory.setItem(7, getItemGlass(Material.STAINED_GLASS_PANE, 1, 10));
        this.inventory.setItem(8, getItemGlass(Material.STAINED_GLASS_PANE, 1, 15));
        this.inventory.setItem(9, getItemGlass(Material.STAINED_GLASS_PANE, 1, 10));
        this.inventory.setItem(17, getItemGlass(Material.STAINED_GLASS_PANE, 1, 10));
        this.inventory.setItem(18, getItemGlass(Material.STAINED_GLASS_PANE, 1, 15));
        this.inventory.setItem(26, getItemGlass(Material.STAINED_GLASS_PANE, 1, 15));
        this.inventory.setItem(27, getItemGlass(Material.STAINED_GLASS_PANE, 1, 10));
        this.inventory.setItem(36, getItemGlass(Material.STAINED_GLASS_PANE, 1, 10));
        this.inventory.setItem(37, getItemGlass(Material.STAINED_GLASS_PANE, 1, 15));
        this.inventory.setItem(46, getItemGlass(Material.STAINED_GLASS_PANE, 1, 15));
    }


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if (msg.equalsIgnoreCase("event")) {

            final Player player = (Player) sender;

            player.openInventory(inventory);

        }
        return false;
    }
    public ItemStack getItem(Material material, int nombres, String customName, String customList, String customList2) {
        ItemStack it = new ItemStack(material, nombres);
        ItemMeta itMeta = it.getItemMeta();
        itMeta.setDisplayName(customName);
        itMeta.setLore(Arrays.asList(customList, customList2));
        it.setItemMeta(itMeta);

        return it;
    }

    public ItemStack getItemGlass(Material material, int nombres, int dura) {
        ItemStack it = new ItemStack(material, nombres, (short) dura);
        ItemMeta itMeta = it.getItemMeta();
        it.setItemMeta(itMeta);

        return it;
    }
}



