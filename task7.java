import java.util.Arrays;
public class task7{
    public static void main(String[] args) {
        
        String str1="silent";
        String str2 ="listen";
        char chr1[]=str1.toCharArray();
        char chr2[]=str2.toCharArray();
        Arrays.sort(chr1);
        Arrays.sort(chr2);

        if(Arrays.equals(chr1, chr2)){
            System.out.println("\""+str1+"\" and \""+str2+"\" are Anagram");
        }else{
            System.out.println("\""+str1+"\" and \""+str2+"\" are not anagram");
        }
    }
}