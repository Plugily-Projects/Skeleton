package pl.plajer.skeleton.commands.completion;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Plajer
 * <p>
 * Created at 21.06.2019
 */
public class CompletableArgumentTest {

  private CompletableArgument argument;

  @Before
  public void setUp() {
    argument = new CompletableArgument("test", "argument", Arrays.asList("completion1", "completion12"));
  }

  @Test
  public void testValues() {
    Assert.assertEquals("test", argument.getMainCommand());
    Assert.assertEquals("argument", argument.getArgument());
    Assert.assertEquals(Arrays.asList("completion1", "completion2"), argument.getCompletions());
  }

}