# Arrays in Programming

## Overview
An array is a collection of elements, typically of the same data type, stored in contiguous memory locations. Arrays allow for efficient access to elements using indices and are a fundamental data structure in many programming languages.

## Initializing Data in an Array
Arrays can be initialized in several ways, depending on the programming language. Here are examples in Java:

### Declaration and Initialization
```java
// Declaration and Initialization
int[] array = new int[5]; // Array of size 5, elements initialized to 0
int[] arrayWithValues = {1, 2, 3, 4, 5}; // Array with initial values

```

## Assigning Data to an Array
   Elements in an array can be assigned values using their index.

```

int[] array = new int[5];
array[0] = 10;
array[1] = 20;
array[2] = 30;
array[3] = 40;
array[4] = 50;

```

## Using Array Indices with For Loop to Read and Write

1. **Reading data**

```

int[] array = {10, 20, 30, 40, 50};
for (int i = 0; i < array.length; i++) {
    System.out.println("Element at index " + i + ": " + array[i]);
}


```

2. **Writing Data**

```

int[] array = new int[5];
for (int i = 0; i < array.length; i++) {
    array[i] = i * 10;
}

```

3. Merging Data

To merge two arrays, you can create a new array with a size equal to the sum of the two arrays and copy the elements.

```

int[] array1 = {1, 2, 3};
int[] array2 = {4, 5, 6};
int[] mergedArray = new int[array1.length + array2.length];

System.arraycopy(array1, 0, mergedArray, 0, array1.length);
System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

// Print merged array
for (int value : mergedArray) {
    System.out.println(value);
}

```


4. Resizing the Array

Arrays in Java have a fixed size. To "resize" an array, you need to create a new array and copy the elements.


```

int[] originalArray = {1, 2, 3};
int[] resizedArray = new int[5]; // New array with larger size

System.arraycopy(originalArray, 0, resizedArray, 0, originalArray.length);

// Assign new values to the resized array
resizedArray[3] = 4;
resizedArray[4] = 5;

// Print resized array
for (int value : resizedArray) {
    System.out.println(value);
}

```

## Example Code

```

public class ArrayExample {
    public static void main(String[] args) {
        // Initializing arrays
        int[] array = new int[5];
        int[] arrayWithValues = {1, 2, 3, 4, 5};

        // Assigning data to an array
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        // Reading data using for loop
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }

        // Merging arrays
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] mergedArray = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        System.out.println("Merged array:");
        for (int value : mergedArray) {
            System.out.println(value);
        }

        // Resizing array
        int[] resizedArray = new int[5];
        System.arraycopy(array1, 0, resizedArray, 0, array1.length);

        resizedArray[3] = 4;
        resizedArray[4] = 5;

        System.out.println("Resized array:");
        for (int value : resizedArray) {
            System.out.println(value);
        }
    }
}

```




```

Arrays are a fundamental data structure that provide efficient storage and access to a collection of elements. Understanding how to initialize, assign, read, write, merge, and resize arrays is crucial for effective programming. The examples provided demonstrate these operations in Java, but similar concepts apply to arrays in other programming languages.

```