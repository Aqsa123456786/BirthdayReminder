package website.julianrosser.birthdays;

import android.content.Context;
import android.content.SharedPreferences;

public class Preferences {

    private static final String SHARED_PREFERENCE_KEY = "BirthdayReminderPreferences";
    private static final String KEY_USING_FIREBASE = "USING_FIREBASE";
    private static final String SHOULD_DISPLAY_WELCOME_SCREEN = "DISPLAY_WELCOME_SCREEN";

    public static synchronized void setIsUsingFirebase(Context context, boolean usingFirebase) {
        SharedPreferences prefs = context.getSharedPreferences(SHARED_PREFERENCE_KEY, 0);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(KEY_USING_FIREBASE, usingFirebase);
        editor.commit();
    }

    public static synchronized boolean isUsingFirebase(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(SHARED_PREFERENCE_KEY, 0);
        return prefs.getBoolean(KEY_USING_FIREBASE, false);
    }

    public static synchronized void setShouldShowWelcomeScreen(Context context, boolean shouldShowWelcomeScreen) {
        SharedPreferences prefs = context.getSharedPreferences(SHARED_PREFERENCE_KEY, 0);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(SHOULD_DISPLAY_WELCOME_SCREEN, shouldShowWelcomeScreen);
        editor.commit();
    }

    public static synchronized boolean shouldShowWelcomeScreen(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(SHARED_PREFERENCE_KEY, 0);
        return prefs.getBoolean(SHOULD_DISPLAY_WELCOME_SCREEN, true);
    }
}
