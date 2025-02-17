# Algorithms: Array Searching and Sorting

## Table of Contents
1. [Objectives](#objectives)
2. [Introduction](#introduction)
3. [Sorting Algorithms](#sorting-algorithms)
    - [Selection Sort](#selection-sort)
    - [Bubble Sort](#bubble-sort)
    - [Insertion Sort](#insertion-sort)
    - [Merge Sort](#merge-sort)
4. [Searching Algorithms](#searching-algorithms)
    - [Linear Search](#linear-search)
    - [Binary Search](#binary-search)
5. [Comparison of Algorithms](#comparison-of-algorithms)
6. [Real World Scenarios](#real-world-scenarios)

## Objectives
- Understand different array sorting algorithms and their implementation.
- Learn the principles and steps of various sorting techniques.
- Explore searching algorithms for finding elements in arrays.
- Compare the efficiency and use cases of different algorithms.
- Apply sorting and searching algorithms to real-world problems.

## Introduction
Arrays are fundamental data structures used to store collections of elements. Efficiently sorting and searching through arrays is crucial for optimizing performance in various applications. This document discusses common algorithms for sorting and searching arrays, including their principles, implementations, and use cases.

## Sorting Algorithms

### Selection Sort
Selection Sort is a simple comparison-based sorting algorithm. It works by dividing the array into two parts: the sorted part and the unsorted part. The algorithm repeatedly selects the smallest element from the unsorted part and swaps it with the first unsorted element.

#### Steps:
1. Find the smallest element in the unsorted part.
2. Swap it with the first unsorted element.
3. Move the boundary between the sorted and unsorted parts one element to the right.
4. Repeat until the array is sorted.

#### Pseudocode:
```python
def selection_sort(arr):
    n = len(arr)
    for i in range(n):
        min_index = i
        for j in range(i + 1, n):
            if arr[j] < arr[min_index]:
                min_index = j
        arr[i], arr[min_index] = arr[min_index], arr[i]
    return arr
```

### Bubble Sort
Bubble Sort is another simple comparison-based algorithm. It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process is repeated until the list is sorted.

#### Steps:
1. Compare adjacent elements and swap them if they are in the wrong order.
2. Repeat the process for each element in the array.
3. Continue until no more swaps are needed.

#### Pseudocode:
```python
def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
    return arr
```

### Insertion Sort
Insertion Sort builds the sorted array one element at a time. It selects an element and inserts it into its correct position in the already sorted part of the array.

#### Steps:
1. Start with the second element as the key.
2. Compare the key with elements before it and move elements that are greater than the key one position to the right.
3. Insert the key into its correct position.
4. Repeat for all elements.

#### Pseudocode:
```python
def insertion_sort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1
        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key
    return arr
```

### Merge Sort
Merge Sort is a divide-and-conquer algorithm. It divides the array into two halves, sorts each half recursively, and then merges the sorted halves.

#### Steps:
1. Divide the array into two halves.
2. Recursively sort each half.
3. Merge the two sorted halves into a single sorted array.

#### Pseudocode:
```python
def merge_sort(arr):
    if len(arr) > 1:
        mid = len(arr) // 2
        left_half = arr[:mid]
        right_half = arr[mid:]

        merge_sort(left_half)
        merge_sort(right_half)

        i = j = k = 0
        while i < len(left_half) and j < len(right_half):
            if left_half[i] < right_half[j]:
                arr[k] = left_half[i]
                i += 1
            else:
                arr[k] = right_half[j]
                j += 1
            k += 1

        while i < len(left_half):
            arr[k] = left_half[i]
            i += 1
            k += 1

        while j < len(right_half):
            arr[k] = right_half[j]
            j += 1
            k += 1
    return arr
```

## Searching Algorithms

### Linear Search
Linear Search is a simple searching algorithm that checks each element of the array sequentially until the target element is found or the end of the array is reached.

#### Steps:
1. Start from the first element.
2. Compare each element with the target element.
3. Return the index if the target element is found.
4. Return -1 if the target element is not found.

#### Pseudocode:
```python
def linear_search(arr, target):
    for i in range(len(arr)):
        if arr[i] == target:
            return i
    return -1
```

### Binary Search
Binary Search is an efficient searching algorithm that works on sorted arrays. It repeatedly divides the array in half, eliminating the half that does not contain the target element.

#### Steps:
1. Find the middle element of the array.
2. Compare the middle element with the target element.
3. If the middle element is equal to the target, return the index.
4. If the target is less than the middle element, repeat the search on the left half.
5. If the target is greater than the middle element, repeat the search on the right half.

#### Pseudocode:
```python
def binary_search(arr, target):
    low = 0
    high = len(arr) - 1
    while low <= high:
        mid = (low + high) // 2
        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            low = mid + 1
        else:
            high = mid - 1
    return -1
```

## Comparison of Algorithms

| Algorithm       | Time Complexity (Best) | Time Complexity (Average) | Time Complexity (Worst) | Space Complexity |
|-----------------|-------------------------|---------------------------|-------------------------|------------------|
| Selection Sort  | O(n^2)                  | O(n^2)                    | O(n^2)                  | O(1)             |
| Bubble Sort     | O(n)                    | O(n^2)                    | O(n^2)                  | O(1)             |
| Insertion Sort  | O(n)                    | O(n^2)                    | O(n^2)                  | O(1)             |
| Merge Sort      | O(n log n)              | O(n log n)                | O(n log n)              | O(n)             |
| Linear Search   | O(1)                    | O(n)                      | O(n)                    | O(1)             |
| Binary Search   | O(1)                    | O(log n)                  | O(log n)                | O(1)             |

## Real World Scenarios

### Scenario 1: Sorting Student Grades
A teacher needs to sort student grades from lowest to highest. Using a sorting algorithm like Merge Sort ensures that the grades are sorted efficiently, even for large class sizes.

### Scenario 2: Searching in a Contact List
A user wants to find a specific contact in their phone's contact list. Binary Search can be used if the contact list is sorted alphabetically, allowing the user to find the contact quickly.

### Scenario 3: Inventory Management
A retail store needs to search for a specific product in its inventory. Linear Search can be used for small inventories, while Binary Search is more efficient for larger, sorted inventories.

### Scenario 4: Real-Time Data Processing
A financial system processes and sorts transaction data in real-time. Insertion Sort can be used for real-time data where new transactions are continuously added and need to be inserted into the sorted list.

### Scenario 5: Data Analysis
A data analyst needs to sort and search through large datasets. Efficient algorithms like Merge Sort for sorting and Binary Search for searching are essential for handling large volumes of data quickly and accurately.
