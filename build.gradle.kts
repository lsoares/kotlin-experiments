plugins {
    kotlin("jvm") version "1.3.72"
}

group = "com.luisoares"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val junitVersion by extra("5.+")
dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}