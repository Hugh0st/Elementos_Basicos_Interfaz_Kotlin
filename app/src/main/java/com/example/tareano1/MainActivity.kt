package com.example.tareano1 // Asegúrate de que sea tu paquete

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        // Cargar el primer fragment al iniciar
        if (savedInstanceState == null) {
            replaceFragment(TextFieldsFragment())
            bottomNav.selectedItemId = R.id.nav_text
        }

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_text -> replaceFragment(TextFieldsFragment())
                R.id.nav_buttons -> replaceFragment(ButtonsFragment())
                R.id.nav_selection -> replaceFragment(SelectionFragment())
                R.id.nav_list -> replaceFragment(ListsFragment())
                R.id.nav_info -> replaceFragment(InfoFragment())
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}