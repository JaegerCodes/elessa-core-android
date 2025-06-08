plugins {
    alias(libs.plugins.llamasoft.detekt) apply false
}

tasks.register("detektAll") {
    dependsOn(subprojects.map { "${it.path}:detekt" })
    group = "verification"
    description = "Run detekt on all modules"
}

tasks.register("testAll") {
    dependsOn(subprojects.map { "${it.path}:test" })
    group = "verification"
    description = "Run tests on all modules"
}

tasks.register("buildAll") {
    dependsOn(subprojects.map { "${it.path}:build" })
    group = "build"
    description = "Build all modules"
}