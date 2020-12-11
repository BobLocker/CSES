### For more information see [cses](https://cses.fi/problemset/task/1094).
__________________________

[BACK TO MAIN MENU](../README.md)

### TASK

You are given an array of *n* integers. You want to modify the array so that it is 
increasing, i.e., every element is at least as large as the previous element.

On each turn, you may increase the value of any element by one. What is the minimum
number of turns required?

**Input**

The first input line contains an integer *n*: the size of the array.

Then, the second line contains *n* integers X1,X2,…,Xn: the contents of the array.

**Output**

Print the minimum number of turns.

### Example 1:
```
Input:
5
3 2 5 1 7
Output:
5
```

### Constraints:

* `1 <= n <= 2*10^5`
* `1 <= Xi <= 10^9`