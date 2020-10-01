package se.lexicon.dao.sequencer;

/**
 * Created by Mehrdad Javan
 * Date: Oct, 2020
 */
public class AppUSerSequencer {

    private static int appSequencer;

    public static int nextAppUserId() {
        return ++appSequencer;
    }

    public static int getAppSequencer() {
        return appSequencer;
    }
}
