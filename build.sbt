name := "betbot"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  // ScalaTest
  "org.scalactic" %% "scalactic" % "3.0.5",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test",

  // Akka
  "com.typesafe.akka" %% "akka-actor"   % "2.5.14",
  "com.typesafe.akka" %% "akka-slf4j"   % "2.5.14",
  "com.typesafe.akka" %% "akka-remote"  % "2.5.14",
  "com.typesafe.akka" %% "akka-agent"   % "2.5.14",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.14" % "test",

  // Spray Json
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.3"
)