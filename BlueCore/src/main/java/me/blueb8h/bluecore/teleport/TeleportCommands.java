package me.blueb8h.bluecore.teleport;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class TeleportCommands implements CommandExecutor {

    private Location spawn;

    public TeleportCommands(JavaPlugin plugin) {
        plugin.getCommand("setspawn").setExecutor(this);
        plugin.getCommand("spawn").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player p)) return true;

        if (cmd.getName().equalsIgnoreCase("setspawn")) {
            spawn = p.getLocation();
            p.sendMessage("§aSpawn set!");
        }

        if (cmd.getName().equalsIgnoreCase("spawn") && spawn != null) {
            p.teleport(spawn);
        }
        return true;
    }
}