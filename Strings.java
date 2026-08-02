public class Strings {

    /*
ADD       → append(), insert()
REMOVE    → delete(), deleteCharAt()
CHANGE    → setCharAt(), replace()
SEARCH    → indexOf(), lastIndexOf()
READ      → charAt(), substring()
ORDER     → reverse()
SIZE      → length(), capacity()
CONVERT   → toString()
     */
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();

        System.out.println(s);
        String pali ="madam";
        s.append(pali);
        s.reverse();
        if(s.toString().equals(pali)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
        System.out.println(s.capacity());
        System.out.println(s.charAt(1));
        System.out.println(s.length());
        System.out.println(s.replace(0,3,"happy"));

    }
}
