package me.blueb8h.bluecore.tab;

import me.blueb8h.bluecore.rank.RankManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class TabManager {

    public TabManager(JavaPlugin plugin) {
        Bukkit.getScheduler().runTaskTimer(plugin, () -> {
            for (Player player : Bukkit.getOnlinePlayers()) {
                player.setPlayerListHeaderFooter(
                        ChatColor.AQUA + "✦ BlueCore Server ✦\n" +
                        ChatColor.YELLOW + "Online: " + Bukkit.getOnlinePlayers().size(),
                        ChatColor.LIGHT_PURPLE + "Rank: " + RankManager.getRank(player)
                );
            }
        }, 0L, 40L);
    }
}