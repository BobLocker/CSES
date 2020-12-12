### For more information see [cses](https://cses.fi/problemset/task/1090).
__________________________

[BACK TO MAIN MENU](../README.md)

### TASK

There are *n* children who want to go to a Ferris wheel, and your task is to find
a gondola for each child.

Each gondola may have one or two children in it, and in addition, the total weight
in a gondola may not exceed *x*. You know the weight of every child.

What is the minimum number of gondolas needed for the children?


**Input**

The first input line contains two integers *n* and *x*: the number of children and
the maximum allowed weight.

The next line contains *n* integers P1,P2,…,Pn: the weight of each child.

**Output**

Print one integer: the minimum number of gondolas.

### Example 1:
```
Input:
4 10
7 2 3 9
Output:
3
```

### Constraints:

* `1 <= n <= 2*10^5`
* `1 <= x <= 10^9`
* `1 <= Pi <= x`