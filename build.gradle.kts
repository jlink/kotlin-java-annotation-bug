import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm") version "1.5.31"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.code.findbugs:jsr305:3.0.2")
    //compileOnly("com.google.code.findbugs:jsr305:3.0.2")
}


tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf(
            "-Xjsr305=strict", // For strict type warnings
		)
        jvmTarget = "1.8"
    }
}

tasks.withType<Wrapper> {
    gradleVersion = "7.2"
}
