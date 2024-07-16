lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-example-project",
    description := "Example sbt project that compiles using Scala 3",
    version := "0.1.0",
    scalaVersion := "3.4.2",
    scalacOptions ++= Seq("-deprecation"),
    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "1.0.0" % Test,
      "ch.qos.logback" % "logback-classic" % "1.2.3" % Compile
    )
  )
