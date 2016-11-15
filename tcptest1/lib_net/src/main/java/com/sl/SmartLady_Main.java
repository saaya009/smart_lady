package com.sl;

import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

import static sl.util.Log.*;

public class SmartLady_Main {

    public static void main(String[] args) throws BackingStoreException {
        Preferences preferences = Preferences.userNodeForPackage(SmartLady_Main.class);
        preferences.put("addr", "127.0.0.1");
        preferences.flush();
        Preferences preferences1 = Preferences.userNodeForPackage(SmartLady_Main.class);
        String s = preferences1.get("addr", "null");
        log(s);
    }


}
