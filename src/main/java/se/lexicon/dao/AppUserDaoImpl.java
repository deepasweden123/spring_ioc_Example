package se.lexicon.dao;

import se.lexicon.dao.sequencer.AppUSerSequencer;
import se.lexicon.model.AppUser;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Created by Mehrdad Javan
 * Date: Oct, 2020
 */
public class AppUserDaoImpl implements AppUserDao {

    private Set<AppUser> appUsers = new HashSet<>();

    @Override
    public AppUser save(AppUser appUser) {
        if (appUser.getUserId() == null) {
            appUser.setUserId(AppUSerSequencer.nextAppUserId());
            appUsers.add(appUser);
        }else{
            Optional<AppUser> appUserOptional = findById(appUser.getUserId());
            AppUser original = appUserOptional.orElseThrow(IllegalArgumentException::new);
            original.setName(appUser.getName());
            original.setEmail(appUser.getEmail());
            original.setPassword(appUser.getPassword());
            original.setAddress(appUser.getAddress());
        }
        return appUser;
    }

    @Override
    public Optional<AppUser> findById(Integer id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        return appUsers.stream()
                .filter(appUser -> appUser.getUserId().equals(id))
                .findFirst();
    }

    @Override
    public boolean delete(Integer id) {
        AppUser appUser = findById(id).orElseThrow(IllegalArgumentException::new);
        return appUsers.remove(appUser);
    }
}
