/*
题目描述
请实现一个算法，确定一个字符串的所有字符是否全都不同。这里我们要求不允许使用额外的存储结构。
给定一个string iniString，请返回一个bool值,True代表所有字符全都不同，False代表存在
相同的字符。保证字符串中的字符为ASCII字符。字符串的长度小于等于3000。
测试样例：
"aeiou"
返回：True
*/
import java.util.*;

public class Different {
	//使用额外的存储空间
    public static boolean checkDifferent(String iniString) {
    	if (iniString == null || iniString.length() == 0)
    		return true;
        int[] hashTable = new int[65536];
        for (int i = 0; i < iniString.length(); i++) {
        	if (hashTable[iniString.charAt(i)]++ == 1)
        		return false;
        }
        return true;
    }

    public boolean checkDifferent(String iniString) {
        // write code here
        return !iniString.matches(".*(.).*(\\1).*");
    }

    public static void main(String[] args){
    	System.out.println(checkDifferent("acbdbesy"));
    }
}

//第二种方式通过一个