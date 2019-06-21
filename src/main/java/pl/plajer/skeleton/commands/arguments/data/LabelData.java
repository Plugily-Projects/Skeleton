package pl.plajer.skeleton.commands.arguments.data;

import org.bukkit.ChatColor;

/**
 * @author Plajer
 * <p>
 * Created at 21.06.2019
 */
public class LabelData {

  private String text;
  private String command;
  private String description;

  public LabelData(String text, String command, String description) {
    this.text = ChatColor.translateAlternateColorCodes('&', text);
    this.command = command;
    this.description = ChatColor.translateAlternateColorCodes('&', description);
  }

  public String getText() {
    return text;
  }

  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
