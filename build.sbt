
val TestStateVer = "2.3.0"
val SjsReactVer = "1.3.1"

lazy val root = project.in(file(".")).settings(
  name := "domzipper-react-tree",

  libraryDependencies ++= Seq(
    "com.github.japgolly.scalajs-react" %%% "core" % SjsReactVer,
    "com.github.japgolly.test-state" %%% "core"              % TestStateVer,
    "com.github.japgolly.test-state" %%% "dom-zipper"        % TestStateVer
  ),
  npmDependencies in Compile ++= Seq(
     "react" -> "16.5.1",
     "react-test-renderer" -> "16.5.1"),
  scalaJSUseMainModuleInitializer := true
) .enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)
