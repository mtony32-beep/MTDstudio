@rem
@rem Gradle wrapper batch script
@echo off
cd /d "%~dp0"
java -Xmx64m -Xms64m -classpath "gradle/wrapper/gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain %*
