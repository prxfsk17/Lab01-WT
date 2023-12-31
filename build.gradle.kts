import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("java")
	id("application")
}

group = "org.example"
version = "v" + LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

repositories {
	mavenCentral()
}

dependencies {
	testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
	testImplementation(project(":"))
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

application {
	mainClass = "by.bsuir.prxfsk17.lab1.task9.Task9"
}

tasks {
	test {
		useJUnitPlatform()
	}
	jar {
		manifest {
			attributes(mapOf("Main-Class" to "by.bsuir.prxfsk17.lab1.task9.Task9"))
		}
		duplicatesStrategy = DuplicatesStrategy.EXCLUDE
	}
	withType<JavaCompile>().configureEach {
		options.encoding = "UTF-8"
	}
}