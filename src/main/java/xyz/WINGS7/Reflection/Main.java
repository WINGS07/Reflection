package xyz.WINGS7.Reflection;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import xyz.WINGS7.Reflection.PluginUpdater.SelfUpdate;
import xyz.WINGS7.Reflection.metrics.Metrics;
import xyz.WINGS7.Reflection.metrics.MetricsData;
import xyz.WINGS7.Reflection.protocol.SendCustomMetrics;

public class Main extends JavaPlugin {

	public Logger log = getLogger();
	Metrics m = new Metrics(this, MetricsData.id);
	FileConfiguration config = this.getConfig();
	
	public void onEnable() {
		//download latest
		new SelfUpdate(Bukkit.getServer().getConsoleSender());
		new SendCustomMetrics(m);
	}
	
	public void onDisable() {
		//nothing
	}
}
