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

public class Commands_zinga implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if(msg.equalsIgnoreCase("zinga")) {

            Player player =(Player) sender;

            if(args.length == 0) {

                ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
                ItemMeta meta = item.getItemMeta();
                meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Epée de Zinga");
                meta.setLore(Arrays.asList("Epee Legendaire de zinga"));
                meta.addEnchant(Enchantment.DAMAGE_ALL, 6, true);
                item.setItemMeta(meta);

                player.getInventory().addItem(item);

            }


        }
        return false;

    }
}