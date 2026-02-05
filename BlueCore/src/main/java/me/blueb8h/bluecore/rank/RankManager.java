package me.blueb8h.bluecore.rank;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;

public class RankManager {

    private static final HashMap<UUID, String> ranks = new HashMap<>();

    public RankManager(JavaPlugin plugin) {}

    public static String getRank(Player player) {
        return ranks.getOrDefault(player.getUniqueId(), ChatColor.GRAY + "Player");
    }

    public static void setRank(Player player, String rank) {
        ranks.put(player.getUniqueId(), rank);
    }
}