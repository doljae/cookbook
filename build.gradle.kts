import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") apply false
    id("com.google.cloud.tools.jib") version "3.3.2"
}

allprojects {
    group = "org.cookbook"
    version = "1.0-SNAPSHOT"

    apply{
        plugin("kotlin")
    }

    repositories {
        mavenCentral()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "17"
        }
    }
}

subprojects {

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}
