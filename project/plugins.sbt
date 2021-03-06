addSbtPlugin("io.spray" % "sbt-revolver" % "0.7.2")       // For quick restarts for web development

addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.3.0")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.1")

addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.8.0")

resolvers += Classpaths.sbtPluginReleases

addSbtPlugin("org.scoverage" %% "sbt-scoverage" % "1.2.0")

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.2.1")

addSbtPlugin("me.lessis" % "ls-sbt" % "0.1.3")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "0.8.5")

addSbtPlugin("se.marcuslonnberg" % "sbt-docker" % "1.2.0")

addSbtPlugin("com.github.alexarchambault" % "coursier-sbt-plugin" % "1.0.0-M9")
