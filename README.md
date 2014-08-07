* Download sbt from http://scala-sbt.org
* Run

  ```
  cd applause-sdk-test
  sbt run
  ```
* In logcat:

  ```
  ext.com.google.inject.CreationException: Guice creation errors:
    1) No implementation for android.content.Context was bound.
    while locating android.content.Context
    for parameter 0 at com.applause.android.ui.font.FontAwesome.<init>(Unknown Source)
            at com.applause.android.inject.ApplauseModule.configure(ApplauseModule.java:38)
    2) No implementation for android.content.Context was bound.
    while locating android.content.Context
    for parameter 0 at com.applause.android.ui.font.FontMontserrat.<init>(Unknown Source)
            at com.applause.android.inject.ApplauseModule.configure(ApplauseModule.java:39)
    3) No implementation for android.content.Context was bound.
    while locating android.content.Context
    for parameter 0 at com.applause.android.util.ShakeDetector.<init>(Unknown Source)
            at com.applause.android.inject.ApplauseModule.configure(ApplauseModule.java:36)
  ```
