
ScalaVersion := "2.8.0"

Organization := "com.foursquare"

Name := "rogue"

Version := "1.0.3"

// Lift Libraries
LibraryDependencies ++= Seq(
	"net.liftweb" %% "lift-common"         % "2.2" % "compile" withSources(),
	"net.liftweb" %% "lift-json"           % "2.2" % "compile" withSources(),
	"net.liftweb" %% "lift-json-ext"       % "2.2" % "compile" withSources(),
	"net.liftweb" %% "lift-record"         % "2.2" % "compile" withSources(),
	"net.liftweb" %% "lift-util"           % "2.2" % "compile" withSources(),
	"net.liftweb" %% "lift-mongodb"        % "2.2" % "compile" withSources(),
	"net.liftweb" %% "lift-mongodb-record" % "2.2" % "compile" withSources())

// Scala Libraries
LibraryDependencies ++= Seq(
	"org.scala-lang"           % "scala-compiler"     % "2.8.0" % "test",
	"org.scala-tools.testing" %% "specs"              % "1.6.5" % "test" withSources())

// Java Libraries
LibraryDependencies ++= Seq(
	"org.mongodb"         % "mongo-java-driver" % "2.4",
	"joda-time"           % "joda-time"         % "1.6" withSources(),
	"org.apache.commons"  % "commons-math"      % "2.1",
	"junit"               % "junit"             % "4.8.2" % "test" withSources())
