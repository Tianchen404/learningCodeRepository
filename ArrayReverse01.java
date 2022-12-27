package note;

public class ArrayReverse01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]= {11,22,33,44,55,66};
		
		//思路
		//1. 把 a1[0] 和 a1[5] 进行交换 {66,22,33,44,55,11}
		//2. 把 a1[1] 和 a1[4] 进行交换 {66,55,33,44,22,11}
		//3. 把 a1[2] 和 a1[3] 进行交换 {66,55,44,33,22,11}
		//4. 一共要交换 3 次 = a1.length / 2
		//5. 每次交换时，对应的下标 是 a1[i] 和 a1[a1.length - 1 -i]
		//代码

		int temp=0;
		int len=a1.length;//计算数组的长度
		for(int i=0;i<len/2;i++) {
			temp=a1[len-i-1];
			a1[len-i-1]=a1[i];
			a1[i]=temp;
			}
		
		System.out.println("===输出反转后数组===");
		for(int i=0;i<a1.length;i++) {
			System.out.print(a1[i]+"\t");
			}
		}
}