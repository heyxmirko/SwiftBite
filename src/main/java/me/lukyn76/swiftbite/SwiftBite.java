package me.lukyn76.swiftbite;

import org.bukkit.plugin.java.JavaPlugin;

public final class SwiftBite extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        getLogger().info("Plugin has been loaded!");
        getServer().getPluginManager().registerEvents(new FishingListener(this), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin has been unloaded!");
    }
}
