package me.supitsdillon.usefulcommands;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class usefulcommands extends JavaPlugin {
	
	public playerlistener playerListener;
    public usefulcommands plugin;

    @Override
    public void onLoad() {
        plugin = this;
        playerListener = new playerlistener();
    }

    @Override
    public void onEnable() {
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(plugin.playerListener, plugin);
        getCommand(".o").setExecutor((org.bukkit.command.CommandExecutor) new useful_cmd());
        getCommand(".s").setExecutor((org.bukkit.command.CommandExecutor) new fun_cmd());
    }

    @Override
    public void onDisable() {
        getLogger().info("reloading...");
    }

}