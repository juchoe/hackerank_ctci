package dataStructures.string.makingAnagrams;

import org.junit.Test;

import static dataStructures.string.makingAnagrams.Anagrams.numberNeeded;
import static org.junit.Assert.assertEquals;

/**
 * Created by Ju-Desktop on 3/9/2018.
 */
public class AnagramsTest {
    @Test
    public void sampleTest() {
        String first = "cde";
        String second = "abc";

        assertEquals(4, numberNeeded(first, second));
    }

    @Test
    public void duplicatedCharacters() {
        String first = "cde";
        String second = "abbc";

        assertEquals(5, numberNeeded(first, second));
    }

}
