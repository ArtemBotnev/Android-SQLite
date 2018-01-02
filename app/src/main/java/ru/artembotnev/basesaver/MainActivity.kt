package ru.artembotnev.basesaver

import android.support.v4.app.Fragment

/**
 * Created by Artem Botnev on 08.12.2017.
 */

class MainActivity : ParentActivity() {
    override fun createFragment(): Fragment =
            ListFragment.newInstance()
}