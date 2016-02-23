package fr.coco.crafts.main;

import fr.coco.crafts.Config;
import fr.coco.crafts.utils.craftfurnace.*;
import fr.coco.crafts.utils.crafttable.CraftTable1;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

/**
 * Created by coco33910 on 13/02/2016.
 * Crafts
 */
public class Crafts extends JavaPlugin {

    private static Crafts instance;

    @Override
    public void onEnable() {
        instance = this;
        getCommand("test").setExecutor(new ExecuteCommandTest());
        Config config = new Config("Crafts");
        FileConfiguration fc = config.getFileConfig();
        if (fc.contains("author") && fc.contains("Utilisation")) {

        } else {
            fc.set("author", "coco33920");
            fc.set("Utilisation", "Vous pouvez mettre jusqu'a 10 crafts de type four si vous voulez qu'ils n'existent pas mettez 0");
            //Furnace
            fc.set("Crafts.furnace.1.furnaceCombustible", 173);
            fc.set("Crafts.furnace.1.ingredient", 100);
            fc.set("Crafts.furnace.1.result", 100);
            fc.set("Crafts.furnace.2.furnaceCombustible", 173);
            fc.set("Crafts.furnace.2.ingredient", 100);
            fc.set("Crafts.furnace.2.result", 100);
            fc.set("Crafts.furnace.3.furnaceCombustible", 173);
            fc.set("Crafts.furnace.3.ingredient", 100);
            fc.set("Crafts.furnace.3.result", 100);
            fc.set("Crafts.furnace.4.furnaceCombustible", 173);
            fc.set("Crafts.furnace.4.ingredient", 100);
            fc.set("Crafts.furnace.4.result", 100);
            fc.set("Crafts.furnace.5.furnaceCombustible", 173);
            fc.set("Crafts.furnace.5.ingredient", 100);
            fc.set("Crafts.furnace.5.result", 100);
            fc.set("Crafts.furnace.6.furnaceCombustible", 173);
            fc.set("Crafts.furnace.6.ingredient", 100);
            fc.set("Crafts.furnace.6.result", 100);
            fc.set("Crafts.furnace.7.furnaceCombustible", 173);
            fc.set("Crafts.furnace.7.ingredient", 100);
            fc.set("Crafts.furnace.7.result", 100);
            fc.set("Crafts.furnace.8.furnaceCombustible", 173);
            fc.set("Crafts.furnace.8.ingredient", 100);
            fc.set("Crafts.furnace.8.result", 100);
            fc.set("Crafts.furnace.9.furnaceCombustible", 173);
            fc.set("Crafts.furnace.9.ingredient", 100);
            fc.set("Crafts.furnace.9.result", 100);
            fc.set("Crafts.furnace.10.furnaceCombustible", 173);
            fc.set("Crafts.furnace.10.ingredient", 100);
            fc.set("Crafts.furnace.10.result", 100);


            //Crating Table
           /* fc.set("Craft.table.1.item1", 100);
            fc.set("Craft.table.1.item2", 100);
            fc.set("Craft.table.1.item3", 100);
            fc.set("Craft.table.1.item4", 100);
            fc.set("Craft.table.1.item5", 100);
            fc.set("Craft.table.1.item6", 100);
            fc.set("Craft.table.1.item7", 100);
            fc.set("Craft.table.1.item8", 100);
            fc.set("Craft.table.1.item9", 100);
            fc.set("Craft.table.1.result", 100);*/






            try {
                fc.save(config.getFile());
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        //craftfurnace.getInstance().setConfig();
        try {
            fc.save(config.getFile());
        } catch (IOException e) {
            e.printStackTrace();
        }


        CraftFurnace1.getInstance().makeCraft();
        CraftFurnace2.getInstance().makeCraft();
        CraftFurnace3.getInstance().makeCraft();
        CraftFurnace4.getInstance().makeCraft();
        CraftFurnace5.getInstance().makeCraft();
        CraftFurnace6.getInstance().makeCraft();
        CraftFurnace7.getInstance().makeCraft();
        CraftFurnace8.getInstance().makeCraft();
        CraftFurnace9.getInstance().makeCraft();
        CraftFurnace10.getInstance().makeCraft();


    }


    public static Crafts getInstance() {
        return instance;
    }


}
