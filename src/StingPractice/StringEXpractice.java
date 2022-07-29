package StingPractice;

public class StringEXpractice {
    static String s1="Ramana";
    static String s2="I love my country";
    static String s3=new String("All Indians are my brothers and systers");

    static String firstName="arjuna";
    static String lastName="falghuna";
    static String fullName;

    public static void main(String[] args) {
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        String result=s1.toUpperCase();
        int len=s1.length();
        System.out.println(s2.contains("country"));
        //fullName=firstName+lastName;
        fullName=firstName.concat(lastName);
        System.out.println(fullName);

        System.out.println("full name of the string is:"+fullName);

    }
}
