plugins {
    id : 'java';
}

repositories {
    mavenCentral()
}

dependencies {
    implementation 'com.fasterxml.jackson.core:jackson-databind:2.13.0'
    implementation 'javax.xml.bind:jaxb-api:2.3.1'
    implementation 'org.glassfish.jaxb:jaxb-runtime:2.3.3'
}
