package me.thomas.pluginorix.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;

public class Commands_discord implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player)sender;
            String[] liensDiscord= {"https://discord.gg/PQY9DwS7xe"};
            player.sendMessage("§5Voici le liens vers notre discord :§f " + Arrays.toString(liensDiscord));
        }

        return false;
    }

}