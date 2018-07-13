name := """todo-app"""
organization := "com.kolade"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.6"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

val AnormVersion = "2.6.2"
val JodaTimeVersion = "2.10"
val ScalaTestPlayVersion = "4.0.0-M1"

libraryDependencies ++= Seq(guice, jdbc)
libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % JodaTimeVersion,
  "org.playframework.anorm" %% "anorm" % AnormVersion,
  "org.scalatestplus.play" %% "scalatestplus-play" % ScalaTestPlayVersion % Test
)

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.kolade.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.kolade.binders._"
