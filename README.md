# xayn_front_office_sdk

Front Office API
- API version: 1.0.0-rc6
  - Build date: 2022-12-22T15:18:19.011679Z[Etc/UTC]

# Front Office
The system identifies a user with only an id.
There are two main endpoints: one that allows registering an interaction between a user and a document (a user clicked or liked a document), and one to retrieve a personalized set of documents for the user. The system needs a few user interactions with documents before it can generate a personalized list.

# Auth
To authenticate with the API, a token will be provided.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.xayn</groupId>
  <artifactId>xayn_front_office_sdk</artifactId>
  <version>1.0.15</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'xayn_front_office_sdk' jar has been published to maven central.
    mavenLocal()       // Needed if the 'xayn_front_office_sdk' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.xayn:xayn_front_office_sdk:1.0.15"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/xayn_front_office_sdk-1.0.15.jar`
* `target/lib/*.jar`

