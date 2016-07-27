/**
*基本字符串压缩
*题目描述
*
*利用字符重复出现的次数，编写一个方法，实现基本的字符串压缩功能。比如，字符串“aabcccccaaa”经压缩会变成“a2b1c5a3”。若压缩后的字符串没有变短，则返回原先的字符串。
*给定一个string iniString为待压缩的串(长度小于等于3000)，保证串内字符均由大小写英文字母组成，返回一个string，为所求的压缩后或未变化的串。
*测试样例
*"aabcccccaaa"
*返回："a2b1c5a3"
*"welcometonowcoderrrrr"
*返回："welcometonowcoderrrrr"
**/
import java.util.*;

public class Zipper {
    public String zipString(String iniString) {
        // write code here
        if(iniString == null || iniString.length()<=1 )
        	return iniString;
       	int num = 1;
       	char tmp = iniString.charAt(0);
       	StringBuilder bulider = new StringBuilder();
       	for (int i = 1; i<iniString.length(); i++){
       		if (iniString.charAt(i) == tmp){
       			num++;
       		}else{
       			bulider.append(tmp);
       			bulider.append(""+num);
       			num = 1;
       			tmp = iniString.charAt(i);
       		}
       	}
       	bulider.append(tmp);
       	bulider.append(""+num);
       	return bulider.length() < iniString.length() ? bulider.toString() : iniString;
    }
}

//解题思路
//考虑到一些极端情况，做算法题在进行解决的时候可以靠着
//对于极端情况的判断来进行