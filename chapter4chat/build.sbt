name := """chapter4Chat"""
organization := "uk.co.abelmaneiro"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.8"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "uk.co.abelmaneiro.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "uk.co.abelmaneiro.binders._"
