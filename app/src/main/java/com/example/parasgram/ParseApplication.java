package com.example.parasgram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("8HurkRV9KVlish0o8BBvfVlUP9ytASOe9l1Aypem")
                .clientKey("bJKJiwv1rbFjDuybzcDNd4wF9BrNCvb8DBSAt2ec")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
