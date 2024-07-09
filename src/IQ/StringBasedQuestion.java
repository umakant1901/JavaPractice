package IQ;

public class StringBasedQuestion {

    //  Reverse a String: Write a function to reverse a string in Java.

    //  Palindrome Check: Write a function to check if a given string is a palindrome or not.

    //  Anagram Check: Write a function to check if two strings are anagrams of each other.

    //  Factorial Calculation: Write a function to calculate the factorial of a number.

    //  Fibonacci Sequence: Write a function to generate the Fibonacci sequence up to a certain number of terms.

    //  Prime Number Check: Write a function to check if a given number is prime.

    // Sum of Array Elements: Write a function to calculate the sum of elements in an integer array.

    // Finding Duplicate Elements: Write a function to find duplicate elements in an array.

    // Sorting Algorithms: Implement sorting algorithms such as Bubble Sort, Selection Sort, or Merge Sort.

    // Binary Search: Write a function to perform a binary search on a sorted array.

    // Matrix Operations: Implement matrix addition, multiplication, or transpose operations.

    // Linked List Operations: Implement basic operations on a singly linked list (e.g., insertion, deletion, traversal).

    // Stack Implementation: Implement a stack data structure and its basic operations.

    // Queue Implementation: Implement a queue data structure and its basic operations.

    // Binary Tree Traversal: Implement depth-first search (inorder, preorder, postorder) on a binary tree.

    // Exception Handling: Write a program demonstrating various aspects of exception handling in Java.

    // File Handling: Write a program to read from and write to a file using Java I/O classes.

    // Concurrency: Implement a simple multithreading example using Java threads or ExecutorService.

    // String Manipulation: Write a program to count occurrences of each character in a string.

    // Regex Usage: Write a program to validate an email address using regular expressions.


    /*
    1. Reverse a String
    public class ReverseString {
    public static void main(String[] args) {
        String original = "Hello World";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}





2. Palindrome Check

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = checkPalindrome(str);
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean checkPalindrome(String str) {
        String reversed = reverseString(str);
        return str.equals(reversed);
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}





3. Anagram Check
import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean isAnagram = checkAnagram(str1, str2);
        if (isAnagram) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }
}







4. Factorial Calculation

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        long factorial = calculateFactorial(n);
        System.out.println("Factorial of " + n + " = " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}



5. Fibonacci Sequence
public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci sequence up to " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}





6. Prime Number Check
public class PrimeNumberCheck {
    public static void main(String[] args) {
        int num = 29;
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

7. Sum of Array Elements
public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = calculateSum(arr);
        System.out.println("Sum of array elements: " + sum);
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}



8. Finding Duplicate Elements

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 1};
        Map<Integer, Integer> map = findDuplicates(arr);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " is duplicate and occurred " + entry.getValue() + " times.");
            }
        }
    }

    public static Map<Integer, Integer> findDuplicates(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        return map;
    }
}


9. Sorting Algorithms (Bubble Sort)

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("\nSorted array:");
        printArray(arr);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}



10. Binary Search
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int key = 23;
        int index = binarySearch(arr, key);
        if (index != -1) {
            System.out.println(key + " found at index " + index);
        } else {
            System.out.println(key + " not found in the array.");
        }
    }

    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}



11. Matrix Operations (Matrix Addition)
public class MatrixAddition {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        System.out.println("Matrix 1:");
        printMatrix(matrix1);

        System.out.println("\nMatrix 2:");
        printMatrix(matrix2);

        int[][] result = addMatrices(matrix1, matrix2);

        System.out.println("\nResultant Matrix (Matrix1 + Matrix2):");
        printMatrix(result);
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}



12. Linked List Operations (Singly Linked List Insertion and Display)


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);

        System.out.println("Linked List:");
        list.display();
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}



13. Stack Implementation
import java.util.EmptyStackException;

public class StackImplementation {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack elements:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            throw new StackOverflowError("Stack is full");
        }
        stackArray[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}

14. Queue Implementation
import java.util.LinkedList;

public class QueueImplementation {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Queue elements:");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}

class Queue {
    private LinkedList<Integer> queue;

    public Queue() {
        queue = new LinkedList<>();
    }

    public void enqueue(int value) {
        queue.add(value);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return queue.removeFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}




15. Binary Tree Traversal (Inorder, Preorder, Postorder)

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class BinaryTreeTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Inorder traversal:");
        inorderTraversal(root);

        System.out.println("\nPreorder traversal:");
        preorderTraversal(root);

        System.out.println("\nPostorder traversal:");
        postorderTraversal(root);
    }

    public static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }

    public static void preorderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    public static void postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.val + " ");
        }
    }
}


16. Exception Handling

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistent_file.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}


17. File Handling (Read from File)

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReadingExample {
    public static void main(String[] args) {
        File file = new File("sample.txt");
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}




18. Concurrency (Multithreading Example)
public class MultithreadingExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task("Task 1"));
        Thread thread2 = new Thread(new Task("Task 2"));

        thread1.start();
        thread2.start();
    }
}

class Task implements Runnable {
    private String taskName;

    Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}





19. String Manipulation (Count Occurrences of Each Character)

import java.util.HashMap;
import java.util.Map;

public class CountCharacterOccurrences {
    public static void main(String[] args) {
        String str = "hello world";
        Map<Character, Integer> charCountMap = countCharacters(str);

        System.out.println("Character counts:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }

    public static Map<Character, Integer> countCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        return charCountMap;
    }
}



20. Regex Usage (Validate Email Address)

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmailAddress {
    public static void main(String[] args) {
        String[] emails = {
            "test@example.com",
            "invalid.email.com",
            "another.test@domain.co.uk",
            "email@domain@domain.com"
        };

        for (String email : emails) {
            if (isValidEmail(email)) {
                System.out.println(email + " is valid.");
            } else {
                System.out.println(email + " is not valid.");
            }
        }
    }

    public static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}


     */


}
