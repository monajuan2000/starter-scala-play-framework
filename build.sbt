lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """play-scala-hello-world-tutorial""",
    organization := "com.ias.play",
    version := "1.0",
    scalaVersion := "2.13.6",
    libraryDependencies ++= Seq(
      guice,
      "com.typesafe.play" %% "play-slick" % "4.0.2",
      "com.typesafe.play" %% "play-slick-evolutions" % "4.0.2",
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test,
      "com.h2database" % "h2" % "1.4.199",
      specs2 % Test,
    ),

    scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
      "-Xfatal-warnings"
    )
  )
