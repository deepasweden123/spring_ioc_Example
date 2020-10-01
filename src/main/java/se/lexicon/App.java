package se.lexicon;

import se.lexicon.dao.AppUserDao;
import se.lexicon.dao.AppUserDaoImpl;
import se.lexicon.model.AppUser;

import java.util.Optional;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AppUserDao dao = new AppUserDaoImpl();
        AppUser appUser = new AppUser("Test", "test.test@lexicon.se", "123456", "Vaxjo");
        AppUser resAppUser = dao.save(appUser);
        System.out.println("resAppUser.toString() = " + resAppUser.toString());
        Optional<AppUser> resFindById = dao.findById(resAppUser.getUserId());
        resFindById.ifPresent(appUser1 -> System.out.println(appUser1.toString()));
    }
}
