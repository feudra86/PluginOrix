package me.thomas.pluginorix.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands_site implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player)sender;
            String[] liensSite = {"discord.gg/"};
            player.sendMessage("§5Voici le liens vers notre site :§f desolée il n'y a pas encore de liens vers le site :)");
        }

        return false;
    }

}