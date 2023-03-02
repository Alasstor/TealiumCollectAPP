package com.dpicallo.tealiumcollectapp

import android.app.Application

/**
 * Application Helper.
 */
class ApplicationHelper : Application() {

    override fun onCreate() {
        super.onCreate()
        TealiumHelper.initialize(this);

    }
}