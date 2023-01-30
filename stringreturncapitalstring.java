// given a string,find its first uppercase letter and return the remaining substring 
//shorting from the upper case letter
public class stringreturncapitalstring {
    public static void main(String[] args) {
        String s="pradeep ushwaha Is a good boy";
         System.out.println(abc(s,0));
    }
    public static String abc(String s,int idx){
        if(idx==s.length())
        return "";
        if(Character.isUpperCase(s.charAt(idx)))
        return s.substring(idx);
        return abc(s,idx+1);
    }
}
