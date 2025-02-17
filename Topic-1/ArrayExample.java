

// Write a Java program that demonstrates the following array operations: 
//initializing data, assigning data, using array indices with for-loops to read and write into an array, 
// merging two arrays, and resizing an array.
// Implement each of these operations in a single program and print the results to verify the operations.

public class ArrayExample {
    public static void main(String[] args) {
        // Initializing an array of size 5 with default values (0)
        int[] array = new int[5];
        
        // Initializing an array with predefined values
        int[] arrayWithValues = {1, 2, 3, 4, 5};

        // Assigning data to the 'array' using indices
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        // Reading and printing data from 'array' using a for loop
        System.out.println("Reading data from array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }

        // Reading and printing data from 'arrayWithValues' using a for loop
        System.out.println("Reading data from arrayWithValues:");
        for (int i = 0; i < arrayWithValues.length; i++) {
            System.out.println("Element at index " + i + ": " + arrayWithValues[i]);
        }

        // Merging two arrays 'array1' and 'array2' into a new array 'mergedArray'
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] mergedArray = new int[array1.length + array2.length];

        // Copying elements from 'array1' to 'mergedArray'
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        // Copying elements from 'array2' to 'mergedArray'
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        // Printing the merged array
        System.out.println("Merged array:");
        for (int value : mergedArray) {
            System.out.println(value);
        }

        // Resizing an array: Creating a new array 'resizedArray' of size 5
        int[] resizedArray = new int[5];
        // Copying elements from 'array1' to 'resizedArray'
        System.arraycopy(array1, 0, resizedArray, 0, array1.length);

        // Assigning new values to the remaining indices of 'resizedArray'
        resizedArray[3] = 4;
        resizedArray[4] = 5;

        // Printing the resized array
        System.out.println("Resized array:");
        for (int value : resizedArray) {
            System.out.println(value);
        }
    }
} 