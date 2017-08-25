package smpl.code.me.kotlinproject.fragments.core

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by phil-apposing on 25/08/2017.
 */
abstract class CoreFragment: Fragment() {

    abstract fun viewLayout(): Int
    abstract fun initView(view: View)
    abstract fun setupView()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater!!.inflate(viewLayout(), container, false)
        initView(view)
        setupView()
        return view
    }

}