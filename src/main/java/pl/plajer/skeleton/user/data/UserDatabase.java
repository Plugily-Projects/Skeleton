package pl.plajer.skeleton.user.data;

import pl.plajer.skeleton.user.StatsStorage;
import pl.plajer.skeleton.user.User;

/**
 * @author Plajer
 * <p>
 * Created at 21.06.2019
 */
public interface UserDatabase {

  /**
   * Saves player statistic into yaml or MySQL storage based on user choice
   *
   * @param user user to retrieve statistic from
   * @param stat stat to save to storage
   */
  void saveStatistic(User user, StatsStorage.StatisticType stat);

  /**
   * Loads player statistic from yaml or MySQL storage based on user choice
   *
   * @param user user to load statistic for
   * @param stat type of stat to load from storage
   */
  void loadStatistic(User user, StatsStorage.StatisticType stat);

}
