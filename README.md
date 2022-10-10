# Gatling performance test
Gatling script used for performance testing.

## Dependencies
List of dependencies required to execute this boilerplate performance test

* Gradle
* Java 8

## IDE support
Intellij IDEA has the better Kotlin support than Vscode
## Getting started
To get started, simply follow these simple steps to execute / modify the scripts:

##### 1. Clone the repository

##### 2. Run Gatling tests with command-line console

Open command line and navigate to the gatling-performance-test script folder, and run the following command to run all the simulations:

``` ms-dos
gradle gatlingRun
```

If particular simulation need to be excecuted, run the following command line:

``` ms-dos
gradle gatlingRun-SimulationFQN(e.g. gradle gatlingRun-simulations.SearchProductSimulation)
```

##### 3. Reports

Every time after a gatlingRun is excecuted, a report folder will be generated under:
```

├── build
|  ├── reports
|  ├──   ├── gatling
```
```index.html``` is the main report page
## Folder structure
After cloning this repository this is the file structure:

```

├── src/gatling
|  ├── kotlin
|  ├── ├── requests
|  ├── ├── ├── scenarios
|  ├── ├── ├── ├── [scenarios].kt
|  ├── ├── ├── httpProtocal.kt
|  ├── ├── simulations
|  ├── ├── ├── [simulations].kt
|  ├── resources
|  ├── ├── [testData].csv
├── build.gradle
```

* **[scenarios].kt** files - These are request files for http request and some assertion, can be defined in the main simulation file, but better to be extracted into separate files for isolation
* **httpProtocal.kt** file - This is the file for http protocol, still, better to be extracted into a separate file
* **[simulations].kt** files - This is the main file which will be executed for performance test
* **[testData].csv** files - These are the test data files which can be injected to virtual users using feeder