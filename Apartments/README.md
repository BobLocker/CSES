### For more information see [cses](https://cses.fi/problemset/task/1084).
__________________________

[BACK TO MAIN MENU](../README.md)

### TASK

There are *n* applicants and *m* free apartments. Your task is to distribute the apartments
so that as many applicants as possible will get an apartment.

Each applicant has a desired apartment size, and they will accept any apartment whose
size is close enough to the desired size.

**Input**

The first input line has three integers *n*, *m*, and *k*: the number of applicants, the 
number of apartments, and the maximum allowed difference.

The next line contains *n* integers A1,A2,…,A*n*: the desired apartment size of each 
applicant. If the desired size of an applicant is *x*, he or she will accept any apartment
whose size is between *x−k* and *x+k*.

The last line contains m integers B1,B2,…,B*m*: the size of each apartment.

**Output**

Print one integer: the number of applicants who will get an apartment.

### Example 1:
```
Input:
4 3 5
60 45 80 60
30 60 75
Output:
2
```

### Constraints:

* `1 <= n,m <= 2*10^5`
* `1 <= k <= 10^9`
* `1 <= Ai,Bi <= 10^9`