package Level_1;

public class ReverseEachWordInString {

    public static String reverseEachWord(String str){
        
        String[] strArray = str.split(" ");
        
        String ans = "";

        for (int i = 0; i < strArray.length; i++) {
            String currString = strArray[i];
            char [] charArray = currString.toCharArray();
            int left = 0;
            int right = charArray.length - 1;

            while (left < right) {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }

            ans+=new String(charArray) + " ";

        } 
        return ans;
    }

    public static void main(String[] args) {
        String str = "Spring Boot is awesome";
        System.out.println(reverseEachWord(str));
    }
    
}
