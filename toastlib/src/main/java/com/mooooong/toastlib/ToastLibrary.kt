package com.mooooong.toastlib

import android.content.Context
import android.widget.Toast

object ToastLibrary {

    fun testToast(context: Context) {
        Toast.makeText(context, "우힛 toast", Toast.LENGTH_SHORT).show()
    }
}
