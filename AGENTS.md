# Agent Instructions

## Project

- This is a small Maven Java project targeting Java 17.
- Use the standard Maven layout: production code is under `src/main/java`, tests under `src/test/java`.
- Keep production and test classes in the `com.example` package unless the task requires a package change.
- Treat `target/` as generated output; do not use it as a source of truth or edit it directly.

## Validation

Run commands from the repository root with the Maven Wrapper:

```powershell
.\mvnw.cmd test
.\mvnw.cmd package
.\mvnw.cmd checkstyle:check
```

Use `test` for focused behavior changes, `package` for compile/package validation, and `checkstyle:check` for formatting and style validation. The Checkstyle configuration is [config/checkstyle/google_checks.xml](config/checkstyle/google_checks.xml), with a 100-character Java line limit.

## Coding Conventions

- Follow Google Java Style and the existing formatting in nearby files.
- Use UTF-8 source files and explicit imports.
- Add or update focused JUnit Jupiter tests in `src/test/java` for behavior changes.
- Preserve the existing Maven configuration and dependency versions unless the task specifically requires changing them.
- Prefer the smallest change that satisfies the request; avoid unrelated refactors.

## Key Files

- [pom.xml](pom.xml): Maven coordinates, Java release, dependencies, plugins, and Checkstyle configuration.
- [src/main/java/com/example/App.java](src/main/java/com/example/App.java): application entry point.
- [src/main/java/com/example/Calculator.java](src/main/java/com/example/Calculator.java): arithmetic service example.
- [src/test/java/com/example/AppTest.java](src/test/java/com/example/AppTest.java): JUnit test example.
