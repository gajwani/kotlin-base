Kotlin Base Starter Project
===

This is an attempt to create a sane starter project for 
Kotlin developers.

## Goals:
- Sensible defaults
- Testing framework choices: JUnit4, 5, Spek
- Standard filesystem structure
- Understandable Gradle configuration
- Works in IntelliJ and from the command line
- Sensible workflow

## Usage
1. Clone the repository
1. Change the folder name
1. Change the package names under `src/main/java` and `src/main/kotlin`
1. Update dependency versions in the `build.gradle` (all provided at the top as variables)
1. Clean out this README

## Recommended Conventions
- Domain-specific package names (as opposed to layers like `controllers`, `models`, etc.)

## Open questions
- Include web-specific defaults?

## ToDo
- [X] Include Spek
- [X] Include Gradle wrapper
- [X] Include sample code in default directories
- [ ] Test run report
- [ ] Run individual tests in IntelliJ with keyboard shortcuts
- [ ] Spring
- [ ] Spring integration tests
- [ ] Include notes on how to JARify projects
