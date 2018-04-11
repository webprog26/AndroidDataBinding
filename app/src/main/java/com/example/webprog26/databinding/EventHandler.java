package com.example.webprog26.databinding;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Toast;

/**
 * Created by webprog26 on 11.04.18.
 */

public class EventHandler {

    public void handleClick(@NonNull final View view){
        Toast.makeText(App.getAppContext(), "Clicked", Toast.LENGTH_SHORT).show();
    }
}
