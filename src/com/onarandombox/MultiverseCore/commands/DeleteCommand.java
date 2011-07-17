package com.onarandombox.MultiverseCore.commands;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.onarandombox.MultiverseCore.MultiverseCore;

public class DeleteCommand extends MultiverseCommand {

    public DeleteCommand(MultiverseCore plugin) {
        super(plugin);
        this.commandName = "Delete World";
        this.commandDesc = "Deletes a world on your server. " + ChatColor.RED + "PERMANENTLY.";
        this.commandUsage = "/mvdelete" + ChatColor.GREEN + " {WORLD} ";
        this.minimumArgLength = 1;
        this.maximumArgLength = 1;
        this.commandKeys.add("mvdelete");
        this.commandKeys.add("mv delete");
        this.permission = "multiverse.world.delete";
        this.opRequired = true;
    }

    @Override
    public void runCommand(CommandSender sender, List<String> args) {
        Class<?> paramTypes[] = { String.class };
        this.plugin.getCommandHandler().queueCommand(sender, "mvdelete", "deleteWorld", args, paramTypes, "World Deleted!", "World was not deleted!");
    }
}