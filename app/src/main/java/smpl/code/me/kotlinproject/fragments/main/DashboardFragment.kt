package smpl.code.me.kotlinproject.fragments.main

import android.view.View
import smpl.code.me.kotlinproject.R
import smpl.code.me.kotlinproject.R.layout.fragment_dashboard
import smpl.code.me.kotlinproject.fragments.core.CoreFragment

/**
 * Created by phil-apposing on 25/08/2017.
 */
class DashboardFragment: CoreFragment() {

    override fun viewLayout() = fragment_dashboard

    override fun initView(view: View) {
        /**
         * This shows an instance where this isn't needed
         */
    }

    override fun setupView() {
    }
}