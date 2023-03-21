package com.example.pilkotlin

import android.app.Activity
import android.content.Context
import java.lang.ref.WeakReference

class ActivityView(activity: Activity) {
    private val activityRef: WeakReference<Activity> = WeakReference(activity)

    val activity: Activity?
        get() = activityRef.get()

    val context: Context?
        get() = activity
}