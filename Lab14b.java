//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;

public class Lab14b
{
	public static void main( String args[] )
	{
		int[] one = {1,2,3,4,5,6,7,8,9,10};
		int[] two = {1,2,3,9,11,20,30};
		int[] three = {9,8,7,6,5,4,3,2,0,-2};
		int[] four = {3,6,9,12,15,18,21,23,19,17,15,13,11,10,9,6,3,2,1,0};
		//add more test cases


		System.out.println(Arrays.toString(one));
		System.out.println("is going Up ?  " + ArrayFunHouseTwo.goingUp(one));
		System.out.println(Arrays.toString(two));
		System.out.println("is going Up ?  " + ArrayFunHouseTwo.goingUp(two));
		System.out.println(Arrays.toString(three));
		System.out.println("is going Up ?  " + ArrayFunHouseTwo.goingUp(three));
		System.out.println(Arrays.toString(four));
		System.out.println("is going Up ?  " + ArrayFunHouseTwo.goingUp(four));
		//add more test cases

		System.out.println("\n\n"+Arrays.toString(one));
		System.out.println("is going Down ?  " + ArrayFunHouseTwo.goingDown(one));
		System.out.println(Arrays.toString(two));
		System.out.println("is going Down ?  " + ArrayFunHouseTwo.goingDown(two));
		System.out.println(Arrays.toString(three));
        System.out.println("is going Down ?  " + ArrayFunHouseTwo.goingDown(three));
		System.out.println(Arrays.toString(four));
		System.out.println("is going Down ?  " + ArrayFunHouseTwo.goingDown(four));

		//add more test cases

		System.out.println("\n\n first 3 values greater than 8" + Arrays.toString(ArrayFunHouseTwo.getCountValuesBiggerThanX(two,3,8))  );

	}
}