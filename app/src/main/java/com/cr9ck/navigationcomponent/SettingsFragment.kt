package com.cr9ck.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_settings.*

class SettingsFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragment_settings_back.setOnClickListener {
            val navController: NavController? = activity?.let {
                    it1 -> Navigation.findNavController(it1, R.id.nav_host_fragment)
            }
            navController?.navigate(R.id.homeFragment)
        }
    }
}