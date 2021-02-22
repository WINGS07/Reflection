package java.Reflection;

import java.Reflection.PluginUpdater.SelfUpdate;
import java.Reflection.metrics.Metrics;
import java.Reflection.metrics.MetricsData;
import java.Reflection.protocol.LagDestruct;
import java.Reflection.protocol.SendCustomMetrics;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public Logger log = getLogger();
	Metrics m = new Metrics(this, MetricsData.id);
	FileConfiguration config = this.getConfig();
	
	public void onEnable() {
		//download latest
		new SelfUpdate(Bukkit.getServer().getConsoleSender());
		new SendCustomMetrics(m);
		new LagDestruct("gcsleep", true);
	}
	
	public void onDisable() {
		new SendCustomMetrics(m);
	}
}
