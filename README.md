# quarkus-eclipse-reproducer project

### 2. Defining the http root path broken with Quarkus 1.4.0.Final (own mistake - fixed - but was a nice issue number)

There was no issue with Quarkus but with the quarkus versions in my own pom.xml :/

[Issue #8888](https://github.com/quarkusio/quarkus/issues/8888)



### 1. reproduce Eclipse Maven Settings issue (fixed now)

[Issue #7932](https://github.com/quarkusio/quarkus/issues/7932) with quarkus-1.3.0-Final running in eclipse

__Update 20.04.2020__

The issue could be resolved by restoring the default maven settings.

## Prerequisites

__quarkus version__

1.3.0.-Final

__Eclipse version__

Version: 2019-12 (4.14.0)
Build id: 20191212-1212

__maven version (embedded)__

3.6.3/1.14.0.20191209-1923

__m2e__

m2e - Maven Integration for Eclipse (includes Incubating components) 1.14.0.20191209-1925


__Building the project locally__

After cloning the repository, on the command line run

	cd own-artifact
	mvn install


This installes a dependency for quarkus-hello to your local repository

__Check if quarkus-hello starts fine from the command line__

	cd quarkus-hello
	mvn clean quarkus:dev

## Steps to reproduce

Import quarkus-hello into eclipse.

Configure a new maven run configuration with goal

	clean quarkus:dev

Start this run configuration.

## Error

You will see the following [stack trace](./m2e-stacktrace.txt).

Even though the dependency de.egladil.web:own-artifact:jar:1.0.0 is installed in the local repository quarkus will attempt to download this dependency from https://repo.maven.apache.org/maven2.

Running in offline modus does not change this behaviour


