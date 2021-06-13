object Versions {
    val marathon = System.getenv("DEPLOY_VERSION_OVERRIDE") ?: "0.7.0"

    val kotlin = "1.4.31"
    val coroutines = "1.3.9"

    val ddmlib = "27.1.2"
    val adam = "0.2.5"
    val dexTestParser = "2.1.1"
    val kotlinLogging = "1.7.6"
    val slf4jAPI = "1.0.0"
    val logbackClassic = "1.2.3"
    val axmlParser = "1.0"
    val bugsnag = "3.6.1"
    val asm = "9.1"
    val clikt = "3.1.0"

    val grpc = "1.34.1"
    val grpcKotlin = "1.0.0"
    val protobufGradle = "0.8.14"
    val protobuf = "3.14.0"

    val junitGradle = "1.0.0"
    val androidGradleVersion = "4.0.0"

    val junit5 = "5.7.2"
    val junit5launcher = "1.7.2"
    val kluent = "1.64"

    val kakao = "1.4.0"
    val espresso = "3.0.1"
    val espressoRules = "1.0.1"
    val espressoRunner = "1.0.1"
    val junit = "4.13.2"
    val gson = "2.8.5"
    val apacheCommonsText = "1.3"
    val apacheCommonsIO = "2.6"
    val influxDbClient = "2.13"
    val argParser = "2.0.7"
    val jacksonDatabind = "2.9.5"
    val jacksonKotlin = "2.9.4.1"
    val jacksonYaml = "2.9.6"
    val jacksonJSR310 = "2.9.6"
    val ddPlist = "1.21"
    val guava = "26.0-jre"
    val rsync4j = "3.1.2-12"
    val sshj = "0.26.0"
    val testContainers = "1.15.3"
    val jupiterEngine = "5.1.0"
    val jansi = "1.17.1"
    val scalr = "4.2"
    val allureJava = "2.8.1"
    val allureKotlin = "2.1.2"
    val allureEnvironment = "1.0.0"
    val mockitoKotlin = "2.0.0"
    val googleAnalitycsWrapper = "2.0.0"
    val dokka = "0.9.17"
    val koin = "2.0.1"
    val jsonAssert = "1.5.0"
    val xmlUnit = "2.6.3"
    val assertk = "0.19"
}

object BuildPlugins {
    val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    val junitGradle = "org.junit.platform:junit-platform-gradle-plugin:${Versions.junitGradle}"
    val androidGradle = "com.android.tools.build:gradle:${Versions.androidGradleVersion}"
    val dokka = "org.jetbrains.dokka:dokka-gradle-plugin:${Versions.dokka}"
}

object Libraries {
    val ddmlib = "com.android.tools.ddms:ddmlib:${Versions.ddmlib}"
    val adam = "com.malinskiy:adam:${Versions.adam}"
    val androidCommon = "com.android.tools:common:${Versions.ddmlib}"
    val dexTestParser = "com.linkedin.dextestparser:parser:${Versions.dexTestParser}"
    val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    val kotlinStdLibCommon = "org.jetbrains.kotlin:kotlin-stdlib-common:${Versions.kotlin}"
    val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
    val kotlinLogging = "io.github.microutils:kotlin-logging:${Versions.kotlinLogging}"
    val slf4jAPI = "ch.frankel.log4k:slf4k-api:${Versions.slf4jAPI}"
    val logbackClassic = "ch.qos.logback:logback-classic:${Versions.logbackClassic}"
    val kotlinCoroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    val axmlParser = "com.shazam:axmlparser:${Versions.axmlParser}"
    val gson = "com.google.code.gson:gson:${Versions.gson}"
    val apacheCommonsText = "org.apache.commons:commons-text:${Versions.apacheCommonsText}"
    val apacheCommonsIO = "commons-io:commons-io:${Versions.apacheCommonsIO}"
    val influxDbClient = "org.influxdb:influxdb-java:${Versions.influxDbClient}"
    val argParser = "com.xenomachina:kotlin-argparser:${Versions.argParser}"
    val jacksonDatabind = "com.fasterxml.jackson.core:jackson-databind:${Versions.jacksonDatabind}"
    val jacksonAnnotations = "com.fasterxml.jackson.core:jackson-annotations:${Versions.jacksonDatabind}"
    val jacksonKotlin = "com.fasterxml.jackson.module:jackson-module-kotlin:${Versions.jacksonKotlin}"
    val jacksonYaml = "com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:${Versions.jacksonYaml}"
    val jacksonJSR310 = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310:${Versions.jacksonJSR310}"
    val ddPlist = "com.googlecode.plist:dd-plist:${Versions.ddPlist}"
    val guava = "com.google.guava:guava:${Versions.guava}"
    val rsync4j = "com.github.fracpete:rsync4j-all:${Versions.rsync4j}"
    val sshj = "com.hierynomus:sshj:${Versions.sshj}"
    val jansi = "org.fusesource.jansi:jansi:${Versions.jansi}"
    val scalr = "org.imgscalr:imgscalr-lib:${Versions.scalr}"
    val allure = "io.qameta.allure:allure-java-commons:${Versions.allureJava}"
    val allureEnvironment = "com.github.automatedowl:allure-environment-writer:${Versions.allureEnvironment}"
    val allureKotlinCommons = "io.qameta.allure:allure-kotlin-commons:${Versions.allureKotlin}"
    val koin = "org.koin:koin-core:${Versions.koin}"
    val bugsnag = "com.bugsnag:bugsnag:${Versions.bugsnag}"
    val asm = "org.ow2.asm:asm:${Versions.asm}"
    val clikt = "com.github.ajalt.clikt:clikt:${Versions.clikt}"
    val protobufLite = "com.google.protobuf:protobuf-javalite:${Versions.protobuf}"
    val grpcKotlinStubLite = "io.grpc:grpc-kotlin-stub-lite:${Versions.grpcKotlin}"
    val grpcOkhttp = "io.grpc:grpc-okhttp:${Versions.grpc}"
    val grpcNetty = "io.grpc:grpc-netty:${Versions.grpc}"
}

object TestLibraries {
    val junit5 = "org.junit.jupiter:junit-jupiter:${Versions.junit5}"
    val junit5vintage = "org.junit.vintage:junit-vintage-engine:${Versions.junit5}"
    val junit5launcher = "org.junit.platform:junit-platform-launcher:${Versions.junit5launcher}"
    val kluent = "org.amshove.kluent:kluent:${Versions.kluent}"
    val kakao = "com.agoda.kakao:kakao:${Versions.kakao}"

    val junit = "junit:junit:${Versions.junit}"
    val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockitoKotlin}"
    val jupiterEngine = "org.junit.jupiter:junit-jupiter-engine:${Versions.jupiterEngine}"
    val koin = "org.koin:koin-test:${Versions.koin}"
    val jsonAssert = "org.skyscreamer:jsonassert:${Versions.jsonAssert}"
    val xmlUnit = "org.xmlunit:xmlunit-matchers:${Versions.xmlUnit}"
    val assertk = "com.willowtreeapps.assertk:assertk:${Versions.assertk}"

    val testContainers = "org.testcontainers:testcontainers:${Versions.testContainers}"
    val testContainersInflux = "org.testcontainers:influxdb:${Versions.testContainers}"
}

object Analytics {
    val googleAnalyticsWrapper = "com.brsanthu:google-analytics-java:${Versions.googleAnalitycsWrapper}"
}
