package cz.ackee.cookbook

import android.app.Application
import android.content.Context

/**
 * Main application class
 */
class App : Application() {

    companion object {
        val TAG = App::class.java.name
    }

    override fun onCreate() {
        super.onCreate()

        // TODO initialize other libraries here
    }
}
