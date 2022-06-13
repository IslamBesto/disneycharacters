apply plugin: 'dagger.hilt.android.plugin'
apply plugin: 'com.android.application'

hilt {
    enableAggregatingTask = true
}

dependancies {
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
}