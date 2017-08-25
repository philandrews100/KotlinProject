package smpl.code.me.kotlinproject.activities.main

import android.support.design.widget.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import smpl.code.me.kotlinproject.R
import smpl.code.me.kotlinproject.R.layout.activity_main
import smpl.code.me.kotlinproject.activities.core.CoreActivity

class MainActivity : CoreActivity() {

    override fun viewLayout() = activity_main

    override fun setupView() {
        bnController.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
}
