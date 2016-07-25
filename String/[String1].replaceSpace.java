/*
题目描述
请实现一个函数，将一个字符串中的空格替换成“%20”。
例如，当字符串为We Are Happy.则经过替换之后的字符串为
We%20Are%20Happy。
*/
public class Solution {
    public String replaceSpace(StringBuffer str) {
    	if(str == null || str.length() == 0)
    		return "";
    	for (int i = 0; i < str.length(); i++) {
    		if (str.charAt(i) == ' '){
    			str.deleteCharAt(i);
    			str.insert(i, "%20");
    		}
    	}
    	return str.toString();
    }

//当提供的参数为String的时候
    public String replaceSpace(String str){
    	if(str == null || str.length() == 0)
    		return "";

    	int newLen = 0;
    	for (int i = 0; i < str.length(); i++) {
    		if (str.charAt(i) == ' ')
    			newLen += 3;
    		else
    			newLen ++;
    	}

    	char[] array = new char[newLen];
    	for (int j = 0, k = 0; j < str.length(); j++) {
    		if(str.charAt(j) == ' ') {
    			array[k++] = '%';
    			array[k++] = '2';
    			array[k++] = '0';
    		}else{
    			array[k++] = str.charAt(j);
    		}
    	}

    	return String.valueOf(array);
    }
}

/*
解题思路
1.防御式编程，同时排出极端条件。
2.借助于StringBuffer提供的函数解决。

变型
解法1.当参数为String的时候，可以将其转化成StirngBuffer求解
解法2.复杂度在N下，通过遍历获取空格，然后得出变化后string的长度，
然后遍历，动态添加。
*/