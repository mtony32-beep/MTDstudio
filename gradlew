#!/bin/sh
# Gradle wrapper script placeholder
cd "$(dirname "$0")"
exec java -Xmx64m -Xms64m -classpath "gradle/wrapper/gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain "$@"
