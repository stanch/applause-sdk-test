package com.example.macroid.starter

import android.graphics.Typeface
import android.os.Bundle
import android.widget.TextView
import android.app.Activity
import com.applause.android.Applause
import com.applause.android.config.Configuration

import macroid._
import macroid.FullDsl._

class MainActivity extends Activity with Contexts[Activity] {
  override def onCreate(savedInstanceState: Bundle) = {
    super.onCreate(savedInstanceState)
    val view = w[TextView] <~ text("Test")
    setContentView(getUi(view))
  }

  override def onStart() = {
    super.onStart()

    val typeface = Typeface.createFromAsset(getAssets, "fonts/Montserrat-Regular.ttf")
    assert(typeface != null)

    val applauseConfig = new Configuration.Builder(this)
      .withAPIKey("... API KEY HERE ...")
      .withServerURL("https://aph.applause.com")
      .build()
    Applause.startNewSession(this, applauseConfig)
  }
}
