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

public class commands_warp implements CommandExecutor, Listener {
    private final Inventory inventory;

    public commands_warp(){
        this.inventory = Bukkit.createInventory(null, 6*9, "§5Warp");
        this.inventory.setItem(32, getItem(Material.ENCHANTMENT_TABLE, 1, "Warp Enchentement","Te teleporte près :", "du forgeron et de l'enchanteur"));
        this.inventory.setItem(42, getItem(Material.DIAMOND_ORE, 1, "Warp minage", "Te teleporte près :", "du mineur pour accédé au monde minage"));
        this.inventory.setItem(21, getItem(Material.EMERALD, 1, "Warp marché", "Te teleporte près :", "du marché"));
        this.inventory.setItem(43, getItem(Material.GRASS, 1, "Warp île Event", "Te teleporte à l'île Event", "PvP desactivé"));
        this.inventory.setItem(0, getItemGlass(Material.STAINED_GLASS_PANE, 1, 15));
        this.inventory.setItem(1, getItemGlass(Material.STAINED_GLASS_PANE, 1, 15));
        this.inventory.setItem(10, getItemGlass(Material.STAINED_GLASS_PANE, 1, 15));
        this.inventory.setItem(11, getItemGlass(Material.STAINED_GLASS_PANE, 1, 15));
        this.inventory.setItem(12, getItemGlass(Material.STAINED_GLASS_PANE, 1, 10));
        this.inventory.setItem(13, getItemGlass(Material.STAINED_GLASS_PANE, 1, 10));
        this.inventory.setItem(20, getItemGlass(Material.STAINED_GLASS_PANE, 1, 10));
        this.inventory.setItem(22, getItemGlass(Material.STAINED_GLASS_PANE, 1, 10));
        this.inventory.setItem(23, getItemGlass(Material.STAINED_GLASS_PANE, 1, 10));
        this.inventory.setItem(24, getItemGlass(Material.STAINED_GLASS_PANE, 1, 10));
        this.inventory.setItem(30, getItemGlass(Material.STAINED_GLASS_PANE, 1, 10));
        this.inventory.setItem(31, getItemGlass(Material.STAINED_GLASS_PANE, 1, 10));
        this.inventory.setItem(33, getItemGlass(Material.STAINED_GLASS_PANE, 1, 10));
        this.inventory.setItem(34, getItemGlass(Material.STAINED_GLASS_PANE, 1, 10));
        this.inventory.setItem(41, getItemGlass(Material.STAINED_GLASS_PANE, 1, 10));
        this.inventory.setItem(40, getItemGlass(Material.STAINED_GLASS_PANE, 1, 10));
        this.inventory.setItem(39, getItemGlass(Material.STAINED_GLASS_PANE, 1, 10));
        this.inventory.setItem(38, getItemGlass(Material.STAINED_GLASS_PANE, 1, 10));
        this.inventory.setItem(45, getItemGlass(Material.STAINED_GLASS_PANE, 1, 10));
        this.inventory.setItem(46, getItemGlass(Material.STAINED_GLASS_PANE, 1, 10));
        this.inventory.setItem(47, getItemGlass(Material.STAINED_GLASS_PANE, 1, 10));
        this.inventory.setItem(48, getItemGlass(Material.STAINED_GLASS_PANE, 1, 10));
        this.inventory.setItem(49, getItemGlass(Material.STAINED_GLASS_PANE, 1, 10));
        this.inventory.setItem(50, getItemGlass(Material.STAINED_GLASS_PANE, 1, 2));
        this.inventory.setItem(51, getItemGlass(Material.STAINED_GLASS_PANE, 1, 2));

    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if (msg.equalsIgnoreCase("warp")) {

            final Player player = (Player) sender;

            player.openInventory(inventory);

        }
        return false;
    }

    public ItemStack getItem(Material material, int nombres,  String customName, String customList, String customList2) {
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

