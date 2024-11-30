import java.util.Arrays;

public class ArrCharOps {
    public static void main(String[] args) {
        String str = "clearly";
        char[] arr1 = { 'c', 'l', 'e', 'a', 'r', 'l', 'y' };
        char[] arr2 = { 'U', 'n', 'd', 'e', 'r', 's', 't', 'o', 'o', 'd' };
        System.out.println(str); // Prints the string
        println(arr1); // Prints an array of characters
        System.out.println(charAt(arr1, 2));
        System.out.println(indexOf(arr1, 'l'));
        System.out.println(indexOf(arr1, 'l', 3));
        System.out.println(lastIndexOf(arr1, 'l'));
        System.out.println(concat(arr1, arr2));
        System.out.println(subArray(arr2, 2, 9));
        System.out.println(compareTo("abcd", "abcd"));
        System.out.println(compareTo("abc", "abcd"));
        System.out.println(compareTo("abw", "abcd"));
        System.out.println(compareTo("Abcd", "a"));
        System.out.println(compareTo("apple", "banana"));
        System.out.println(compareTo("apple", "applepie"));
        System.out.println(compareTo("Zoo", "zoo"));
        System.out.println(hashCode(arr1));
        System.out.println(hashCode(arr2));
    }

    public static void println(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static char charAt(char[] arr, int index) {
        return arr[index];
    }

    public static boolean equals(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int indexOf(char[] arr, char ch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(char[] arr, char ch, int fromIndex) {
        for (int i = fromIndex; i < arr.length; i++) {
            if (arr[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    public static int lastIndexOf(char[] arr, char ch) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    public static char[] concat(char[] arr1, char[] arr2) {
        char[] arrsum = new char[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arrsum[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arrsum[arr1.length + i] = arr2[i];
        }
        return arrsum;
    }

    public static char[] subArray(char[] arr, int beginIndex, int endIndex) {
        if (beginIndex < 0 || endIndex > arr.length || beginIndex > endIndex) {
            throw new IllegalArgumentException("Invalid subarray indices");
        }
        char[] subing = new char[endIndex - beginIndex];
        for (int i = 0; i < subing.length; i++) {
            subing[i] = arr[beginIndex + i];
        }
        return subing;
    }

    public static long hashCode(char[] arr) {
        long hash = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            hash += arr[i] * (long) Math.pow(7, n - i - 1);
        }
        return hash;
    }

    public static String lowerCase(String str) {
        if (str == null) {
            return ""; 
        }
    
        StringBuilder result = new StringBuilder();
    
       
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
    
          
            if (c >= 'A' && c <= 'Z') {
                
                c = (char) (c + 32);
            }
    
            result.append(c);
        }
    
        
        return result.toString();
    }
    public static int compareTo(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return -2; 
        }
    
        
        str1 = lowerCase(str1);
        str2 = lowerCase(str2);
    
        int len1 = str1.length();
        int len2 = str2.length();
    
        for (int i = 0; i < Math.min(len1, len2); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
    
            if (c1 != c2) {
                return c1 - c2;  
            }
        }
    
        if (len1 < len2) {
            return -1; // str1 is shorter, so it's lexicographically smaller
        } else if (len1 > len2) {
            return 1; // str1 is longer, so it's lexicographically greater
        }
    
        return 0; // Both strings are equal
    }
}    

