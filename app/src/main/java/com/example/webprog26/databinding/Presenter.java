package com.example.webprog26.databinding;

import android.support.annotation.NonNull;

/**
 * Created by webprog26 on 11.04.18.
 */

public interface Presenter {

    String PRESENTER_DEBUG = "presenter_debug";

    void onSaveProfile(@NonNull final User user);
}
