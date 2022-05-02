package com.defocs.xpense;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView navHome;
    ImageView navChart;
    ImageView navNotification;
    ImageView navSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navHome = findViewById(R.id.nav_home);
        navChart = findViewById(R.id.nav_chart);
        navNotification = findViewById(R.id.nav_notification);
        navSetting = findViewById(R.id.nav_setting);

        navHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new HomeFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_place, fragment)
                        .commit();

                navHome.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.selectedicon), PorterDuff.Mode.SRC_IN);
                navNotification.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.unselectedicon), PorterDuff.Mode.SRC_IN);
                navChart.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.unselectedicon), PorterDuff.Mode.SRC_IN);
                navSetting.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.unselectedicon), PorterDuff.Mode.SRC_IN);


            }
        });
        navChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new ChartFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_place, fragment)
                        .commit();
                navHome.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.unselectedicon), PorterDuff.Mode.SRC_IN);
                navNotification.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.unselectedicon), PorterDuff.Mode.SRC_IN);
                navChart.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.selectedicon), PorterDuff.Mode.SRC_IN);
                navSetting.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.unselectedicon), PorterDuff.Mode.SRC_IN);

            }
        });
        navNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new NotificationFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_place, fragment)
                        .commit();
                navHome.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.unselectedicon), PorterDuff.Mode.SRC_IN);
                navNotification.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.selectedicon), PorterDuff.Mode.SRC_IN);
                navChart.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.unselectedicon), PorterDuff.Mode.SRC_IN);
                navSetting.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.unselectedicon), PorterDuff.Mode.SRC_IN);

            }
        });
        navSetting.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Fragment fragment = new SettingFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_place, fragment)
                        .commit();
                navHome.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.unselectedicon), PorterDuff.Mode.SRC_IN);
                navNotification.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.unselectedicon), PorterDuff.Mode.SRC_IN);
                navChart.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.unselectedicon), PorterDuff.Mode.SRC_IN);
                navSetting.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.selectedicon), PorterDuff.Mode.SRC_IN);

            }
        });

    }






}