plugins {
    kotlin("jvm") version "1.9.0"
    application
    // Serialization configs.
    kotlin("plugin.serialization") version "1.9.0"
}

repositories {
    mavenCentral()
}

dependencies {
    // Coroutines configs.
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")

    // Serialization configs.
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.1")

    // Data Science configs.
    implementation("org.jetbrains.kotlinx:dataframe:1.0.0-Beta2")

    // Ktor configs
    implementation("io.ktor:ktor-network:2.3.5")   // TCP/UDP sockets
    implementation("io.ktor:ktor-utils:2.3.5")


}

application {
    mainClass.set("MainKt") // Change if your main class is different
}