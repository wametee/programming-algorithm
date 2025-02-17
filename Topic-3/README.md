# Java Enumeration Type Wrappers: Boxing, Unboxing, Autoboxing, Autounboxing

## Table of Contents
1. [Objectives](#objectives)
2. [Introduction](#introduction)
3. [Boxing](#boxing)
4. [Unboxing](#unboxing)
5. [Autoboxing](#autoboxing)
6. [Autounboxing](#autounboxing)
7. [Real World Scenarios](#real-world-scenarios)

## Objectives
- Understand the concept of boxing and unboxing in Java.
- Learn about autoboxing and autounboxing and their advantages.
- Explore the use cases and scenarios where boxing and unboxing are applicable.
- Apply these concepts in real-world Java programming.

## Introduction
Java provides wrapper classes for all primitive data types. These wrapper classes allow primitive data types to be treated as objects. The process of converting a primitive type to its corresponding wrapper class object is called boxing, and the reverse process is called unboxing. Java also supports autoboxing and autounboxing, where the conversion between primitive types and their wrapper classes occurs automatically.

## Boxing
Boxing is the process of converting a primitive type into its corresponding wrapper class object. This is useful when a primitive type needs to be treated as an object, such as when storing values in collections like `ArrayList`.

#### Example:
```java
int primitiveValue = 5;
Integer boxedValue = Integer.valueOf(primitiveValue); // Boxing
```

## Unboxing
Unboxing is the process of converting a wrapper class object back into its corresponding primitive type. This is necessary when performing arithmetic operations or other operations that require primitive types.

#### Example:
```java
Integer boxedValue = Integer.valueOf(5);
int primitiveValue = boxedValue.intValue(); // Unboxing
```

## Autoboxing
Autoboxing is the automatic conversion of a primitive type to its corresponding wrapper class object by the Java compiler. This simplifies the code and reduces the need for explicit boxing.

#### Example:
```java
int primitiveValue = 10;
Integer boxedValue = primitiveValue; // Autoboxing
```

## Autounboxing
Autounboxing is the automatic conversion of a wrapper class object back to its corresponding primitive type by the Java compiler. This simplifies the code and reduces the need for explicit unboxing.

#### Example:
```java
Integer boxedValue = Integer.valueOf(10);
int primitiveValue = boxedValue; // Autounboxing
```

## Real World Scenarios

### Scenario 1: Using Collections
When working with collections like `ArrayList`, which can only store objects, autoboxing and autounboxing are essential for storing and retrieving primitive values.

#### Example:
```java
ArrayList<Integer> list = new ArrayList<>();
int num = 5;
list.add(num); // Autoboxing
int retrievedNum = list.get(0); // Autounboxing
```

### Scenario 2: Generic Methods
Generic methods often require objects instead of primitive types. Autoboxing and autounboxing simplify the use of generics with primitive values.

#### Example:
```java
public static <T> void print(T value) {
    System.out.println(value);
}

int num = 20;
print(num); // Autoboxing
```

### Scenario 3: Working with Streams
Java 8 introduced the Stream API, which often involves processing collections of objects. Autoboxing and autounboxing make it easier to work with streams when dealing with primitive values.

#### Example:
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int sum = numbers.stream().mapToInt(Integer::intValue).sum(); // Autounboxing
```

### Scenario 4: Mathematical Operations
When performing mathematical operations on values stored in collections, autounboxing allows for seamless conversion to primitive types.

#### Example:
```java
ArrayList<Integer> list = new ArrayList<>();
list.add(10); // Autoboxing
list.add(20); // Autoboxing

int sum = 0;
for (int num : list) {
    sum += num; // Autounboxing
}
System.out.println("Sum: " + sum);
```

### Scenario 5: Database Operations
When retrieving data from a database, the results are often in object form. Autounboxing makes it easier to convert these objects back to primitive types for further processing.

#### Example:
```java
Integer dbValue = getValueFromDatabase(); // Assume this method returns an Integer
int value = dbValue; // Autounboxing
System.out.println("Retrieved value: " + value);
```
