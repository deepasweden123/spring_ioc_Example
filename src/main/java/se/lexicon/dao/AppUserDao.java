package se.lexicon.dao;

import se.lexicon.model.AppUser;

import java.util.Optional;

/**
 * Created by Mehrdad Javan
 * Date: Oct, 2020
 */
public interface AppUserDao {
    AppUser save(AppUser appUser);

    Optional<AppUser> findById(Integer id);

    boolean delete(Integer id);

}
