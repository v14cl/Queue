# Queue

## Description

This project designed to make a queue as a data storage based on array.

## Interface

Queue constructor takes the container `size` and `data_type`  (depending on it you will choose the methods).  

```java
Queue(int size, DataType data_type);
```

Data type enum values:

```java
enum DataType {
    CHAR,
    INT,
    DOUBLE
}
```

The description of the Queue class methods:

1. Put methods

+ `put_char` - method saves a char value into the queue  

```java
void put_char(char value);
```
 + `put_int` - method saves an int value into the queue  

```java
void put_int(int value);
```
 + `put_double` - method saves a double value into the queue  

```java
void put_double(double value);
```
2. Get methods
+ `get_char` - method returns a char value from the queue  

```java
char get_char()
```
+  `get_int` - method returns an int value from the queue  

```java
int get_int()
```
+  `get_double` - method returns an double value from the queue  

```java
double get_double()
```

## Build and run

To build and run the project use:
```bash
./bar.sh
```

This script consists of the next commands:

```bash
mvn package
java -cp target/Queue-1.0.jar com.testproj.app.App
```
