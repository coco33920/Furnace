package fr.coco.crafts;

import fr.coco.crafts.main.Crafts;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

/**
 * Created by coco33910 on 13/02/2016.
 * Config
 */
public class Config {

    private String nameFile;
    private File file;
    private FileConfiguration fileConfig;


    public Config(String nameFile) {
        this.nameFile = nameFile;


        file = new File(Crafts.getInstance().getDataFolder(), nameFile + ".yml");


        if (!file.exists()) {

            try {
                file.createNewFile();


            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
        fileConfig = YamlConfiguration.loadConfiguration(file);

    }

    public File getFile() {
        return file;
    }

    public String getNameFile() {
        return nameFile;
    }

    public FileConfiguration getFileConfig() {
        return fileConfig;
    }


}