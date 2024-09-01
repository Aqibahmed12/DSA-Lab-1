public class task6{
    public static void main(String[] args) {
        
        String str1="radar";
        String str2 ="";
        char chr[]=new char[str1.length()];

        for (int i=str1.length()-1; i>=0; i--) {
            chr[i]=str1.charAt(i);
            str2+=""+chr[i];
        }

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("The word \""+str1+"\" is palindrome"); 
        }
        else {
            System.out.println("The word \""+str1+"\" is not palindrome");
        }
    }
}