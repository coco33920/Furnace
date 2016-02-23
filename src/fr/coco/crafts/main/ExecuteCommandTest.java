package fr.coco.crafts.main;

import fr.coco.crafts.Config;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import java.io.IOException;

/**
 * Created by coco33910 on 14/02/2016.
 * ExecuteCommandTest
 */
public class ExecuteCommandTest implements CommandExecutor {

    private static ExecuteCommandTest ourInstance = new ExecuteCommandTest();

    public static ExecuteCommandTest getInstance() {
        return ourInstance;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {


        ConsoleCommandSender bukkit = Bukkit.getConsoleSender();
        if (sender == bukkit
                ) {

        } else {
            bukkit.sendMessage("Erreur");
        }

        return false;
    }
}
