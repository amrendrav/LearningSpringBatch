package AiseHi;

public class ClassToFindFirstIndex {

    private static final int char_count = 256;
    private static char count[] = new char[char_count];

    public static void main(String[] args) {
        System.out.println(findIndexOfFirstUniqueChar("whatever"));
    }

    static String findIndexOfFirstUniqueChar(String string){
        int index = -1, j;
        countChar(string.toLowerCase());
        for ( j = 0; j < string.length(); j++) {
            if (count[string.toLowerCase().charAt(j)] == 1){
                index = j;
                break;
            }
        }
        return "First Unique Char is "+ "\'" + string.charAt(index) + "\'"+" at index number : "+index;
    }

    static void countChar(String str){

        for(int i=0; i < str.length(); i++){
            count[str.charAt(i)]++;
        }

    }
}
