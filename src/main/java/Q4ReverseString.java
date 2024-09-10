// src/main/java/Q4ReverseString.java

public class Q4ReverseString {

    public static String reverse(String s) {
        
        if (s == null || s.length() <= 1) {
            return s;
        }
        
        return reverse(s.substring(1)) + s.charAt(0);
        
        
        /*String returnString = "";
        if(s.length() > returnString.length()){
            reverse(s);
            returnString += s.substring(returnString.length() , returnString.length() + 1);
        }
        if(s.length() == returnString.length()){
            
            return returnString;
        }
        else{
            return "error";
        }
            */
    }
}