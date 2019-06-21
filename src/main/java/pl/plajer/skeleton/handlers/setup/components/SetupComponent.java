package pl.plajer.skeleton.handlers.setup.components;

import com.github.stefvanschie.inventoryframework.pane.StaticPane;

import pl.plajer.skeleton.handlers.setup.SetupInventory;

/**
 * @author Plajer
 * <p>
 * Created at 21.06.2019
 */
public interface SetupComponent {

  void prepare(SetupInventory inventory);

  void injectComponents(StaticPane pane);

}
