pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()

        maven {
            url = uri("https://ad4f-179-6-6-210.ngrok-free.app/artifactory/libs-release-local")
            credentials {
                username = "admin"
                password = "P7WxdLiZKSWD2yf"
            }
        }
    }

    resolutionStrategy {
        eachPlugin {
            if (requested.id.namespace == "llamasoft") {
                useModule("com.llamasoft.elessa.buildlogic:convention:${requested.version ?: "0.0.1"}")
            }
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "elessa-core"
