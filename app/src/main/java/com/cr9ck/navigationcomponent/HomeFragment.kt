package com.cr9ck.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment () {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initListrners()
        val string = arguments?.get("arg3") as String
        val int = arguments?.get("arg4") as Int
        fragment_home_args.text = string + " = " + int
    }

    private fun initListrners() {

        fragment_home_next.setOnClickListener {
            val navController: NavController? = activity?.let {
                    it1 -> Navigation.findNavController(it1, R.id.nav_host_fragment)
            }
            navController?.navigate(R.id.action_homeFragment_to_settingsFragment)
        }
        fragment_home_back.setOnClickListener {
            val navController: NavController? = activity?.let {
                    it1 -> Navigation.findNavController(it1, R.id.nav_host_fragment)
            }
            navController?.navigate(R.id.profileFragment)
        }

    }

}