package me.thomas.pluginorix.commands;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Commands_dondenne implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if(msg.equalsIgnoreCase("dondenne")); {

            Player player =(Player) sender;

            if(args.length == 0) {

                ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
                ItemMeta meta = item.getItemMeta();
                meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Epée de Farm Dondenne");
                meta.setLore(Arrays.asList("Epée Farm de L'excellence"));
                meta.addEnchant(Enchantment.DURABILITY, 5, true);
                meta.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
                meta.addEnchant(Enchantment.DEPTH_STRIDER, 6, true);
                meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 6, true);
                meta.addEnchant(Enchantment.MENDING, 1, true);
                item.setItemMeta(meta);

                player.getInventory().addItem(item);

            }


        }

        return false;
    }

}
