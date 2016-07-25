import java.util.*;

public class Same {
    public boolean checkSam(String stringA, String stringB) {
        // write code here
        if (stringA == null && stringB == null)
        	return true;
        if(stringA == null || stringB == null || stringA.length() != stringB.length())
        	return false;
        int [] array = new int[128];
        for (int i = 0; i < stringA.length(); i++) {
        	array[stringA.charAt(i)]++;
        }
        for (int j = 0; j < stringB.length(); j++) {
        	array[stringB.charAt(j)]--;
        }
       	for (int k = 0; k < array.length; k++) {
       		if(array[k] != 0)
       			return false;
       	}
       	return true;
    }
}