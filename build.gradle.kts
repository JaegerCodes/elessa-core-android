buildscript {
    dependencies {
        classpath(libs.elessa.convention)
    }
}
allprojects {
    apply(plugin = "llamasoft.detekt")
}
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.ksp) version libs.versions.kspVersion.get() apply true
    id("io.gitlab.arturbosch.detekt") version "1.22.0"
    id("org.jetbrains.kotlin.jvm") version "1.7.20" apply false
}
