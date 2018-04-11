package com.example.webprog26.databinding;

import android.support.annotation.NonNull;
import android.util.Log;

/**
 * Created by webprog26 on 11.04.18.
 */

public class PresenterImpl implements Presenter {

    @Override
    public void onSaveProfile(@NonNull User user) {
        Log.i(Presenter.PRESENTER_DEBUG, "user: " + user.getFirstName() + " " + user.getLastName());
    }
}
