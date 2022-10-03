package com.example.biometricauthcompat

import android.app.Application
import dev.skomlach.biometric.compat.BiometricPromptCompat

class BiometricPromptApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        BiometricPromptCompat.Companion.init(null)



    }
}