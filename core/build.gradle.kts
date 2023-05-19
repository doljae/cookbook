plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    kotlin("plugin.spring")
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter:_")
    implementation("org.jetbrains.kotlin:kotlin-reflect:_")
    implementation(Spring.boot.web)
    developmentOnly(Spring.boot.devTools)
    annotationProcessor(Spring.boot.configurationProcessor)
    kapt(Spring.boot.configurationProcessor)
    testImplementation(Spring.boot.test)
}
