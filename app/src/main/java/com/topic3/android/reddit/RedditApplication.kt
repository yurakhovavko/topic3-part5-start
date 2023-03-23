package com.topic3.android.reddit

import android.app.Application
import com.topic3.android.reddit.dependencyinjection.DependencyInjector

class RedditApplication : Application() {

  lateinit var dependencyInjector: DependencyInjector

  override fun onCreate() {
    super.onCreate()
    initDependencyInjector()
  }

  private fun initDependencyInjector() {
    dependencyInjector = DependencyInjector(this)
  }
}