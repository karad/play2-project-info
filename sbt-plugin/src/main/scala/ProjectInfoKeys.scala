
import sbt._

trait ProjectInfoKeys {
    val projectInfo = TaskKey[Unit]("play2-project-info", "Play 2.0 Project Information Tool")
}