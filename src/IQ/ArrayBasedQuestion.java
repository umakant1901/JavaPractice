package IQ;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayBasedQuestion {
    public static void main(String[] args) {

            int[] intArr={4,6,9,2,1,8,3,5,7,10,7,6,5,4,5};
            char[] charArr={'a','s','d','f','g','h','j','k','l','d','f','g','h'};





    }

//        Basic Level
//        01.  Write a Java program to find the sum of all elements in an array.
            public static int getSumOfAllElement(int[] intArr)
            {
                int sum=0;
                for(int i:intArr)
                {
                    sum+=i;
                }
                return sum;
            }

//        02.  Write a Java program to find the largest element in an array.

            public static int getMaximumNumberFromIntArray(int[] intArr)
            {
                int max=Integer.MIN_VALUE;
                for(int i:intArr)
                {
                    if(i>max)
                    {
                        max=i;
                    }
                }
                return max;
            }
//        03. Write a Java program to find the smallest element in an array.
                public static int getMinimumNumberFromIntArray(int[] intArr)
                {
                    int min=Integer.MAX_VALUE;
                        for (int i:intArr)
                        {
                            if(i<min)
                            {
                                min=i;
                            }
                        }
                        return min;
                    }


//        04. Write a Java program to reverse an array.

            public static void getReverseArray(char[] charArr)
            {
                char[] revArr=new char[charArr.length];

                for(int i=0,j=charArr.length-1;i<charArr.length;i++,j--)
                {
                    revArr[j]=charArr[i];
                }
                for(char c:revArr)
                {
                    System.out.print(c+" ");
                }

            }
//        05. Write a Java program to sort an array in ascending order.
            public static void getSortedArrUsingSortMethodInAscendingOrder(char[] charArr)
            {
                Arrays.sort(charArr);
                System.out.print(charArr);
            }

            public static void getSortedArrWithoutUsingSortMethodAscendingOrder(char[] charArr)
            {

                for(int i=0;i<charArr.length;i++)
                {
                    for(int j=i+1;j<charArr.length;j++)
                    {
                        char temp;
                        if(charArr[i]>charArr[j])
                        {
                            temp=charArr[i];
                            charArr[i]=charArr[j];
                            charArr[j]=temp;

                        }
                    }
                }

                for(char c:charArr)
                {
                    System.out.print(c+" ");
                }

            }
//        06. Write a Java program to sort an array in descending order.
            public static void getSortedArrayInDescendingOrder(char[] charArr)
            {
                for(int i=0;i<charArr.length;i++)
                {
                    for(int j=i+1;j<charArr.length;j++)
                    {
                        char temp;
                        if(charArr[i]<charArr[j])
                        {
                            temp=charArr[i];
                            charArr[i]=charArr[j];
                            charArr[j]=temp;
                        }
                    }
                }

                for(char c:charArr)
                {
                    System.out.print(c+" ");
                }

            }

//        07. Write a Java program to find the second largest element in an array.
            public static int getSecondHighestNumberFromArr(int[] intArr)
            {
                int highestNumber=Integer.MIN_VALUE;
                int secondHighest=Integer.MIN_VALUE;
                for(int num:intArr)
                {
                    if(num>highestNumber)
                    {
                        secondHighest=highestNumber;
                        highestNumber=num;
                    }else
                    {
                        if(num>secondHighest && num!=highestNumber)
                        {
                            secondHighest=num;

                        }                    }
                }
                return secondHighest;

            }
//        08. Write a Java program to find the second smallest element in an array.
            public static int getSecondLowestNumberFromArray(int[] intArr)
            {
                int lowestNum=Integer.MAX_VALUE;
                int secondLowestNum=Integer.MAX_VALUE;
                for(int num:intArr)
                {
                    if(num<lowestNum)
                    {
                        secondLowestNum=lowestNum;
                        lowestNum=num;
                    }else
                    {
                        if(secondLowestNum>num && num!=lowestNum)
                        {
                            secondLowestNum=num;
                        }
                    }

                }
                return secondLowestNum;
            }

//        09. Write a Java program to count the number of even and odd elements in an array.
            public static void getCountOfOddEvenNumber(int[] intArr)
            {
                int evencount=0,oddcount=0;
                for(int num:intArr)
                {
                    if(num%2==0)
                    {
                        evencount++;
                    }
                    else
                    {
                        oddcount++;
                    }
                }
                System.out.println("Number of even digit is : "+evencount);
                System.out.println("Number of odd digit is : "+oddcount);

            }
//        10. Write a Java program to remove duplicates from an array.
            public static void removeDuplicateCharFromAnArray(int[] intArr)
            {

                HashSet<Integer> hs=new HashSet<Integer>();

                for(int num:intArr)
                {
                    hs.add(num);
                }
                System.out.println(hs);

                int[] uniqueArr=new int[hs.size()];
                int i=0;
                for(int n:hs)
                {
                    uniqueArr[i++]=n;
                }

                System.out.println("To print Array...!");
                for(int m: uniqueArr)
                {
                    System.out.print(m+" ");
                }
            }



/*
        Intermediate Level
        Write a Java program to merge two arrays into a third array.
        Write a Java program to find the intersection of two arrays.
        Write a Java program to find the union of two arrays.
        Write a Java program to rotate an array by k positions.
        Write a Java program to find the contiguous subarray with the maximum sum (Kadane's Algorithm).
        Write a Java program to find the majority element in an array.
        Write a Java program to find the kth smallest element in an array.
        Write a Java program to move all zeroes to the end of an array while maintaining the relative order of the non-zero elements.
        Write a Java program to rearrange an array in such a way that the negative numbers come before the positive numbers.
        Write a Java program to find the two numbers in an array that add up to a given sum.
        Advanced Level
        Write a Java program to find the maximum product of two integers in an array.
        Write a Java program to find the subarray with the maximum product.
        Write a Java program to find the longest increasing subsequence in an array.
        Write a Java program to find the longest contiguous subarray with equal number of 0s and 1s.
        Write a Java program to find the minimum number of swaps required to sort an array.
        Write a Java program to find the minimum number of jumps to reach the end of the array.
        Write a Java program to find the maximum sum such that no two elements are adjacent (House Robber Problem).
        Write a Java program to find the smallest missing positive integer in an array.
        Write a Java program to find all the leaders in an array.
        Write a Java program to find the maximum difference between two elements such that the larger element appears after the smaller element.
        Expert Level
        Write a Java program to rearrange an array such that arr[i] becomes arr[arr[i]].
        Write a Java program to rearrange an array such that every second element is greater than its left and right elements.
        Write a Java program to find the median of two sorted arrays.
        Write a Java program to find the common elements in three sorted arrays.
        Write a Java program to find the smallest subarray with a sum greater than a given value.
        Write a Java program to find the subarray with the maximum XOR.
        Write a Java program to find the maximum length of subarray with the given sum.
        Write a Java program to find the smallest subarray with all occurrences of the most frequent element.
        Write a Java program to find the largest subarray with equal number of 0s, 1s, and 2s.
        Write a Java program to find the maximum sum of i * arr[i] among all rotations of a given array.
        Challenging Level
        Write a Java program to find the minimum length of unsorted subarray which, when sorted, sorts the entire array.
        Write a Java program to rearrange an array such that the first element is the maximum value, the second element is the minimum value, and so on.
        Write a Java program to find the maximum sum of a subarray with at least k elements.
        Write a Java program to find the next greater element for each element in an array.
        Write a Java program to find the maximum sum of pairs with specific difference in an array.
        Write a Java program to find the maximum distance between two occurrences of the same element in an array.
        Write a Java program to find the maximum size subarray with a sum of 0.
        Write a Java program to find the smallest positive integer that cannot be represented as the sum of any subset of a given array.
        Write a Java program to find the longest bitonic subarray.
        Write a Java program to count the number of subarrays having a given XOR.


         */





}
