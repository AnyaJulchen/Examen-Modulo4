package com.otec.examen_modulo4;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
// import androidx.navigation.ui.AppBarConfiguration; // Removed
import androidx.navigation.ui.NavigationUI;

import com.otec.examen_modulo4.databinding.ActivityMainBinding;

public class Menu extends AppCompatActivity {

    private static final String TAG = "MenuActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = com.otec.examen_modulo4.databinding.ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.nav_host_fragment_activity_main);
        if (navHostFragment == null) {
            Log.e(TAG, "NavHostFragment not found with ID R.id.nav_host_fragment_activity_menu. Check your activity_menu.xml.");
            return;
        }
        
        NavController navController = navHostFragment.getNavController();
        NavigationUI.setupWithNavController(binding.navView, navController);
    }

}
