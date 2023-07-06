package me.thomas.pluginorix.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class GiveHammerCommandPierro implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
        if (msg.equalsIgnoreCase("hammerp"))  {

            Player player = (Player) sender;

            if (args.length == 0) {

                ItemStack hammer = new ItemStack(Material.DIAMOND_PICKAXE, 1, (short) 1500);
                ItemMeta meta = hammer.getItemMeta();
                meta.setDisplayName(ChatColor.GOLD.toString() + ChatColor.BOLD + "Hammer D'Elpierooo");
                meta.setLore(Arrays.asList("Pioche Légendaire D'Elpierooo", "Mine en 5x5"));
                hammer.setItemMeta(meta);
                player.getInventory().addItem(hammer);
            }
            return true;
        }
        return false;
    }
}
