package fr.coco.crafts.utils.craftfurnace;


import fr.coco.crafts.Config;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;

/**
 * Created by coco33910 on 13/02/2016.
 * craftfurnace
 */
public class CraftFurnace2 {

    private static CraftFurnace2 ourInstance = new CraftFurnace2();
    private Config config = new Config("Crafts");
    private FileConfiguration fc = config.getFileConfig();

    public static CraftFurnace2 getInstance() {
        return ourInstance;
    }

    private int matint = fc.getInt("Crafts.furnace.2.result");
    private Material mat;

    {
        mat = Material.getMaterial(matint);
    }

    private int mat2int = fc.getInt("Crafts.furnace.2.furnaceCombustible");
    private Material mat2;

    {
        mat2 = Material.getMaterial(mat2int);
    }

    private int mat3int = fc.getInt("Crafts.furnace.2.ingredient");
    private Material mat3;

    {
        mat3 = Material.getMaterial(mat3int);
    }


    public void makeCraft() {


        FurnaceRecipe recipe1 = new FurnaceRecipe(new ItemStack(mat), mat2);
        recipe1.setInput(mat3);

        Bukkit.addRecipe(recipe1);


    }


}
