import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "projetao"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaJpa,
    "mysql" % "mysql-connector-java" % "5.1.21",
    "org.hibernate" % "hibernate-entitymanager" % "4.1.9.Final"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
