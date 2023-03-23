import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.0.4"
	id("io.spring.dependency-management") version "1.1.0"
	kotlin("jvm") version "1.7.22"
	kotlin("plugin.spring") version "1.7.22"
}

group = "com.example"
version = "0.0.1"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {

	// camel
	implementation("org.apache.camel.springboot:camel-spring-boot-starter:4.0.0-M2")
	// "camel" http dependency. Component to do rest
	implementation("org.apache.camel:camel-undertow:4.0.0-M2")

	// jms queue and transaction manager
	implementation("org.messaginghub:pooled-jms")
	implementation("org.apache.camel:camel-jms:4.0.0-M2")
	implementation("org.apache.qpid:qpid-jms-client:2.2.0")

	//implementation("org.apache.camel:camel-amqp-starter:3.0.0-M4")
	testImplementation("org.springframework.boot:spring-boot-starter-artemis:3.0.4")

	// no idea what these are for
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}
/*
dependencies {

	implementation("org.apache.camel:camel-core")
	implementation("org.springframework.boot:spring-boot-autoconfigure")

	implementation("org.springframework.boot:spring-boot-starter-web") {
		exclude("org.springframework.boot", "spring-boot-starter-tomcat")
	}
	implementation("org.springframework.boot:spring-boot-starter-undertow")

	implementation("org.apache.camel:camel-spring-boot-starter:2.25.4")

	implementation("org.jetbrains.kotlin:kotlin-reflect")
	testImplementation("org.springframework.boot:spring-boot-starter-test")

	// fusePlugin
	//implementation(platform("org.jboss.redhat-fuse:fuse-springboot-bom:7.4.0.fuse-sb2-740019-redhat-00005"))

	// amqp
	//implementation("org.apache.camel:camel-amqp-starter:2.25.4")

	// implementation("org.apache.camel:camel-amqp-starter")
	//implementation("org.apache.qpid:qpid-jms-client")

	// jms
	//implementation("org.messaginghub:pooled-jms")
	//testImplementation("org.apache.activemq:artemis-junit:2.22.0")

}
*/
tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
