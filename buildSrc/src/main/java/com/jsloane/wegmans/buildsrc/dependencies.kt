/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jsloane.wegmans.buildsrc

object Versions {
    const val compileSdk = 30
    const val targetSdk = 30
    const val minSdk = 23
    const val buildTools = "30.0.3"
    const val ktlint = "0.41.0"
}

object Libs {
    const val androidGradlePlugin = "com.android.tools.build:gradle:7.0.0-beta03"
    const val jdkDesugar = "com.android.tools:desugar_jdk_libs:1.1.5"

    object Plugins {
        const val dependencyVersion = "com.github.ben-manes.versions"
        const val spotless = "com.diffplug.spotless"
    }

    object Accompanist {
        const val version = "0.11.1"
        const val coil = "com.google.accompanist:accompanist-coil:$version"
        const val insets = "com.google.accompanist:accompanist-insets:$version"
        const val pager = "com.google.accompanist:accompanist-pager:$version"
    }

    object Kotlin {
        private const val version = "1.5.10"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:$version"
    }

    object Coroutines {
        private const val version = "1.5.0"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
    }

    object OkHttp {
        private const val version = "4.9.1"
        const val okhttp = "com.squareup.okhttp3:okhttp:$version"
        const val logging = "com.squareup.okhttp3:logging-interceptor:$version"
    }

    object JUnit {
        private const val version = "4.13.2"
        const val junit = "junit:junit:$version"
    }

    object Google {
        private const val version = "1.3.0"
        const val material = "com.google.android.material:material:$version"

        private const val hiltVersion = "2.36"
        const val hiltPlugin = "com.google.dagger:hilt-android-gradle-plugin:$hiltVersion"
        const val hilt = "com.google.dagger:hilt-android:$hiltVersion"
        const val hiltKapt = "com.google.dagger:hilt-android-compiler:$hiltVersion"
    }

    object AndroidX {
        const val appcompat = "androidx.appcompat:appcompat:1.3.0"
        const val palette = "androidx.palette:palette:1.0.0"

        const val coreKtx = "androidx.core:core-ktx:1.6.0-beta02"

        object Activity {
            const val activityCompose = "androidx.activity:activity-compose:1.3.0-beta01"
        }

        object Constraint {
            const val constraintLayoutCompose = "androidx.constraintlayout:constraintlayout-compose:1.0.0-alpha07"
        }

        object Compose {
            const val version = "1.0.0-beta08"

            const val runtime = "androidx.compose.runtime:runtime:$version"
            const val foundation = "androidx.compose.foundation:foundation:${version}"
            const val layout = "androidx.compose.foundation:foundation-layout:${version}"

            const val ui = "androidx.compose.ui:ui:${version}"
            const val material = "androidx.compose.material:material:${version}"
            const val materialIconsExtended = "androidx.compose.material:material-icons-extended:${version}"

            const val tooling = "androidx.compose.ui:ui-tooling:${version}"
            const val junit = "androidx.compose.ui:ui-test-junit4:${version}"
        }

        object Lifecycle {
            private const val version = "2.3.1"
            const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha06"
            const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
        }

        object Test {
            private const val version = "1.3.0"
            const val core = "androidx.test:core:$version"
            const val rules = "androidx.test:rules:$version"

            object Ext {
                private const val version = "1.1.2"
                const val junit = "androidx.test.ext:junit-ktx:$version"
            }

            const val espressoCore = "androidx.test.espresso:espresso-core:3.3.0"
        }

        object Room {
            private const val version = "2.3.0"
            const val runtime = "androidx.room:room-runtime:${version}"
            const val ktx = "androidx.room:room-ktx:${version}"
            const val compiler = "androidx.room:room-compiler:${version}"
        }
    }

    object Rome {
        private const val version = "1.14.1"
        const val rome = "com.rometools:rome:$version"
        const val modules = "com.rometools:rome-modules:$version"
    }
}
