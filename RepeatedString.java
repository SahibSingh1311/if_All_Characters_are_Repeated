import java.util.*;

public class RepeatedString{
	public static void main(String[] arg){
		String str1 = "abcca";
		System.out.println(isRepeated(str1));
}

	public static boolean isRepeated(String str){
		boolean flag = true;								//will be returned after the execution of function
		int characterCounter = 1;							//character Counter i.e.
		boolean lastFlag = false;							//to check for last character and update flag
		char[] chArray = str.toCharArray();
		Arrays.sort(chArray);
		
		if(chArray.length>0){								//if String is non-empty, continue else switch flag to false 
		char prev = chArray[0];
		for(int i = 1; i<chArray.length;i++){ 
			if(i == chArray.length-1){ 						//for last element, switch counter2 to 0 #This is a special condition mainly used for Strings with odd number of Character
				lastFlag=true;
}
			if(prev!=chArray[i] && characterCounter==1 ){	//(After Sorting) chArray="aabbcc", so when current character is switched from a to b, flag will only be switched to false, if character counter is equal to 1
				flag = false;
}
			else if(prev!=chArray[i] && !lastFlag){			//if we are not handling last element, then the prev character will be updated to current character and the character counter will be reset to 0;
				prev = chArray[i];							//updating prev character
				characterCounter = 1;						//Reseting characterCounter to 1
}
			else if(prev!=chArray[i] && lastFlag){			//Updating flag to false if prev character is not equal to current.
				flag = false;								
}
			else{
				characterCounter++;
}
}
}
	else{
		flag = false;	//for empty strings
}
		return flag;
}
	
}
