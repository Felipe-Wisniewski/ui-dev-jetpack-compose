package eu.thomaskuenneth.composebook.composeunitconverter

import android.content.SharedPreferences

class Repository(private val prefs: SharedPreferences?) {

//    private val prefs = PreferenceManager.getDefaultSharedPreferences(context)

    fun getInt(key: String, default: Int) = prefs?.getInt(key, default)

    fun putInt(key: String, value: Int) {
        prefs?.edit()?.putInt(key, value)?.apply()
    }

    fun getString(key: String, default: String) = prefs?.getString(key, default) ?: default

    fun putString(key: String, value: String) {
        prefs?.edit()?.putString(key, value)?.apply()
    }
}
