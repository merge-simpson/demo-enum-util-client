plugins {
    id("java")
}

group = "me.letsdev"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") } // added
}

dependencies {
    implementation("com.github.merge-simpson:enum-util:0.1.0") // added
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<JavaExec> {
    // `-ea`는 테스트 실행 시 대부분 포함됩니다. (일반 실행 시 assert 코드는 실행이 생략되어 성능을 보장합니다.)
    //  * 이 데모 프로젝트는 테스트 코드가 아닌 메인 실행에 `-ea`를 추가하였습니다.
    jvmArgs = listOf("-ea") // not for production
}