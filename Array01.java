package note;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个数组
		//1.double[] 表明这是一个double类型的数组
		//2.{3,5,1,3.4,2,50} 表明这是数组的值/元素，依次表示这是数组的第几个元素
		//3.
        double[] hens = {3,5,1,3.4,2,50};
        
        //遍历数组，得到所有元素的和，使用for循环
        //1.我们可以通过hens[下标]来访问数组的元素
        //  下标是从0开始编号的，比如第一个元素就是hens[0]
        //  第二个元素就是hens[1],依次类推
        //通过for循环就可以循环访问数组的值/元素
        //使用一个变量totalWeight来将这些元素累积起来
        System.out.println("---用数组解决---");
        //提示：可以通过数组名.length来获取数组的长度
        double totalWeight=0;
        for(int i=0;i<hens.length;i++) {
//        	System.out.println("第"+(i+1)+"个元素的值="+hens[i]);
        	totalWeight+=hens[i];	
        }
        System.out.println("这些鸡的总体重是"+totalWeight
    			+"平均体重是"+(totalWeight/hens.length));
	}

}
