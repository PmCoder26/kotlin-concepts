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


}

application {
    mainClass.set("MainKt") // Change if your main class is different
}