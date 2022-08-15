# if_All_Characters_are_Repeated
A java function that checks if all characters in the string are Repeated

A java function that takes String as input and returns true if all characters of Strings are repeated else false. P.S. I have only considered lowercase character and no special characters i.e. (a-z) and (0-9)

Test Case I: Input String- 'abab'
Create 3 flags, i.e. flag (this will be returned after execution of function, default: true), counter (this will be used to switch values of 'prev' and reset itself) and counter1 (this will be used to switch 'flag' for special cases like when string contains odd number of character).
Step 1: Convert String to Character Array using toCharArray and sorting it using Arrays.sort
Step 2: Checking if String is empty or not, if not empty then assigning 'prev' variable the first character of sorted String and enter for loop else switch flag to false
Step 3: Using 'for' loop to access all the characters of Char Array
Step 4: Switching counter1 to 0 when last character of sorted string is been tackled.
Step 5: Using nested if else to fetch desired result:

  			if(prev!=chArray[i] && counter==1 ){
				flag = false;
}
  This if block switches flag false only when prev character is not equal to current character and counter should be 1.
  
  else if(prev!=chArray[i] && counter2==1){
				prev = chArray[i];
				counter = 1;
}

  This else if block will update the value of prev varaible to current character and reset counter to 1 only when prev character is not equal to current charater and we are not dealing with last character i.e. counter2 should be 1
  
			else if(prev!=chArray[i] && counter2==0){
				flag = false;
}

  This block will update flag to false only when previous is not equal to current and we are dealing with last character.

else{
				counter++;
}

  And if previous character is equal to current character then counter will be incremented by 1 
  
Step 6: Return flag
