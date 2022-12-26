package note;

public class ArrayPractice1 {

	public static void main(String[] args) {
		// 1.使用数组，循环打印26个英文字母
        char chars[]=new char[26];
        
        for(int i=0;i<chars.length;i++) {//循环赋值26个英文字母
        	//chars是char[]
        	//chars[i]是int类型
        	chars[i]=(char)('A'+i);//'A'+i 是int,需要强制转换
        }
        
        System.out.println("===输出26个字母===");
        for(int i=0;i<chars.length;i++) {//循环26次
        	System.out.print(chars[i]+" ");
        }
        
        }
	}


