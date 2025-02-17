# Arrays: Initializing, Assigning, Indexing, Using Loops, Merging, and Resizing

## Table of Contents
1. [Objectives](#objectives)
2. [Introduction](#introduction)
3. [Initializing Data](#initializing-data)
4. [Assigning Data](#assigning-data)
5. [Array Index](#array-index)
6. [Using For Loop to Read and Write into an Array](#using-for-loop-to-read-and-write-into-an-array)
7. [Merging Data](#merging-data)
8. [Resizing the Array](#resizing-the-array)
9. [Real World Scenarios](#real-world-scenarios)

## Objectives
- Understand how to initialize and assign data to arrays.
- Learn how to access and manipulate array elements using their indices.
- Explore the use of loops to read from and write into arrays.
- Study techniques for merging arrays and resizing them.
- Apply these concepts in real-world programming tasks.

## Introduction
Arrays are fundamental data structures used to store collections of elements. They provide a simple and efficient way to store and access multiple values of the same type. This document covers various aspects of working with arrays, including initializing data, assigning data, using array indices, reading and writing with loops, merging arrays, and resizing arrays.

## Initializing Data
Arrays can be initialized in several ways depending on the programming language. The most common methods are using array literals and explicit array creation.

### Example:
```python
# Python
numbers = [1, 2, 3, 4, 5]

# JavaScript
let numbers = [1, 2, 3, 4, 5];

# C++
int numbers[] = {1, 2, 3, 4, 5};

# Java
int[] numbers = {1, 2, 3, 4, 5};
```

## Assigning Data
Data can be assigned to array elements using their indices. An array index starts from 0 and goes up to the array's length minus one.

### Example:
```python
# Python
numbers = [0] * 5
numbers[0] = 10
numbers[1] = 20

# JavaScript
let numbers = new Array(5);
numbers[0] = 10;
numbers[1] = 20;

# C++
int numbers[5];
numbers[0] = 10;
numbers[1] = 20;

# Java
int[] numbers = new int[5];
numbers[0] = 10;
numbers[1] = 20;
```

## Array Index
Array indices are used to access elements in an array. The index must be within the array's bounds, otherwise, an exception or error will be thrown.

### Example:
```python
# Python
numbers = [1, 2, 3, 4, 5]
first_element = numbers[0]
last_element = numbers[-1]

# JavaScript
let numbers = [1, 2, 3, 4, 5];
let firstElement = numbers[0];
let lastElement = numbers[numbers.length - 1];

# C++
int numbers[] = {1, 2, 3, 4, 5};
int firstElement = numbers[0];
int lastElement = numbers[4];

# Java
int[] numbers = {1, 2, 3, 4, 5};
int firstElement = numbers[0];
int lastElement = numbers[numbers.length - 1];
```

## Using For Loop to Read and Write into an Array
For loops are commonly used to iterate over array elements for reading and writing data.

### Example:
```python
# Python
numbers = [0] * 5
for i in range(len(numbers)):
    numbers[i] = i * 10

for i in range(len(numbers)):
    print(numbers[i])

# JavaScript
let numbers = new Array(5);
for (let i = 0; i < numbers.length; i++) {
    numbers[i] = i * 10;
}

for (let i = 0; i < numbers.length; i++) {
    console.log(numbers[i]);
}

# C++
int numbers[5];
for (int i = 0; i < 5; i++) {
    numbers[i] = i * 10;
}

for (int i = 0; i < 5; i++) {
    std::cout << numbers[i] << std::endl;
}

# Java
int[] numbers = new int[5];
for (int i = 0; i < numbers.length; i++) {
    numbers[i] = i * 10;
}

for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

## Merging Data
Merging two arrays involves combining their elements into a new array.

### Example:
```python
# Python
array1 = [1, 2, 3]
array2 = [4, 5, 6]
mergedArray = array1 + array2

# JavaScript
let array1 = [1, 2, 3];
let array2 = [4, 5, 6];
let mergedArray = array1.concat(array2);

# C++
int array1[] = {1, 2, 3};
int array2[] = {4, 5, 6};
int mergedArray[6];
std::copy(array1, array1 + 3, mergedArray);
std::copy(array2, array2 + 3, mergedArray + 3);

# Java
int[] array1 = {1, 2, 3};
int[] array2 = {4, 5, 6};
int[] mergedArray = new int[array1.length + array2.length];
System.arraycopy(array1, 0, mergedArray, 0, array1.length);
System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
```

## Resizing the Array
Arrays have a fixed size in many languages. To resize an array, you need to create a new array with the desired size and copy the elements from the old array to the new one.

### Example:
```python
# Python
data = [1, 2, 3]
resizedArray = data + [0] * 2

# JavaScript
let data = [1, 2, 3];
let resizedArray = data.concat(new Array(2).fill(0));

# C++
int data[] = {1, 2, 3};
int resizedArray[5];
std::copy(data, data + 3, resizedArray);
resizedArray[3] = 0;
resizedArray[4] = 0;

# Java
int[] data = {1, 2, 3};
int[] resizedArray = new int[5];
System.arraycopy(data, 0, resizedArray, 0, data.length);
```

## Real World Scenarios

### Scenario 1: Managing Student Grades
A teacher needs to store and update student grades. Arrays can be used to store grades, and for loops can be used to calculate the average grade.

#### Example:
```python
# Python
grades = [85, 90, 78, 92, 88]
sum_grades = sum(grades)
average = sum_grades / len(grades)
print("Average grade:", average)

# JavaScript
let grades = [85, 90, 78, 92, 88];
let sumGrades = grades.reduce((a, b) => a + b, 0 ▋

```