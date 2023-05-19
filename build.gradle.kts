import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") apply false
    kotlin("kapt") apply false
    id("org.jlleitschuh.gradle.ktlint") apply false
    id("com.google.cloud.tools.jib")
}

allprojects {
    group = "org.cookbook"
    version = "1.0-SNAPSHOT"

    apply {
        plugin("kotlin")
        plugin("kotlin-kapt")
        plugin("org.jlleitschuh.gradle.ktlint")
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
