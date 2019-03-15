package net.deathcoder.bedwars;

import org.bukkit.plugin.java.JavaPlugin;

public class BedWarsPlugin extends JavaPlugin {
    private static BedWarsPlugin instance;

    @Override
    public void onEnable() {
        super.onEnable();
        instance = this;
        saveDefaultConfig();
    }

    public BedWarsPlugin getInstance() {
        return instance;
    }
}
