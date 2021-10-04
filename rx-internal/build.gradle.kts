plugins {
    id("kotlin-multiplatform")
    id("com.android.library")
    id("com.arkivanov.gradle.setup")
}

setup {
    multiplatform()
    multiplatformPublications()
}

kotlin {
    sourceSets {
        named("commonMain") {
            dependencies {
                implementation(project(":rx"))
                implementation(project(":utils-internal"))
            }
        }
    }
}