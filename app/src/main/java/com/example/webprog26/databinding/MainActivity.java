package com.example.webprog26.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.webprog26.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        final User user = new User("First", "User");
        binding.setUser(user);
        binding.setHandler(new EventHandler());
        binding.setPresenter(new PresenterImpl());
    }
}
