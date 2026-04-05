# Step-by-Step Guide to Project Creation

JUnit is a Java testing framework used to write and execute automated unit tests to ensure code quality and correctness.

## 1) Install JDK

* Install JDK on your system
* Set environment variables (`JAVA_HOME` and update `PATH`)
* Verify installation by running:

```bash
java --version
```

---

## 2) Create Maven Project

### 2.1 Download and Configure Maven

* Download Maven from the official website

* Extract the zipped folder

* Place it in `C:\` (e.g., `C:\apache-maven-3.x.x`)

* Set environment variables:

  * `MAVEN_HOME = C:\apache-maven-3.x.x`
  * Add `%MAVEN_HOME%\bin` to `PATH`

⚠️ Important:

* Do NOT use `C:\apache-maven\bin\`
* Using a trailing `\` can sometimes break command resolution due to PATH parsing issues
* Always use `C:\apache-maven\bin`

---

### 2.2 Verify Maven Installation

Run:

```bash
mvn -version
```

---

### 2.3 Create Maven Project

Run the command:

```bash
mvn archetype:generate
```

Then follow the steps:

* Type `maven-archetype-quickstart`

* Enter `1`

* Choose the version by entering the corresponding number

* Enter:

  * `groupId: com.example.automation`
  * `artifactId: selenium-framework`

* Press Enter to continue with default values (version & package)

* Enter 'Y'

---

### 2.4 Default Setup

* `pom.xml` will be created automatically
* JUnit dependency will be added by default

---

## 3) About POM.XML
| Tag / Element                            | Explanation                                              |
|------------------------------------------|----------------------------------------------------------|
| `<?xml version="1.0" encoding="UTF-8"?>` | Defines XML version and encoding format                  |
| `<project>`                              | Root element that defines this as a Apache Maven project |
| `<modelVersion>`                         | Specifies the POM model version used by Maven            |
| `<groupId>`                              | Unique identifier for the organization/project           |
| `<artifactId>`                           | Name of the project (final build artifact name)          |
| `<version>`                              | Project version (`SNAPSHOT` means development version)   |
| `<name>`                                 | Human-readable project name                              |
| `<url>`                                  | Optional project website                                 |
| `<properties>`                           | Section for reusable configuration values                |
| `<project.build.sourceEncoding>`         | Defines encoding for source files                        |
| `<maven.compiler.source>`                | Java version used to write code                          |
| `<maven.compiler.target>`                | Java version used to compile code                        |
| `<dependencies>`                         | Section to include external libraries                    |
| `<dependency>`                           | Defines an individual dependency                         |
| `groupId (dependency)`                   | Specifies dependency provider (e.g., JUnit)              |
| `artifactId (dependency)`                | Name of the dependency                                   |
| `version (dependency)`                   | Version of the dependency                                |
| `<scope>`                                | Defines when dependency is used (e.g., test only)        |
| `<build>`                                | Contains build-related configurations                    |
| `<pluginManagement>`                     | Defines plugin versions/configs without executing them   |
| `<plugins>`                              | Holds list of plugins                                    |
| `<plugin>`                               | Defines a specific plugin                                |
| `groupId (plugin)`                       | Specifies plugin provider                                |
| `artifactId (plugin)`                    | Name of the plugin (e.g., Surefire)                      |
| `version (plugin)`                       | Version of the plugin                                    |

## Final Output

* Maven project is created successfully
* Standard folder structure is generated
* Project is ready for development


## About settings.json

{
  "java.configuration.updateBuildConfiguration": "interactive"
}

It controls how VS Code updates project configuration (like Maven/Gradle changes).

## surefire-reports

Running mvn test automatically generates .xml and .txt reports, which capture the test execution results similar to what you see in the console.

## **/*.java

**/*.java means “search all folders recursively and include every .java file.”

## If your file name doesn’t end with Test, configure it in pom.xml

<configuration>
  <includes>
    <include>**/*.java</include>
  </includes>
</configuration>

This ensures all .java files are considered during test execution, even if they don’t follow the default naming convention.

## BeforeAll & AfterAll method should be static 

@BeforeAll and @AfterAll must be static because they run outside the lifecycle of test instances, so JUnit needs class-level methods that don’t depend on objects.

Alternative way is to add > @TestInstance(TestInstance.Lifecycle.PER_CLASS)

PER_CLASS shares one object across all test methods in the same class, so changes in one test can affect others—but it does not impact other test classes.