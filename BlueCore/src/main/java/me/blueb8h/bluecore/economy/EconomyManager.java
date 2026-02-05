package me.blueb8h.bluecore.economy;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;

public class EconomyManager {

    private static final HashMap<UUID, Integer> balances = new HashMap<>();

    public EconomyManager(JavaPlugin plugin) {}

    public static int getBalance(Player player) {
        return balances.getOrDefault(player.getUniqueId(), 0);
    }

    public static void addMoney(Player player, int amount) {
        balances.put(player.getUniqueId(), getBalance(player) + amount);
    }
}