package me.thomas.pluginorix.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;

public class GiveHammerCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
        if (msg.equalsIgnoreCase("hammer"))  {

            Player player = (Player) sender;

            if (args.length == 0) {

                ItemStack hammer = new ItemStack(Material.DIAMOND_PICKAXE);
                ItemMeta meta = hammer.getItemMeta();
                meta.setDisplayName(ChatColor.GOLD.toString() + ChatColor.BOLD + "Hammer D'Haykox");
                meta.setLore(Arrays.asList("Pioche Légendaire D'Haykox", "Mine en 3x3"));
                hammer.setItemMeta(meta);
                player.getInventory().addItem(hammer);
            }
            return true;
        }
        return false;
    }
}
