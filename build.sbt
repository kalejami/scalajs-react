enablePlugins(ScalaJSPlugin)
enablePlugins(ScalaJSBundlerPlugin)

libraryDependencies += "com.github.japgolly.scalajs-react" %%% "core" % "1.3.1"

name := "scalajs-react"

version := "0.1"

scalaVersion := "2.12.7"

npmDependencies in Compile ++= Seq(
	"react" -> "16.6.3",
	"react-dom" -> "16.6.3"
)

scalaJSUseMainModuleInitializer := true
