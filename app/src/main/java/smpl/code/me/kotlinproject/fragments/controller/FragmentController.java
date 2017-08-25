package smpl.code.me.kotlinproject.fragments.controller;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;

/**
 * Created by phil-apposing on 25/08/2017.
 */

public class FragmentController {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private Activity activity;
    private Fragment currentFragment;
    private FragmentManager.OnBackStackChangedListener backStackChangedListener;
    private FrameLayout flMainContainer;

    public FragmentController(Context context, FragmentManager.OnBackStackChangedListener backStackChangedListener, int flMainContainerId, FragmentManager fragmentManager) {
        this.activity = (Activity) context;
        flMainContainer = (FrameLayout) this.activity.findViewById(flMainContainerId);
        this.backStackChangedListener = backStackChangedListener;
        setupFragManager(fragmentManager);
    }

    public void switchFragment(Fragment fragment, String fragmentName) {
        removeOldFragment();
        addNewFragment(fragment, fragmentName);
    }

    public void addNewFragment(Fragment fragment, String fragmentName) {
        fragmentTransaction = getFragManager().beginTransaction();
        currentFragment = fragment;
        fragmentTransaction.replace(flMainContainer.getId(), currentFragment, fragmentName);
        fragmentTransaction.addToBackStack(fragmentName);
        fragmentTransaction.commitAllowingStateLoss();

    }

    public void popBackStack() {
        fragmentManager.popBackStack();
    }

    private void removeOldFragment() {
        fragmentTransaction = getFragManager().beginTransaction();
        if (currentFragment != null) {
            if (this.activity != null) {
                fragmentTransaction.remove(currentFragment);
                getFragManager().popBackStack();
                fragmentTransaction.commitAllowingStateLoss();
            }
        }
    }

    private android.support.v4.app.FragmentManager getFragManager() {
        if (fragmentManager == null) {
            throw new IllegalStateException(FragmentController.class.getSimpleName() +
                    " is not initialized, call setupFragmentManager(...) first");
        }

        if (this.backStackChangedListener != null)
            fragmentManager.addOnBackStackChangedListener(this.backStackChangedListener);

        return fragmentManager;
    }

    private void setupFragManager(FragmentManager fragmentManager) {
        this.fragmentManager = fragmentManager;
    }

    public int getBackstackCount() {
        return fragmentManager.getBackStackEntryCount();
    }

    public Fragment getCurrentFragment() {
        return this.currentFragment;
    }

}