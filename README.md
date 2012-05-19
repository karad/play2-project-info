# Project Infomation module for Play2!

## Usage

### 1. Install the module dependency

Edit file `project/plugins.sbt` and adjust the following settings

```
resolvers += "Greative Repository" at "https://github.com/karad/maven-repo/raw/master/release/"

addSbtPlugin("jp.greative" %% "play2-project-info-sbt" % "0.1")
```

So, you can show project information about properties and env.
Type this.

```
$ play
[YourProject] $ play2-project-info
```


```
       _            _ 
 _ __ | | __ _ _  _| |
| '_ \| |/ _' | || |_|
|  __/|_|\____|\__ (_)
|_|            |__/ 
             
play! 2.1-SNAPSHOT, http://www.playframework.org

> Type "help play" or "license" for more information.
> Type "exit" or use Ctrl+D to leave this console.

[YourProject] $ play2-project-info

==============================================================
play! project info.             - @kara_d, http://greative.jp/

--------------------------------------------------------------
project properties : 
--------------------------------------------------------------
-- listing properties --
sbt.ivy.home=/Users/harakazuhiro/gitrepo_src/Play2...
java.runtime.name=Java(TM) SE Runtime Environment
sun.boot.library.path=/System/Library/Java/JavaVirtualMachi...
java.vm.version=20.1-b02-384
awt.nativeDoubleBuffering=true
gopherProxySet=false
mrj.build=10M3425
java.vm.vendor=Apple Inc.
java.vendor.url=http://www.apple.com/

....

java.vendor.url.bug=http://bugreport.apple.com/
sun.cpu.endian=little
sun.io.unicode.encoding=UnicodeLittle
mrj.version=1060.1.6.0_26-384
socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16
ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16
sun.cpu.isalist=

--------------------------------------------------------------
project env : 
--------------------------------------------------------------
{TERM=xterm-color, DYLD_LIBRARY_PATH=/Library/Frameworks/R.framework/Resources/lib:/Library/Frameworks/R.framework/Resources/bin::/Users/harakazuhiro/Library/R/2.13/library/rJava/jri, JAVA_HOME=/Library/Java/Home, TERM_PROGRAM=Apple_Terminal, rvm_version=1.13.4 (), 

.... 

DISPLAY=/tmp/launch-XOxgj5/org.x:0, R_SHARE_DIR=/Library/Frameworks/R.framework/Resources/share, USER=harakazuhiro, com.apple.java.jvmTask=CommandLine_Manual.java, rvm_ruby_mode=, HOME=/Users/harakazuhiro, GAE_PATH=/Users/harakazuhiro/appengine-java-sdk-1.4.0, LANG=ja_JP.UTF-8}

[success] Total time: 0 s, completed 2012/05/20 3:10:54
```
