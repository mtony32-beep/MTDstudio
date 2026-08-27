plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.mtdstudio.app"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.mtdstudio.app"
        minSdk = 24
        targetSdk = 34
        versionCode = 100
        versionName = "1.0"
    }
    buildTypes {
        debug { isMinifyEnabled = false }
        release { isMinifyEnabled = false }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}
dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.android.material:bottomnavigationview:1.11.0")
}
