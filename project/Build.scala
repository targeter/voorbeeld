import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "voorbeeld"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaJpa,
    "org.hibernate" % "hibernate-entitymanager" % "3.6.9.Final",
    "com.google.guava" % "guava" % "14.0.1"

  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here
  )

}
