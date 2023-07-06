package me.thomas.pluginorix.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class commands_minagetp implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if(msg.equalsIgnoreCase("minagetp")) {

            Player player = (Player)sender;
            if (player.getWorld().getName().equalsIgnoreCase("minijeu")){
                Location minage = new Location(Bukkit.getWorld("minijeu"), 1011.5, 67, 1024.5, 90, 0);
                player.teleport(minage);
                player.sendMessage("§5Vous avez été teleporté au monde minage");

            }

        }

        return false;
    }

}