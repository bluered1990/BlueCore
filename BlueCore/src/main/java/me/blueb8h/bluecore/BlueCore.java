package me.blueb8h.bluecore;

import me.blueb8h.bluecore.economy.EconomyManager;
import me.blueb8h.bluecore.rank.RankManager;
import me.blueb8h.bluecore.tab.TabManager;
import me.blueb8h.bluecore.teleport.TeleportCommands;
import org.bukkit.plugin.java.JavaPlugin;

public class BlueCore extends JavaPlugin {

    private static BlueCore instance;

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();

        new EconomyManager(this);
        new RankManager(this);
        new TabManager(this);
        new TeleportCommands(this);

        getLogger().info("BlueCore enabled!");
    }

    public static BlueCore getInstance() {
        return instance;
    }
}