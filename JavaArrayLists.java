import java.util.ArrayList;
public class JavaArrayLists {

    public static void main(String[] args) {
        char[] vowels = new char[5];

        ArrayList<Character> myChars = new ArrayList<>();
        myChars.add('a');
        myChars.add('e');
        myChars.add('o');
        myChars.add(2, 'i');
//        print(myChars);
        myChars.remove(1);
//        print(myChars);
        myChars.clear();
        print(myChars);

        ArrayList<Character> myChars1 = new ArrayList<>(myChars);



    }

    private static void print(ArrayList toPrint){
        for (int i = 0; i < toPrint.size(); i++ ) {
            System.out.println(toPrint.get(i));
        }
    }

}
