package fr.coco.crafts.main;

import java.io.IOException;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import fr.coco.crafts.Config;
import fr.coco.crafts.utils.craftfurnace.CraftFurnace;

/**
 * Created by coco33910 on 13/02/2016.
 * Crafts
 */
public class Crafts extends JavaPlugin {

    private static Crafts instance;
    private Config config;
    
    public Config getConfiguration(){
    	return config;
    }
    
    public static Crafts getInstance() {
        return instance;
    }
    
    @Override
    public void onEnable() {
        instance = this;
        getCommand("test").setExecutor(new ExecuteCommandTest());
        config = new Config("Crafts");
        FileConfiguration fc = config.getFileConfig();
        if (!fc.contains("author") && !fc.contains("Utilisation")) {
        	fc.set("author", "coco33920");
            fc.set("Utilisation", "Vous pouvez mettre une infinite de crafts de type four (si vous voulez les desactive temporairement mettez -1)");

            //exemple
            fc.set("Crafts.furnace.1.furnaceCombustible", 173);
            fc.set("Crafts.furnace.1.ingredient", 100);
            fc.set("Crafts.furnace.1.result", 100);
            
            try {
                fc.save(config.getFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    public void loadCrafts(){
    	ConfigurationSection section = config.getFileConfig().getConfigurationSection("Crafts.furnace");
    	for(String i: section.getKeys(false)){
    		int id;
    		try{
    			id = Integer.parseInt(i);
    		}catch(Exception e){
    			continue;
    		}
    		new CraftFurnace(id).makeCraft();
    	}
    }


}
