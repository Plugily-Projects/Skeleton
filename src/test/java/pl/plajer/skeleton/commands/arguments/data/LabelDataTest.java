package pl.plajer.skeleton.commands.arguments.data;

import org.bukkit.ChatColor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Plajer
 * <p>
 * Created at 21.06.2019
 */
public class LabelDataTest {

  private LabelData labelData;

  @Before
  public void setUp() {
    labelData = new LabelData("&6text", "cmd", "&7description");
  }

  @Test
  public void testValues() {
    Assert.assertEquals(ChatColor.translateAlternateColorCodes('&', "&6text"), labelData.getText());
    Assert.assertEquals("cmd", labelData.getCommand());
    Assert.assertEquals(ChatColor.translateAlternateColorCodes('&', "&7description"), labelData.getDescription());
  }

}