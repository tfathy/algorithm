package miu.exam;

public class Infinite {

	public static void main(String[] args) {
		Infinite i = new Infinite();
		int[] a = {3, 2, 3, 1};
		System.out.println(i.isInfinite(a));
	}

	int isInfinite(int[] a) {
		int result = 0;

		if (a.length == 0)
			return 0;
		if (a.length == 1) {
			if (a[0] > 0) {
				return 1;
			} else if (a[0] == 0) {
				return 0;
			} else if (a[0] < 0) {
				return -1;
			}
		}

		for (int i = 0; i < a.length; i++) {			
			if (a[i] == -1) {
				return -1;
			} else if (a[i] < -1 || a[i] >= a.length) {
				return 1;
			}

		}
		return result;
	}

}

/*
 * 
 * 2.Write a function that will iterate through an array a as follows. Start at a[0]. If a[0] is -1 return -1. If a[0] is less than -1 or greater than or equal to the length of the array (i.e., it can't be used to index an element of the array), return 1. Otherwise visit a[a[0]] and repeat these steps. This could potentially result in an infinite loop. If an infinite loop is detected the function should return a 0. 
To summarize: 
1.	iterate through the array using the value of an element as the index to the next element (like in a linked list)
2.	return -1 if a -1 encountered
3.	return 1 if a value less than -1 or greater than or equal to the size of the array is encountered.
4.	return 0 if an infinite loop is detected.
If you are programming in Java or C#, the function signature is
int isInfinite(int[ ] a)
If you are programming in C or C++, the function signature is
int isInfinite(int a[ ], int len) where len is the number of elements in the array 
Examples 
if the input array is	traversal	return
{1, 2, -1, 5}	visit a[0], a[1], a[2]	-1 (because -1 is encountered before the 5 is encountered)
{1, 2, 4, -1}	visit a[0], a[1], a[2]	1 (because 4, which is too big to be an index, is encountered before the -1)
{5, 3, 4, -1, 1, 2}	visit a[0], a[5], a[2], a[4], a[1], a[3]	-1 (because a[3] is -1)
{3}	visit a[0]	1 (because 3, which is too big to be an index, is encountered.)
{3, 2, 3, 1}	visit a[0], a[3], a[1], a[2], a[3], ...	0
{0}	visit a[0], a[0], ...	0
{-1}	visit a[0]	-1


  */

