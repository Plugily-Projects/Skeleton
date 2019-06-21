package pl.plajer.skeleton.arena.states;

import pl.plajer.skeleton.Main;
import pl.plajer.skeleton.arena.Arena;

/**
 * @author Plajer
 * <p>
 * Created at 21.06.2019
 */
public interface ArenaStateHandler {

  /**
   * Initiate class with injecting the main plugin class
   *
   * @param plugin class to inject
   */
  void init(Main plugin);

  /**
   * Handle call for the current arena state for arena.
   * Basically when arena state is IN_GAME, the in game
   * state will be handled and called via that method.
   *
   * @param arena arena to call state update for
   */
  void handleCall(Arena arena);

}
