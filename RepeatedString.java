import java.util.*;

public class RepeatedString{
	public static void main(String[] arg){
		String str1 = "abbcca";
		System.out.println(isRepeated(str1));
}

	public static boolean isRepeated(String str){
		boolean flag = true;
		int counter = 1;
		int counter2 = 1;
		char[] chArray = str.toCharArray();
		Arrays.sort(chArray);
		
		if(chArray.length>0){
		char prev = chArray[0];
		for(int i = 1; i<chArray.length;i++){
			if(i == chArray.length-1){
				counter2=0;
}
			if(prev!=chArray[i] && counter==1 ){
				flag = false;
}
			else if(prev!=chArray[i] && counter2==1){
				prev = chArray[i];
				counter = 1;
}
			else if(prev!=chArray[i] && counter2==0){
				flag = false;
}
			else{
				counter++;
}
}
}
	else{
		flag = false;	
}
		return flag;
}
	
}
