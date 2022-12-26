package note;

public class ArrayPractice2 {

	public static void main(String[] args) {
		//2.求一个整型数组的最大值，并输出对应的下标
		int table[]= {4,-1,9,10,23};
		int max=table[0];//假定第一个元素就是最大值
		int maxIndex=0;//假定最大元素下标是0
		
		for(int i=1;i<table.length;i++) {//从下标1开始,遍历table
			if(max<table[i]) {//如果max小于当前元素
				max=table[i];
			    maxIndex=i;
			}
		}
		
		System.out.println("max="+max+"; "+"maxIndex="+maxIndex);
}
}
