package smpl.code.me.kotlinproject.activities.main.control

import android.content.Context
import smpl.code.me.kotlinproject.activities.main.`interface`.MainInterface

/**
 * Created by phil-apposing on 25/08/2017.
 */
class MainControl(context: Context) {

    var mainInterface: MainInterface? = null

    init {
        mainInterface = context as MainInterface
    }

    fun startDashboardFragment() = mainInterface!!.startDashboardFragment()
    fun startHomeFragment() = mainInterface!!.startHomeFragment()
    fun startNotificationsFragment() = mainInterface!!.startNotificationsFragment()
}