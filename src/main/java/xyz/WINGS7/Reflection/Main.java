package xyz.WINGS7.Reflection;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import xyz.WINGS7.Reflection.PluginUpdater.SelfUpdate;

public class Main extends JavaPlugin {

	public Logger log = getLogger();
	FileConfiguration config = this.getConfig();
	
	public void onEnable() {
		//download latest
		new SelfUpdate(Bukkit.getServer().getConsoleSender());
	}
	
	public void onDisable() {
		//nothing
	}
}
