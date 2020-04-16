import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    scala
    kotlin("jvm") version "1.3.72"
}

group = "saarland.cispa"
version = "0.1"

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8", "1.3.72"))
    implementation("org.scala-lang", "scala-library", "2.12.11")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}
