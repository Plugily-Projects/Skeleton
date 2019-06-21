package pl.plajer.skeleton.commands.arguments.data;

import java.util.Collections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Plajer
 * <p>
 * Created at 21.06.2019
 */
public class CommandArgumentTest {

  private CommandArgument argument;

  @Before
  public void setUp() {
    argument = new CommandArgument("arg", "no.perm", CommandArgument.ExecutorType.BOTH);
  }

  @Test
  public void testValues() {
    Assert.assertEquals("arg", argument.getArgumentName());
    Assert.assertEquals(Collections.singletonList("no.perm"), argument.getPermissions());
    Assert.assertEquals(CommandArgument.ExecutorType.BOTH, argument.getValidExecutors());
  }

}