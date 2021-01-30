import java.util.ArrayList;
import java.util.HashMap;

public class CharacterCounter {
    //class variables


    //constructor
    public CharacterCounter() {

    }

    //methods
    public void countCharacters(String wordToCount) {
        char[] arrayOfChars = wordToCount.toCharArray();
        //System.out.println(arrayOfChars[0]);
        HashMap<Character, Integer> myCharacterCount = new HashMap<>();
        for (int i = 0; i < arrayOfChars.length; i++) {
            //System.out.println(arrayOfChars[i]);

            //add or update the count each character in to the hash map

            char theCharacter = arrayOfChars[i];
            if (myCharacterCount.containsKey(theCharacter) == false) {
                //Does not contain the key
                myCharacterCount.put(theCharacter, 1);
                 } else {
                //does contain the key
                Integer theValue = myCharacterCount.get(theCharacter);
                theValue = theValue + 1;
                myCharacterCount.put(theCharacter, theValue);
            }


        }
        ArrayList<Character>myCharacterKeys = new ArrayList<>(myCharacterCount.keySet());
        for (int i = 0; i < myCharacterKeys.size(); i++) {
            Integer theVale = myCharacterCount.get(myCharacterKeys.get(i));
            System.out.println(myCharacterKeys.get(i) + ":" + theVale);
        }
    }
}
