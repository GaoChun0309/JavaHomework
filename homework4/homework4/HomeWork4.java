package homework4;

import java.util.Random;


public class HomeWork4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//生成随机数数组
		int arr[] = new int[10];
		Random input = new Random(1);
		
		System.out.println("生成的10个随机数为:");
		for( int i = 0; i < arr.length; i++){
			arr[i] = input.nextInt(100);
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		
		System.out.println("偶数索引的每个元素：");
		for( int i = 0; i < arr.length; i++){
			if( i % 2 == 0)
				System.out.print(arr[i]+"  ");	
		}
		System.out.println();
		
		System.out.println("每个偶数元素：");
		for( int i = 0; i < arr.length; i++){
			if( arr[i]%2==0)
				System.out.print(arr[i]+"  ");
		}
		System.out.println();
		
		System.out.println("逆序所有元素：");
		int temp[] = new int[arr.length];
		for( int i = 0; i < arr.length; i++) {
			temp[arr.length-i-1] = arr[i];
		}
		for( int i = 0; i< temp.length; i++) {
			System.out.print(temp[i]+"  ");
		}
		System.out.println();
		
		System.out.println("第一个元素和最后一个元素：");
		System.out.print(arr[0]+"  ");
		System.out.println(arr[arr.length-1]);
		
		
		
	}

}
