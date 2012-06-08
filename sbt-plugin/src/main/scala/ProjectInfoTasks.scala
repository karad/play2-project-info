
import sbt._
import PlayProject._
import Keys._
import NameFilter._
import jline._
import java.io._
import scalax.file._


trait ProjectInfoTasks extends ProjectInfoKeys {
  
  val projectInfoTask = (streams) map { (s) =>
    println()
    println(Colors.green("=============================================================="))
    println(Colors.green("play! project info.             - @kara_d, http://greative.jp/"))
    println()
    println(Colors.yellow("--------------------------------------------------------------"))
    println(Colors.yellow("project properties : "))
    println(Colors.yellow("--------------------------------------------------------------"))
    System.getProperties().list(System.out)
    println()
    println(Colors.yellow("--------------------------------------------------------------"))
    println(Colors.yellow("project env : "))
    println(Colors.yellow("--------------------------------------------------------------"))
    System.out.println(System.getenv())
    println()
  }

  object Colors {

    import scala.Console._

    lazy val isANSISupported = {
      Option(System.getProperty("sbt.log.noformat")).map(_ != "true").orElse {
        Option(System.getProperty("os.name"))
          .map(_.toLowerCase)
          .filter(_.contains("windows"))
          .map(_ => false)
      }.getOrElse(true)
    }

    def red(str: String): String = if (isANSISupported) (RED + str + RESET) else str
    def blue(str: String): String = if (isANSISupported) (BLUE + str + RESET) else str
    def cyan(str: String): String = if (isANSISupported) (CYAN + str + RESET) else str
    def green(str: String): String = if (isANSISupported) (GREEN + str + RESET) else str
    def magenta(str: String): String = if (isANSISupported) (MAGENTA + str + RESET) else str
    def white(str: String): String = if (isANSISupported) (WHITE + str + RESET) else str
    def black(str: String): String = if (isANSISupported) (BLACK + str + RESET) else str
    def yellow(str: String): String = if (isANSISupported) (YELLOW + str + RESET) else str

  }
  
}

