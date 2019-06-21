package pl.plajer.skeleton.commands.arguments.data;

import java.util.Collections;
import java.util.List;

import org.bukkit.command.CommandSender;

/**
 * @author Plajer
 * <p>
 * Created at 21.06.2019
 */
public class CommandArgument {

  private String argumentName;
  private List<String> permissions;
  private ExecutorType validExecutors;

  public CommandArgument(String argumentName, String permissions, ExecutorType validExecutors) {
    this.argumentName = argumentName;
    this.permissions = Collections.singletonList(permissions);
    this.validExecutors = validExecutors;
  }

  public CommandArgument(String argumentName, List<String> permissions, ExecutorType validExecutors) {
    this.argumentName = argumentName;
    this.permissions = permissions;
    this.validExecutors = validExecutors;
  }

  public String getArgumentName() {
    return argumentName;
  }

  public List<String> getPermissions() {
    return permissions;
  }

  public ExecutorType getValidExecutors() {
    return validExecutors;
  }

  public void execute(CommandSender sender, String[] args) {
    throw new UnsupportedOperationException("Method must be overridden to be used");
  }

  public enum ExecutorType {
    BOTH, CONSOLE, PLAYER
  }

}
