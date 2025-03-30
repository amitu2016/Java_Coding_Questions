package Level_1;

public class ReverseString {

    public static String reverseString(String str){
        //Convert the String to Character array
        char[] charStrings = str.toCharArray();
        // using two pointers
        int left = 0;
        int right = charStrings.length - 1;

        //Swapping the characters till they reach middle
        while(left < right){
            char temp = charStrings[left];
            charStrings[left] = charStrings[right];
            charStrings[right] = temp;
            left++;
            right--;
        }

        //Returning new string by combining character array
        return new String(charStrings);
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(reverseString(str));
    }
    
}
