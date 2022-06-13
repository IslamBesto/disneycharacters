plugins {
    kotlin("jvm")
    kotlin("kapt")
    kotlin("plugin.serialization")
}

dependencies {
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
    implementation(libs.kotlin.serialization)
    implementation(libs.kotlin.coroutines.core)
    implementation(libs.retrofit)
    implementation(libs.retrofit.converter.kotlinSerialization)
    implementation(libs.okHttp.loggingInterceptor)

    testImplementation(libs.testing.junit)
    testImplementation(libs.testing.mockk)
    testImplementation(libs.testing.mockWebServer)
    testImplementation(libs.kotlin.test)
    testImplementation(libs.kotlin.coroutines.test)
}