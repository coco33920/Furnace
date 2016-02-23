package fr.coco.crafts.utils.crafttable;

import fr.coco.crafts.Config;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

/**
 * Created by coco33910 on 14/02/2016.
 * CraftTable1
 */
public class CraftTable1 {

    Config config = new Config("Crafts");

    private static CraftTable1 ourInstance = new CraftTable1();

    public static CraftTable1 getInstance() {
        return ourInstance;
    }
    private int matint1 = config.getFileConfig().getInt("Craft.table.1.item1");
    private int matint2 = config.getFileConfig().getInt("Craft.table.1.item2");
    private int matint3 = config.getFileConfig().getInt("Craft.table.1.item3");
    private int matint4 = config.getFileConfig().getInt("Craft.table.1.item4");
    private int matint5 = config.getFileConfig().getInt("Craft.table.1.item5");
    private int matint6 = config.getFileConfig().getInt("Craft.table.1.item6");
    private int matint7 = config.getFileConfig().getInt("Craft.table.1.item7");
    private int matint8 = config.getFileConfig().getInt("Craft.table.1.item8");
    private int matint9 = config.getFileConfig().getInt("Craft.table.1.item9");
    private int result = config.getFileConfig().getInt("Craft.table.1.result");

    private Material mat1 = Material.getMaterial(matint1);
    private Material mat2 = Material.getMaterial(matint2);
    private Material mat3 = Material.getMaterial(matint3);
    private Material mat4 = Material.getMaterial(matint4);
    private Material mat5 = Material.getMaterial(matint5);
    private Material mat6 = Material.getMaterial(matint6);
    private Material mat7 = Material.getMaterial(matint7);
    private Material mat8 = Material.getMaterial(matint8);
    private Material mat9 = Material.getMaterial(matint9);
    private Material resultItem = Material.getMaterial(result);

    public void makeRecipe(){

        ShapedRecipe recipe = new ShapedRecipe(new ItemStack(resultItem));

        recipe.shape(

                new String[] {
            "123", "456", "789"


        });

        recipe.setIngredient('1', mat1);
        recipe.setIngredient('2', mat2);
        recipe.setIngredient('3', mat3);
        recipe.setIngredient('4', mat4);
        recipe.setIngredient('5', mat5);
        recipe.setIngredient('6', mat6);
        recipe.setIngredient('7', mat7);
        recipe.setIngredient('8', mat8);
        recipe.setIngredient('9', mat9);

        Bukkit.addRecipe(recipe);



    }






}
