package com.dataStructure;

public class Merge_Two_Array {

	private void merge_two_in_thrid(int []x, int []y
			,int xs, int ys) {
		int l,i,j,k;
		l = xs+ys;
		i = 0; j= 0; k =0;
		int []z = new int[100];
		
		while(i < xs) {
			z[k] = x[i];
			i = i+1;
			k = k+1;
		}
		
		while(j < ys) {
			z[k] = y[j];
			k = k +1;
			j = j +1;
		}
		
		for(int a = 0; a<l; ++a) {
			System.out.print(z[a] + " ");
		}
	}
	
	private void merge_two_in_one(int []x, int[]y, int xs, int ys) {
		int i, j;
		i = xs;j =0;
		
		while(j < ys) {
			x[i] = y[j];
			i = i+1;
			j = j +1;
		}
		xs = i;
		for(i =0; i< xs; ++i) {
			System.out.println(x[i]);
		}
		
	}

}
