public class Main {
    public static void main(String[] args) {

        String veryLongString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        System.out.println(veryLongString.replace("um", "HUM"));

        String sub1= "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut";
        String sub2 = "aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        System.out.println(sub1.replaceFirst("\\s", ""));
        System.out.println(sub1.replaceAll("\\s", ""));
        System.out.println(sub2.replaceFirst("\\s", ""));
        System.out.println(sub2.replaceAll("\\s", ""));
        System.out.println(sub1.contains("est"));
        System.out.println(sub2.contains("est"));
    }
}


/*You have a very long string veryLongString with the following value:


    change all the occurrences of um with HUM
    divide veryLongString in 2 parts from the word aliquip, assigning them to sub1 and sub2
    print sub1 and sub2 values without any space at the beginning and at the end of the string
    search for est in sub1 and in sub2, printing the result of exclusive or of the 2 searches */
