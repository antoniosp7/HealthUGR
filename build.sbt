scalaVersion     := "2.13.3"
name := "HealthUGR"
libraryDependencies += "org.scalameta" %% "munit" % "0.7.7" % Test
testFrameworks += new TestFramework("munit.Framework")
scalacOptions += "-Yrangepos" 

