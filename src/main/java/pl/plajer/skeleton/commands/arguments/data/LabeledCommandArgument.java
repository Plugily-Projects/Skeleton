package pl.plajer.skeleton.commands.arguments.data;

import java.util.List;

/**
 * @author Plajer
 * <p>
 * Created at 21.06.2019
 */
public class LabeledCommandArgument extends CommandArgument {

  private LabelData labelData;

  public LabeledCommandArgument(String argumentName, List<String> permissions, ExecutorType validExecutors, LabelData labelData) {
    super(argumentName, permissions, validExecutors);
    this.labelData = labelData;
  }

  public LabeledCommandArgument(String argumentName, String permissions, ExecutorType validExecutors, LabelData labelData) {
    super(argumentName, permissions, validExecutors);
    this.labelData = labelData;
  }

  /**
   * @return label data of command (description and usages of command)
   */
  public LabelData getLabelData() {
    return labelData;
  }
}
