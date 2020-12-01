rootProject.name = "carmen"
include("frontend")
include("backend")


pluginManagement {
    val kotlinVersion = "${extra.properties["kotlin.version"]}"
    plugins {
        id("io.spring.dependency-management") version "1.0.10.RELEASE"
        id("org.jetbrains.kotlin.plugin.spring") version kotlinVersion
        id("org.springframework.boot") version "2.3.5.RELEASE"
        kotlin("jvm") version kotlinVersion
    }
}
