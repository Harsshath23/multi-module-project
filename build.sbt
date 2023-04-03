ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val module1 = project in file("module1")
lazy val module2 = (project in file("module2")).dependsOn(module1)
lazy val root = (project in file("."))
  .settings(
    name := "multi-module-project"
  ).aggregate(module1,module2).dependsOn(module1,module2)
