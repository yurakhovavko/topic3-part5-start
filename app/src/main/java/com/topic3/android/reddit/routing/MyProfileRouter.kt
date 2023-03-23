package com.topic3.android.reddit.routing

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

/**
 * Класс, определяющий экраны, которые есть в нашем приложении.
 *
 * Эти объекты должны соответствовать файлам, которые есть в пакете screens
 */
sealed class MyProfileScreenType {
  object Posts : MyProfileScreenType()
  object About : MyProfileScreenType()
}

object MyProfileRouter {
  var currentScreen: MutableState<MyProfileScreenType> = mutableStateOf(MyProfileScreenType.Posts)

  fun navigateTo(destination: MyProfileScreenType) {
    currentScreen.value = destination
  }
}