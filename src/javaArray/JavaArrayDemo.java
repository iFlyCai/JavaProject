package javaArray;


public class JavaArrayDemo {
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	public static void JavaArrayDefine() {
//		数组的静态初始化 有长度 有元素
		int[] array1 = {1,2,4,5};
		System.out.println("数组长度:"+ array1.length);
		int[] array2 = new int[]{1,1,1,1,1};
		System.out.println("数组长度:"+ array2.length);
		
//		数组的动态初始化
		int[] intArray = new int[10] ;
		System.out.println("数组长度:"+intArray.length);
	}
	
	
	public static void main(String[] args) {
		JavaArrayDefine();
	}
	
	
}
