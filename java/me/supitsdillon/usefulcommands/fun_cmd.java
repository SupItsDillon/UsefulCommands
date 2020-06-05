package me.supitsdillon.usefulcommands;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.Bukkit;

public class fun_cmd implements CommandExecutor {

  public usefulcommands plugin;

  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
      if (cmd.getName().equalsIgnoreCase(".s")) {
    	  Bukkit.shutdown();
          }
      return true;
  }
}