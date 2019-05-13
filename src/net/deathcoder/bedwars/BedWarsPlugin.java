package net.deathcoder.bedwars;

import org.bukkit.plugin.java.JavaPlugin;

public class BedWarsPlugin extends JavaPlugin {
    public static BedWarsPlugin instance;

    @Override
    public void onEnable() {
        BedWarsPlugin.instance = this;
        saveDefaultConfig();
    }

    public BedWarsPlugin getInstance() {
        return BedWarsPlugin.instance;
    }
}
