logLevel := Level.Warn

resolvers += "Typesafe Releases" at "https://repo.typesafe.com/typesafe/releases/"
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.0")
addSbtPlugin("com.typesafe.sbt" %% "sbt-native-packager" % "1.0.6")
