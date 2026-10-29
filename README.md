# University Student Management System

A starter template for the **University Student Management System** capstone: a menu-driven Java console application that manages students, instructors, courses, and enrollments end to end.

## Requirements

- JDK 17 or later
- Maven 3.9 or later

## Build and run

```bash
mvn test          # run the unit tests
mvn package       # build target/student-management.jar
java -jar target/student-management.jar
```

The application opens a small menu you can use to check that the starter runs. Every feature is still to be built - the tickets on the board tell you exactly what to add and in which order.

## Project structure

```
src/main/java/com/archis/studentmgmt/
  App.java           entry point
  ui/                menu and user interaction
  service/           business logic (enrollments, rules)
  model/             domain classes and enums
  repository/        data storage
  util/              id generator and formatting helpers
  exception/         custom exceptions
src/test/java/       JUnit 5 tests
```

## Working conventions

- Never push directly to the default branch (`main`) - every piece of work lands through a pull request.
- Open one PR per ticket. PR title: `T<nn>: <summary>`.
- Feature branches only. Branch naming: `feat/T<nn>-<slug>`.
- Commit format: `[SM-<TASK_ID>] - <type>: <message>` (for example `[SM-4] - feat: modeled the course class with validation`).
- Commit types: `feat`, `fix`, `refactor`, `docs`, `test`, `chore`.
- Data saved by the application lives in the `data/` directory (ignored by Git).