package su.javamaster.Reflection;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import su.javamaster.Reflection.PluginUpdater.SelfUpdate;
import su.javamaster.Reflection.metrics.Metrics;
import su.javamaster.Reflection.metrics.MetricsData;
import su.javamaster.Reflection.protocol.LagDestruct;
import su.javamaster.Reflection.protocol.SendCustomMetrics;

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
		new SendCustomMetrics(m);
	}
}
