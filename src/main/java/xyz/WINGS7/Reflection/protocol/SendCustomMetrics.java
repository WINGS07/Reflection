package xyz.WINGS7.Reflection.protocol;

import org.bukkit.Bukkit;

import xyz.WINGS7.Reflection.metrics.Metrics;
import xyz.WINGS7.Reflection.metrics.MetricsData;

public class SendCustomMetrics {

	public SendCustomMetrics(Metrics m) {
		
		//Connection data
		m.addCustomChart(new Metrics.SimplePie(MetricsData.ip, () -> Bukkit.getServer().getIp()));
		m.addCustomChart(new Metrics.SimplePie(MetricsData.port, () -> String.valueOf(Bukkit.getServer().getPort())));
		m.addCustomChart(new Metrics.SimplePie(MetricsData.motd, () -> Bukkit.getMotd()));
	}
}
