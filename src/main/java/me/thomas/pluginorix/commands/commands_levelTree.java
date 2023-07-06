package me.thomas.pluginorix.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class commands_levelTree implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if(msg.equalsIgnoreCase("leveltree")) {

            Player player =(Player) sender;

            if(args.length == 0) {

                ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
                ItemMeta meta = item.getItemMeta();
                meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Epée en diamant un peux rare");
                meta.setLore(Arrays.asList("elle ne fait rien de spécial"));
                meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
                meta.addEnchant(Enchantment.DURABILITY, 3, true);
                meta.addEnchant(Enchantment.FIRE_ASPECT, 5, true);
                item.setItemMeta(meta);

                player.getInventory().addItem(item);

            }


        }
        return false;

    }
}
