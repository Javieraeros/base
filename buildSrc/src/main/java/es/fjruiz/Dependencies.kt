package es.fjruiz

private const val ANDROID_BUILD_TOOL_VERSION = "4.0.0"
private const val GITVERSIONER_VERSION = "0.5.0"
private const val KOTLIN_VERSION = "1.3.72"
private const val KTLINT_VERSION = "2.4.0"

object Dependencies {
    val androidBuildToolGradlePlugin = "com.android.tools.build:gradle:$ANDROID_BUILD_TOOL_VERSION"
    val gitversionerPlugin = "com.pascalwelsch.gitversioner:gitversioner:$GITVERSIONER_VERSION"
    val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$KOTLIN_VERSION"
    val kotlinSTDLib = "org.jetbrains.kotlin:kotlin-stdlib:$KOTLIN_VERSION"
    val ktlintPlugin = "org.jmailen.gradle:kotlinter-gradle:$KTLINT_VERSION"
}