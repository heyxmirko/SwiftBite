package me.lukyn76.swiftbite;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;

public class FishingListener implements Listener {

    private SwiftBite plugin;

    public FishingListener(SwiftBite plugin) {
        this.plugin = plugin;
    }

    public void onFish(PlayerFishEvent event) {
        if (event.getState() == PlayerFishEvent.State.FISHING) {
            int lureLevel = event.getPlayer().getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LURE);

            // Fetch configuration values
            int minWaitTime = plugin.getConfig().getInt("lure-levels.level" + lureLevel + ".min-wait-time", 100);
            int maxWaitTime = plugin.getConfig().getInt("lure-levels.level" + lureLevel + ".max-wait-time", 600);

            // Set the wait times
            event.getHook().setMinWaitTime(minWaitTime);
            event.getHook().setMaxWaitTime(maxWaitTime);
        }
    }
}
