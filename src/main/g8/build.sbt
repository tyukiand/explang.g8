ThisBuild / scalaVersion := "$scala-version$"

lazy val root = (project in file(".")).
  settings(
    name := "$project-name$",
    /*
    $dependency-links$
    */
    libraryDependencies += "org.typelevel" %% "cats-core" % "$cats-core-version$",
    libraryDependencies += "org.typelevel" %% "cats-mtl" % "$cats-mtl-version$",
    libraryDependencies += "org.typelevel" %% "cats-effect" % "$cats-effect-version$",
    libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "$scala-parser-combinators-version$",
    libraryDependencies += "org.scalacheck" %% "scalacheck" % "$scalacheck-version$" % Test,
    libraryDependencies += "org.scalameta" %% "munit" % "$munit-version$" % Test
  )
