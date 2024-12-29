package com.example.pam_pert10

import android.app.Application
import com.example.pam_pert10.dependeciesinjection.AppContainer
import com.example.pam_pert10.dependeciesinjection.MahasiswaContainer

class MahasiswaApplications:Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}