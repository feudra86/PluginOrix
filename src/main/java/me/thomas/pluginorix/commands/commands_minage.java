package me.thomas.pluginorix.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class commands_minage implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if (msg.equalsIgnoreCase("minage")) {
            Player player = (Player)sender;
            Location minage = new Location(Bukkit.getWorld("minijeu"), 1023.5, 47, 1023.5, 90, 0);
            player.teleport(minage);
            player.sendMessage("§5Vous avez été teleporté au monde minage");
        }

        return false;
    }

}

