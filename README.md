# Electrostatic-sandbox-framework

This framework houses a standardization as a sandbox for the workstation abstracting the following: 
- Digital Communication Protocols.
- File Systems APIs.
- Memory Manipulation APIs.
- Other Operating System APIs.

This framework has 2 environments and provides binaries for 2 devices:
- The main board.
- The externally pluggable modular boards.

## Hardware-Software Specification:

| **Item** | **Explanation** |
|--------|---------------|
| _Problem Definition_ | General definition and objectification |
| _Scientific Recall of the problem_ | Use the Set Theory, the Group Theory, predicate calculus, and the FSM computational model (Scientific Modelling of the problem). |
| _General Approach_ | General approach. |
| _Specialized Approach_ | Highly specialized approach from this project that differentiate it among others. |
| _Scientific Approach_ | Use the Set Theory, the Group Theory, predicate calculus, and the FSM computational model (Scientific Modelling of the approach). |
| _The Framework components_ | Decompose the framework into components and relations; such that, the components model the structural aspect of the framework and the relations, which deemed to be components as well, deal with the behavioral aspect of the framework. |

## The framework parts:
**The Native Electrostatic API**
- electrostatic-core: provides the core of the electrostatic framework written purely in C.
- electrostatic-examples: provides direct examples in the form of executables for the core API.

**The Java Binding API (Electrostatic4j aka. _e4j_)**
- electrostatic4j-core: the core Java binding API, containing the native image loader and the binding Java side of the glue code.
- electrostatic4j-native: the native Java binding API, containing the glue code written purely in C.
- electrostatic4j-examples: implicit examples for the electrostatic API through the Java binding API.
- electrostatic4j-android: android glue code (not planned!).

## Architectural diagrams (component-based, sequential (FSM), and deployment):
- Distributed-simulation/Broker system: comm_protocols stream-based or raw-buffer-based APIs and the Slave APIs.
- Byte-flow Architectural Pattern: the comm API and its dependencies.
- Hierarchial Architectural Pattern: the JNI Glue code.

## Detailed-design diagrams (class-based, object-based, and FSM):

## Building the framework: 
- [x] Building the `electrostatic-core` module into a static and a dynamic library:
```bash
$ ./helper-scripts/project-impl/compile-all.sh
```
- [x] Building the `electrostatic-examples` module into an executable and linking with the `electrostatic-core` binaries:
```bash
$ ./helper-scripts/project-impl/compile-examples.sh "x86-64" "hello_comm.c"
$ ./helper-scripts/project-impl/compile-examples.sh "x86" "hello_comm.c"
$ ./electrostatic-examples/build/x86-64/hello_comm.c.elf
$ ./electrostatic-examples/build/x86/hello_comm.c.elf
```
- [x] Building the `electrostatic4j` library and runtime linking:
```bash
$ ./helper-scripts/ci-cd/compile-e4j.sh "$(pwd)/electrostatic-core"
```
- [x] Running the `electrostatic4j-examples` examples:
```bash
$ ./helper-scripts/ci-cd/test-e4j.sh
```


