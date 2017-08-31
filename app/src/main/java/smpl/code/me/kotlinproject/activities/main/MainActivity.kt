package smpl.code.me.kotlinproject.activities.main

import android.support.design.widget.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import smpl.code.me.kotlinproject.R
import smpl.code.me.kotlinproject.R.layout.activity_main
import smpl.code.me.kotlinproject.activities.core.CoreActivity
import smpl.code.me.kotlinproject.activities.main.`interface`.MainInterface
import smpl.code.me.kotlinproject.fragments.main.DashboardFragment
import smpl.code.me.kotlinproject.fragments.main.HomeFragment
import smpl.code.me.kotlinproject.fragments.main.NotificationsFragment

class MainActivity : CoreActivity(), MainInterface {

    override fun viewLayout() = activity_main
    override fun fragmentLayout() = R.id.flFragmentContainer

    override fun setupView() {
        bnController.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                startHomeFragment()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                startDashboardFragment()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                startNotificationsFragment()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    /**
     * Fragment Functions
     */

    override fun startDashboardFragment() = fragmentController!!.switchFragment(DashboardFragment(), "DashboardFragment")
    override fun startHomeFragment() = fragmentController!!.switchFragment(HomeFragment(), "HomeFragment")
    override fun startNotificationsFragment() = fragmentController!!.switchFragment(NotificationsFragment(), "NotificationsFragment")
}
