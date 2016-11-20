package fr.coco.crafts.utils.craftfurnace;


import org.apache.commons.lang.Validate;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
/*
 * Created by coco33910 on 13/02/2016.
 * craftfurnace
 */
public class CraftFurnace {

	private int craftId = -1;
	
    private Material result; //result
    private Material source;//source
    private Material input;
   

    
    public CraftFurnace(int id) {
    	craftId = id;
    	FileConfiguration fc = fr.coco.crafts.main.Crafts.getInstance().getConfiguration().getFileConfig(); 
    	
    	result = Material.getMaterial(fc.getInt("Crafts.furnace." + String.valueOf(craftId) + ".result"));
    	source = Material.getMaterial(fc.getInt("Crafts.furnace." + String.valueOf(craftId) + ".furnaceCombustible"));
    	input  = Material.getMaterial(fc.getInt("Crafts.furnace." + String.valueOf(craftId) + ".ingredient"));
	}
    
    public void makeCraft() {
    	//Check si c'est null
    	Validate.notNull(result);
    	Validate.notNull(source);
    	Validate.notNull(input);
    	
    	
        FurnaceRecipe recipe1 = new FurnaceRecipe(new ItemStack(result), source);
        recipe1.setInput(input);

        Bukkit.addRecipe(recipe1);
    }


}
