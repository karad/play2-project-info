
import sbt._
import Keys._

object ProjectInfoPlugin extends Plugin with ProjectInfoTasks {

  override def settings: Seq[Setting[_]] = super.settings ++ Seq(
     projectInfo <<= projectInfoTask 
  )
  
}