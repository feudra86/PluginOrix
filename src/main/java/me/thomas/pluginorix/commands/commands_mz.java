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

public class commands_mz implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if(msg.equalsIgnoreCase("mz")) {

            Player player =(Player) sender;

            if(args.length == 0) {

                ItemStack item = new ItemStack(Material.IRON_BLOCK);
                ItemMeta meta = item.getItemMeta();
                meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Block D'Mz");
                meta.setLore(Arrays.asList("Block Légendaire D'Mz"));
                meta.addEnchant(Enchantment.DURABILITY, 1, true);
                item.setItemMeta(meta);

                player.getInventory().addItem(item);

            }


        }

        return false;
    }
}
