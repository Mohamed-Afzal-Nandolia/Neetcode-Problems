package TwoPointers.validPalindrome;

class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;//if the string is empty simply return true

        int head = 0, tail = s.length() - 1;//declaration
        char chead, ctail;

        while(head <= tail){//this loop will run until all the elements are checked
            chead = s.charAt(head);//first character from string s
            ctail = s.charAt(tail);//last character from string s

            if(!Character.isLetterOrDigit(chead)){//checks if character is not a letter or digit, then skip the index
                head++;
            }
            else if(!Character.isLetterOrDigit(ctail)){
                tail--;
            }
            else{//else make it lower case and check the values
                if(Character.toLowerCase(chead) != Character.toLowerCase(ctail)){
                    return false;
                }
                head++;//increment
                tail--;//decrement
            }

        }
        return true;
    }
}
