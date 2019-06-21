package pl.plajer.skeleton.commands.completion;

import java.util.List;

/**
 * @author Plajer
 * <p>
 * Created at 21.06.2019
 */
public class CompletableArgument {

  private String mainCommand;
  private String argument;
  private List<String> completions;

  public CompletableArgument(String mainCommand, String argument, List<String> completions) {
    this.mainCommand = mainCommand;
    this.argument = argument;
    this.completions = completions;
  }

  /**
   * @return main command of the argument
   */
  public String getMainCommand() {
    return mainCommand;
  }

  /**
   * @return argument name
   */
  public String getArgument() {
    return argument;
  }

  /**
   * @return all possible completions for this command argument
   */
  public List<String> getCompletions() {
    return completions;
  }
}
