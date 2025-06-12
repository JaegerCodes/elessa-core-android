plugins {
    id("llamasoft.android.library")
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.llamasoft.elessa.core.model"

    defaultConfig {
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {

}
