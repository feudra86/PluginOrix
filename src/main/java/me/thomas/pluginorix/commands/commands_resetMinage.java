package me.thomas.pluginorix.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class commands_resetMinage implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if (msg.equalsIgnoreCase("resetminage")) {

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mrl reset minage");
            Bukkit.broadcastMessage("§5Le monde minage a été reset !");
        }

            return false;
    }
}
