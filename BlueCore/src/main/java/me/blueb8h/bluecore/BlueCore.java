package me.blueb8h.bluecore;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class BlueCore extends JavaPlugin {

    private Location spawn;

    @Override
    public void onEnable() {
        getLogger().info("BlueCore enabled!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("bluecore")) {
            sender.sendMessage("§bBlueCore §7is running!");
            return true;
        }

        if (command.getName().equalsIgnoreCase("spawn")) {
            if (!(sender instanceof Player player)) {
                sender.sendMessage("Only players can use this command.");
                return true;
            }
            if (spawn == null) {
                player.sendMessage("§cSpawn is not set.");
                return true;
            }
            player.teleport(spawn);
            player.sendMessage("§aTeleported to spawn!");
            return true;
        }

        if (command.getName().equalsIgnoreCase("setspawn")) {
            if (!(sender instanceof Player player)) {
                sender.sendMessage("Only players can use this command.");
                return true;
            }
            spawn = player.getLocation();
            player.sendMessage("§aSpawn set!");
            return true;
        }

        return false;
    }
}
