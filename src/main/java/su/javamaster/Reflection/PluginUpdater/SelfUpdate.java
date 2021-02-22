package su.javamaster.Reflection.PluginUpdater;

import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import su.javamaster.Reflection.storage.SSS;
import su.javamaster.Reflection.storage.UpdateData;

public class SelfUpdate {

	
	public Boolean updateInProgress = false;
	Plugin pl = Bukkit.getPluginManager().getPlugin(SSS.pl);
	FileConfiguration config = pl.getConfig();
	
    public SelfUpdate(CommandSender s) {
        if(updateInProgress) {
            //s.sendMessage(ChatColor.RED + "Update already in progress");
            return;
        }
        
        //s.sendMessage(SS.prefix + ChatColor.RED + "Self-Updating " + SelfUpdateData.PluginName + "...");
        
        updateInProgress = true;

        try {
        	Method getFile = JavaPlugin.class.getDeclaredMethod("getFile");
            getFile.setAccessible(true);
            File dest = new File("plugins/" + SSS.pl + UpdateData.ext);

            //Connect
            URL url =
            new URL(UpdateData.server);
            
            // Creating con
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestProperty("User-Agent", "WINGS07/Reflection.spigot");

            // Get input stream
            try (InputStream input = con.getInputStream()) {
            	Files.copy(input, dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
              	}

            /*
            int suc = config.getInt("SelfUpdateCounter");
            suc++;
            config.set("SelfUpdateCounter", suc);
            pl.saveConfig();
            */
            
            //s.sendMessage(SS.prefix + ChatColor.RED + "Update success!");
        } catch (Exception ex) {
        	//ex.printStackTrace();
            //s.sendMessage(SS.prefix + ChatColor.RED + "Update failed, " + ex.getMessage());
        } finally {
        	updateInProgress = false;
        }
    }
}
