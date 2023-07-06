package me.thomas.pluginorix.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class commandsWarp implements CommandExecutor {

    private final Inventory inventory;

    public commandsWarp(){
        this.inventory = Bukkit.createInventory(null, 6*9, "§5Warp");
        this.inventory.setItem(0, getItem(Material.DIAMOND_BLOCK, 32, "Niveau 1", "Récompense de niveau:", " 32 block de diamants"));
        this.inventory.setItem(1, getItem(Material.EMERALD_BLOCK, 4, "Niveau 2", "Récompense de niveau:", "4 Block d'Orix"));
        this.inventory.setItem(2, getItem(Material.DIAMOND_SWORD, 1, "Niveau 3", "Récompense de niveau:", "Epée en diamant"));
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if (msg.equalsIgnoreCase("warp")) {

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

}
