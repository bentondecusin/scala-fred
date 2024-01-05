val scala3Version = "3.3.1"

val commonSettings: Seq[Setting[_]] = Seq(
  scalacOptions -= "-Xfatal-warnings",
  scalacOptions += "-source:future",
  libraryDependencies ++= Seq(
    "com.softwaremill.sttp.client4" %% "core" % "4.0.0-M8",
    "org.scalameta" %% "munit" % "0.7.29" % Test
  )
)

lazy val root = project
  .in(file("."))
  .settings(
    commonSettings,
    name := "scala-fred",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    semanticdbEnabled := true
  )
