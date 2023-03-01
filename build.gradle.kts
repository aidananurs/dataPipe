import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "me.aidananursultanova"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}

dependencies {

    // JACKSON
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:${property("jacksonVersion")}")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:${property("jacksonVersion")}")

    // POSTGRESQL
    runtimeOnly("org.postgresql:postgresql")

    // Hikari DB Pool
    implementation("com.zaxxer:HikariCP:2.3.2")

}