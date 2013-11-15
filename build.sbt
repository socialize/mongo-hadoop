import AssemblyKeys._

name := "mongo-hadoop"

organization := "org.mongodb"

hadoopRelease in ThisBuild := "cdh4"

artifactName := { (sv: ScalaVersion, module: ModuleID, artifact: Artifact) =>
  artifact.name + "-" + module.revision + "-socialize." + artifact.extension
}
