# WEB TECHNOLOGY

## Introduction to Java

### 1) Java and Java applications
Java is a high-level, class-based, OOP that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let programmers write once, run anywhere.

#### Applications

1. **Mobile Applications**
   - Java is considered the official programming language for mobile app development. It is compatible with software such as Android Studio and Kotlin. Spotify and Twitter are developed using Java.
2. **Desktop GUI Applications**
   - We can develop a GUI application using Java. Java provides Abstract Windowing Toolkit (AWT), Swing, and JavaFX for developing GUI-based applications. The tools contain pre-assembled components.
3. **Web-based Applications**
   - Java is used for developing web-based applications because it provides vast support for web development through servlet, JSP, and struts. This is why Java is known as a server-side programming language.
4. **Game Development**
   - Java is widely used by game development companies because it has the support of the open-source's most powerful 3D engine. The engine provides unparalleled capacity when it comes to the development of games.
5. **Big Data Technology**
   - The tool HADOOP HDFS Platform for processing and storing big data applications is written in Java. In big data, Java is widely used in ETL applications such as Apache games.
6. **Distributed Applications**
   - The Java Intelligence Networking Infrastructure (JINI) provides infrastructure to register and find distributed services based on its specification. It implements a mechanism that is known as leasing.
7. **Cloud-based Applications**
   - We can use Java to develop cloud-based applications. We can use Java to develop SaaS (Software as a Service), IaaS (Infrastructure as a Service), and PaaS (Platform as a Service).
8. **IoT Applications**
   - IoT is a technology that connects devices in its network and communicates with them. IoT has found applications in almost all small devices such as health gears, smartphones, wearables, etc.

### 2) Java Virtual Machine
Java Virtual Machine (JVM) is a virtual machine that enables a computer to run Java programs as well as programs written in other languages that are also compiled to Java bytecode.

The virtual machine code is not machine-specific. The machine-specific code (known as machine code) is generated by the Java interpreter by acting as an intermediary between the virtual machine and the hardware.

### 3) Java Runtime Environment
Java Runtime Environment (JRE) is part of the Java Development Kit (JDK), that contains a set of tools and minimum requirements for executing a Java application. The JDK along with JVM and JRE can be installed to run Java applications.

### 4) Bytecode
Bytecode can be defined as an intermediate code generated by the compiler after the compilation of the source code (Java program). Intermediate code makes Java a platform-independent language.

#### How is Bytecode generated?
- The compiler converts the source code of the Java program into Bytecode (or machine code). Secondly, the interpreter executes the bytecode on the system. The interpreter can also be called JVM (Java Virtual Machine).

#### Advantage
- Bytecode eliminates the need to recompile source code for each target platform. Although the interpreter differs between platforms, the application's bytecode does not. This approach lets each system run the bytecode without modification.

#### Example
When an application is written in Java, the Java compiler converts the source code to bytecode, outputting the bytecode to a CLASS file. The CLASS file is then read and processed by a Java Virtual Machine (JVM).

## Features of Java
The primary objective of Java programming language creation was to make it a portable, simple, and secure programming language. Additional Java features are as follows:

1. **Simple**
   - Java is easy to learn and its syntax is simple, clean, and easy to understand. Java has removed many complicated and rarely used features, for example, explicit pointers, operator overloading, etc.
2. **Object-Oriented**
   - Java is an OOP language. Everything in Java is an object. Object-Oriented means we organize our software as a combination of different types of objects that incorporate both data and behavior.
3. **Platform-Independent**
   - Java is platform-independent because it is different from other languages like C, C++, etc which are compiled into platform-specific machines while Java is a write once, run anywhere language.
     - Software-based platform
     - Hardware-based platforms
   - The Java platform differs from most other platforms in the sense that it is a software-based platform that runs on top of other hardware-based platforms. It has two components:
     - Runtime Environment
     - API (Application Programming Interface)
   - Java code can be executed on multiple platforms, for example, Windows, Linux, Mac, OS, etc. Java code is compiled by the compiler and converted into bytecode. This bytecode is a platform-independent code.
4. **Secured**
   - Java is best known for its security. With Java, we can develop virus-free systems. Java is secured because:
     - No explicit pointer.
     - Java programs run inside a virtual machine sandbox.
   - **ClassLoader**: Java is a part of the JRE, which is used to load Java classes into JVM dynamically. It adds security by separating the package for the classes of the local file system from those that are imported from network sources.
   - **Bytecode Verifier**: It checks the code fragments for illegal code that can violate access rights to objects.
   - **Security Manager**: It determines the resources a class can access, such as reading and writing to the local disk.
5. **Robust**
   - Java is robust because:
     - It uses strong memory management.
     - There is a lack of pointers that avert security problems.
     - Java provides automatic garbage collection which runs on the JVM to get rid of the objects which are not being used by Java applications anymore.
     - There are exception handling and type-checking mechanisms in Java.
6. **Architecture-neutral**
   - Java is architecture-neutral because there are no implementation-dependent features, for example, the size of primitive types is fixed. In C programs, the int data type occupies 2 bytes of memory for 32-bit architecture and 4 bytes of memory for 64-bit architecture.
7. **Portable**
   - Java is portable because it facilitates us to carry the Java bytecode to any platform. It doesn't require any implementation.
8. **High-Performance**
   - Java is faster than any other traditional interpreted programming language because Java bytecode is "close" to native code. As Java is an interpreted language, it's slower than compiled languages, e.g., C, C++, etc.
9. **Distributed**
   - Java is distributed because it facilitates users to create distributed applications in Java. RMI and EJB are used to create those. This feature of Java makes us able to access files by calling methods from any machine on the internet.
10. **Multi-threaded**
    - A thread is like a separate program, executing concurrently. We can write Java programs that deal with many tasks at once by defining multiple threads. The main advantage of multi-threading is that it utilizes the same memory and other resources to execute multiple threads simultaneously.
11. **Dynamic**
    - Java is a dynamic language. It supports the dynamic loading of classes. It means classes are loaded on demand. It also supports functions from its native languages, that is C and C++.
