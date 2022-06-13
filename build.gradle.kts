// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    dependencies {
        classpath(libs.hilt.plugin)
    }
}

plugins {
    id("com.android.application") version "7.2.1" apply false
    id("com.android.library") version "7.2.1" apply false
    id("org.jetbrains.kotlin.android") version "1.6.10" apply false
    id("org.jlleitschuh.gradle.ktlint") version "10.3.0"
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

ktlint {
    android.set(true)
    outputColorName.set("RED")
}
