package com.example.android.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView profilePic;
    TextView name;
    TextView birthday;
    TextView country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profilePic = findViewById(R.id.profile_picture);
        name = findViewById(R.id.name);
        birthday = findViewById(R.id.birthday);
        country = findViewById(R.id.country);

        profilePic.setImageResource(R.drawable.profilepic);

        name.setText(getString(R.string.user_name));
        name.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        name.setTextSize(getResources().getDimension(R.dimen.lg_text));

        birthday.setText(getString(R.string.birthday));
        birthday.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        birthday.setTextSize(getResources().getDimension(R.dimen.md_text));

        country.setText(getString(R.string.country));
        country.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        country.setTextSize(getResources().getDimension(R.dimen.md_text));
    }
}
