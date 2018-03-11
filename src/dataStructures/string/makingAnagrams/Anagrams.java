package dataStructures.string.makingAnagrams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 Alice is taking a cryptography class and finding anagrams to be very useful. We consider two strings to be anagrams
 of each other if the first string's letters can be rearranged to form the second string. In other words, both strings
 must contain the same exact letters in the same exact frequency For example, bacdc and dcbac are anagrams,
 but bacdc and dcbad are not.

 Alice decides on an encryption scheme involving two large strings where encryption is dependent on the minimum number
 of character deletions required to make the two strings anagrams. Can you help her find this number?

 Given two strings,  and , that may or may not be of the same length, determine the minimum number of character
 deletions required to make  and  anagrams. Any characters can be deleted from either of the strings.

 Sample Input = cde, abc
 Sample Output = 4

 Explanation
 We delete the following characters from our two strings to turn them into anagrams of each other:

 1) Remove d and e from cde to get c.
 2) Remove a and b from abc to get c.

 We must delete  characters to make both strings anagrams, so we print  on a new line.

 */
public class Anagrams {
    public static int numberNeeded(String first, String second) {
        List<Character> chars = new ArrayList<>();
        for(Character c : first.toCharArray()) {
            chars.add(c);
        }

        List<Character> notFound = new ArrayList<>();
        for (Character c : second.toCharArray()) {
            if (chars.contains(c)) {
                chars.remove(c);
            } else {
                notFound.add(c);
            }
        }

        return chars.size() + notFound.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
