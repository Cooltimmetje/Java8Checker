package me.Cooltimmetje.JavaEightChecker;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * This class has been created on 28-7-2015 at 14:33 by cooltimmetje.
 */
public class Main extends JavaPlugin {

    @Override
    public void onEnable(){
        getLogger().info("[J8C] Plugin enabled");
        Bukkit.broadcastMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Java8Checker" + ChatColor.DARK_GRAY + "]" + ChatColor.YELLOW + " Java 8 was found.");
        Bukkit.broadcastMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Java8Checker" + ChatColor.DARK_GRAY + "]" + ChatColor.YELLOW + "" + ChatColor.ITALIC + " Plugin disabling...");
        Bukkit.broadcastMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Java8Checker" + ChatColor.DARK_GRAY + "]" + ChatColor.YELLOW + "" + ChatColor.ITALIC + " Plugin by Cooltimmetje");
        this.getPluginLoader().disablePlugin(this);
    }

    @Override
    public void onDisable() {
        getLogger().info("[J8C] Plugin disabled");
    }

}
